package Quiz;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext; 
import classes.*;
import bancoPerguntas.*;


public class Compiler extends quizBaseVisitor<ST> {
   
   protected HashMap<String, HashMap<String,Question>> bancosP = new HashMap<>();
   protected STGroup stg =null;
   protected int count;
   protected String target = "java"; // default
   protected ArrayList<String> options = new ArrayList<>();
   protected HashMap<String, String> options_ids = new HashMap<>();
   

   //done
   public boolean validTarget(String target) {
      File f = new File(target+".stg");

      return (f.exists() && f.isFile() && f.canRead());
   }


   //done
   public void setTarget(String target) {
      assert validTarget(target);
      
      this.target = target;
   }


   // done
   @Override public ST visitProgram(quizParser.ProgramContext ctx) {

      stg = new STGroupFile("./java.stg");
      ST res = stg.getInstanceOf("module");

      for (quizParser.StatContext stat : ctx.stat()) {
         res.add("stat", visit(stat));
      }
      return res;
   }
   

   // done
   @Override public ST visitStat(quizParser.StatContext ctx) {
      ST res = stg.getInstanceOf("stats");
      
      for (quizParser.ExprContext exp : ctx.expr()) {
         res.add("stat", visit(exp));
      }
      return res;
   }


   // done
   @Override public ST visitExpr(quizParser.ExprContext ctx) {
      return visitChildren(ctx);
   }


   // done
   @Override public ST visitCreateQuiz(quizParser.CreateQuizContext ctx) {
      
      String quizname = ctx.STRING().getText();

      ST res = stg.getInstanceOf("createQuiz");
      res.add("quizname", quizname); 
      return res;
   }


   // done
   @Override public ST visitCreateQuizCorrection(quizParser.CreateQuizCorrectionContext ctx) {
      ST res = stg.getInstanceOf("createQuizAutoCorrective");  //no stg o createquizautocorrective pode chamar o módulo do createquiz normal
      String quizname = ctx.STRING().getText(); 
      res.add("quizname", quizname); 
      res.add("number", ctx.NUMBER());
      return res;
   }


   // done
   @Override public ST visitCreateReport(quizParser.CreateReportContext ctx) {
      ST res = stg.getInstanceOf("createreport");
      return res;
   }


   // done
   @Override public ST visitCreateGroup(quizParser.CreateGroupContext ctx) {
      String id = ctx.NAME().getText();
      
      ST res = stg.getInstanceOf("createGroup");
      res.add("id", id);
      return res; 
   }


   // done
   @Override public ST visitCreateMultiGroup(quizParser.CreateMultiGroupContext ctx) {

      ST res = stg.getInstanceOf("createMultiGroup");
      for (TerminalNode group : ctx.NAME()) {
         ST group2 = stg.getInstanceOf("createGroup");
         String group_id = group.getText();
         group2.add("id", group_id);
         res.add("stat",group2.render());
      }
      return res;
   }


   // done
   @Override public ST visitAddOption(quizParser.AddOptionContext ctx) {

      String option = ctx.NAME().getText();
      ST res = stg.getInstanceOf("addOption");
      res.add("option", option);
      String str = "";  

      for (TerminalNode t : ctx.sub_question().NAME()) {
         str += '"' + t.getText() + '"' + "," ;
      }
      str = str.substring(0,str.length()-1);
      res.add("array",str);
      return res; 
   }


   //  done
   @Override public ST visitAddAll(quizParser.AddAllContext ctx) {

      String option = ctx.NAME().getText();
      ST res = stg.getInstanceOf("addOptionAll");
      res.add("opt",option);
      return res;
   }


   //done
   @Override public ST visitAddQuestion2Group(quizParser.AddQuestion2GroupContext ctx) {

      ST res = stg.getInstanceOf("addQuestion2Group");
      ArrayList<String> sub_questions = new ArrayList<String>();
      for (TerminalNode t : ctx.sub_question().NAME()){
         sub_questions.add(t.getText());
      }
    
      ArrayList<String> sub_groups = new ArrayList<String>();
      for (TerminalNode g : ctx.sub_groups().NAME()) {
         sub_groups.add(g.getText());
      }
      
      String listString1 = String.join(",", sub_questions);
      String listString2 = String.join(",", sub_groups);
      
      res.add("questions",listString1);
      res.add("groups",listString2);
      return res;
   }
   

   //done
   @Override public ST visitSub_question(quizParser.Sub_questionContext ctx) {
      return visitChildren(ctx);
   }


   //done
   @Override public ST visitSub_groups(quizParser.Sub_groupsContext ctx) {
      return visitChildren(ctx);
   }


   // done
   @Override public ST visitLoadBanco(quizParser.LoadBancoContext ctx) {
      
      String fileName = "../examples/" + ctx.STRING().getText().replace("\"", "");
      

      // fazer verificação do banco de perguntas

      HashMap<String,Question> perguntas_banco = bancoPerguntas.bancopMain.loadBancoPerguntas(fileName);
      bancosP.put(ctx.NAME().getText(), perguntas_banco);
      //agora no import so tem que ver a key do bancoP, para saberem qual é o banco de perguntas que querem
      // e  tirar de lá a pergunta, a pergunta já tem as opções la definidas
      
      return visitChildren(ctx);
   }


   //done
   @Override public ST visitEliminar(quizParser.EliminarContext ctx) {
      // ex: remove o2 to P1
      ST res = stg.getInstanceOf("eliminar");
      String option_id = ctx.NAME(0).getText();
      String question_id = ctx.NAME(1).getText();
      res.add("option",option_id);
      res.add("question",question_id);
      return res;
   }


   // done
   @Override public ST visitDefinirResposta(quizParser.DefinirRespostaContext ctx) {

      ST res = stg.getInstanceOf("definirResposta");
      ArrayList<String> sub_questions = new ArrayList<String>();
      for (TerminalNode t : ctx.sub_question().NAME()){  
         sub_questions.add(t.getText());
      }
      String sub_question_string = String.join(",", sub_questions);
      String option_id = ctx.NAME().getText();
      
      res.add("option",option_id);
      res.add("questions",sub_question_string);
      return res;
   }

   // done
   @Override public ST visitDefinirCotacaoSemDesconto(quizParser.DefinirCotacaoSemDescontoContext ctx) {

      ST res = stg.getInstanceOf("definirCotacaoSemDesconto");
      Double mark =null;
      if (ctx.mark().NUMBER() != null) {
         mark = Double.parseDouble(ctx.mark().NUMBER().getText());
      } else if (ctx.mark().FLOAT() != null) {
         mark = Double.parseDouble(ctx.mark().FLOAT().getText());
      }
      String question_id = ctx.NAME().getText();
      System.out.println(mark);
      res.add("mark",mark);
      res.add("question",question_id);
      return res;
   }

   
   // done
   @Override public ST visitDefinirCotacaoMudaPergunta(quizParser.DefinirCotacaoMudaPerguntaContext ctx) {

      // define-mark 4 to P4 if wrong show P3
      //define-mark' mark 'to' NAME 'if' 'wrong' 'show' NAME  NEWLINE  
      ST res = stg.getInstanceOf("definirCotacaoMudaPergunta");

      Double mark = null;
      if (ctx.mark().NUMBER() != null) {
         mark = Double.parseDouble(ctx.mark().NUMBER().getText());
      } else if (ctx.mark().FLOAT() != null) {
         mark = Double.parseDouble(ctx.mark().FLOAT().getText());
      }
      String question_id = ctx.NAME(0).getText();
      String wrong_question = ctx.NAME(1).getText();
      res.add("mark",mark);
      res.add("question_id",question_id);
      res.add("wrong_question",wrong_question);
      
      return res;
   } 
   
   
   // done
   @Override public ST visitDefinirCotacaoDescontar(quizParser.DefinirCotacaoDescontarContext ctx) {
      ST res= stg.getInstanceOf("DefinirCotacaoDescontar");
      Double mark = null;
      if (ctx.mark(0).NUMBER() != null) {
         mark = Double.parseDouble(ctx.mark(0).NUMBER().getText());
      } else if (ctx.mark(0).FLOAT() != null) {
         mark = Double.parseDouble(ctx.mark(0).FLOAT().getText());
      }
      String qid = ctx.NAME().getText();
      Double tries = Double.parseDouble(ctx.NUMBER().toString());
      Double discount = null;
      if (ctx.mark(1).NUMBER() != null) {
         discount = Double.parseDouble(ctx.mark(1).NUMBER().getText());
      } else if (ctx.mark(1).FLOAT() != null) {
         discount = Double.parseDouble(ctx.mark(1).FLOAT().getText());
      }
     
      res.add("mark", mark);
      res.add("question", qid);
      res.add("n_repeat", tries);
      res.add("discount", discount);
      return res;
   }


   //done
   @Override public ST visitMark(quizParser.MarkContext ctx) {
      return visitChildren(ctx);
   }


   //done
   @Override public ST visitShowGroup(quizParser.ShowGroupContext ctx) {
      ST res = stg.getInstanceOf("showGroup");
      String group_id = ctx.NAME().getText();
      res.add("groupname",group_id);
      if (ctx.showOpt()!= null){
         for (quizParser.ShowOptContext showOpt : ctx.showOpt()) {
            res.add("stat", visit(showOpt));
         }
      }
      return res;
   } 
   

   //done
   @Override public ST visitShowOpt(quizParser.ShowOptContext ctx) {
      return visitChildren(ctx);
   }
   
   //done
   @Override public ST visitAvaliar(quizParser.AvaliarContext ctx) {
      ST res= stg.getInstanceOf("evaluate");
      for (quizParser.DefineMarkContext define : ctx.defineMark()) {
         res.add("stat", visit(define));
      }
      return res;
   }


   //done
   @Override public ST visitMultichoice(quizParser.MultichoiceContext ctx) {
       ST res = stg.getInstanceOf("multichoice");
      String id = ctx.NAME().getText();
      String title = ctx.title().STRING().getText();
      
      ArrayList<String> multichoiceoptions = new ArrayList<String>();

      if(ctx.multichoiceoption() != null){
         Iterator<quizParser.MultichoiceoptionContext> iterador = ctx.multichoiceoption().iterator();
         while(iterador.hasNext()){
            quizParser.MultichoiceoptionContext it = iterador.next();
            String opt_id = '"' + it.NAME().getText() + '"';
            String opt_text = it.STRING().getText();

            multichoiceoptions.add(opt_id);
            multichoiceoptions.add(opt_text);
         }
      } 

      String listString = String.join(",", multichoiceoptions);
      int numOptions = multichoiceoptions.size();

      res.add("id", id);
      res.add("title", title);
      res.add("options",listString);
      res.add("num",numOptions);


      return res;
   }


   //done
   @Override public ST visitMultichoiceoption(quizParser.MultichoiceoptionContext ctx) {
      return visitChildren(ctx);
   }


   //done
   @Override public ST visitMatching(quizParser.MatchingContext ctx) {
      ST res = stg.getInstanceOf("matching");

      String id = ctx.NAME().getText();
      String text = ctx.title().getText();
      
      res.add("id",id);
      res.add("title", text);

      ArrayList<String> matchingoptions = new ArrayList<String>();
      if(ctx.matchingoption()!=null){
         Iterator <quizParser.MatchingoptionContext> it = ctx.matchingoption().iterator();
         while(it.hasNext()){
            quizParser.MatchingoptionContext line = it.next();

            String opt_id = '"' + line.NAME().getText() + '"';
            String opt_text = line.title().STRING().getText();
            String opt_side = line.CORRECT().getText();
            String opt_match = '"' + line.match().NAME().getText() + '"';

            matchingoptions.add(opt_id);
            matchingoptions.add(opt_text);
            matchingoptions.add(opt_side);
            matchingoptions.add(opt_match);
         }
      }
      String listString = String.join(",", matchingoptions);
      res.add("options",listString);
      res.add("num",matchingoptions.size());
      return res;
   }


   //done
   @Override public ST visitMatchingoption(quizParser.MatchingoptionContext ctx) {
      return visitChildren(ctx);
   }


   //done
   @Override public ST visitMatch(quizParser.MatchContext ctx) {
      return visitChildren(ctx);
   }

   //done
   @Override public ST visitImport_expr(quizParser.Import_exprContext ctx) {
      //criar as perguntas que são obtidas a partir do load
      ST res = stg.getInstanceOf("import_expr");
      String id;

      for (quizParser.PContext p : ctx.plist().p()) {
         
         if (p.NAME(1) != null) {
            id = p.NAME(1).getText();
         }
         else {
            id = p.NAME(0).getText();
         }

         String tipo = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getType(); //aqui tem o tipo de pergunta
         ArrayList<String> options = new ArrayList<>();
         ArrayList<String> options_text = new ArrayList<>();
         String text;

         switch(tipo){
            
            case "MultiChoice":
               
               ST tmu = stg.getInstanceOf("multichoice");
               text  = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getText();
               options =  bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOptions(); //aqui estao todas as opções associadas a essa pergunta

               for (String opt : options) {
                  options_text.add('"' + opt + '"');
                  String optext = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOption(opt).getText();
                  options_text.add(optext);
               }

               String listString = String.join(",", options_text);
               
               tmu.add("id", id);
               tmu.add("title", text);
               tmu.add("options", listString);
               tmu.add("num", options.size());
               res.add("stat", tmu.render());
               break;

            case "Matching":

               ST tma = stg.getInstanceOf("matching");
               text  = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getText();
               options =  bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOptions();
               
               for (String opt : options) {
                  options_text.add('"' + opt + '"');
                  String optext = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOption(opt).getText();
                  String opSide = String.valueOf(bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOption(opt).getSide());
                  String opMatch = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOption(opt).getMatch();
                  options_text.add(optext);
                  options_text.add('"' +opSide + '"');
                  options_text.add('"' +opMatch + '"');
               }
               String listString2 = String.join(",", options_text);
               
               tma.add("id", id);
               tma.add("title", text);
               tma.add("options", listString2);
               tma.add("num", options.size());
               res.add("stat", tma.render());
               break;

            case "Numeric":

               ST tn = stg.getInstanceOf("numeric");

               text  = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getText();
               boolean hasAnswer = false;
               ArrayList<String> answer = null;

               if (bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()) != null) {
                  answer = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getCorrectAnswers();
                  hasAnswer = true;
               }
               
               tn.add("id",id);
               tn.add("text",text);
               tn.add("hasanswer",hasAnswer);
               tn.add("answer", answer);
               res.add("stat", tn.render());
               
               break;
               
            case "Short":
               ST ts = stg.getInstanceOf("shortquestion");

               text = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getText();
               ArrayList<String> answers = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getCorrectAnswers();

               String shortAnswer = String.join(",", answers);

               ts.add("id",id);
               ts.add("text",text);
               ts.add("answers",shortAnswer);
               res.add("stat", ts.render());
               break;

            case "Essay":
               ST te = stg.getInstanceOf("essayquestion"); 
               text = bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getText();
               te.add("id",id);
               te.add("text",text);
               res.add("stat", te.render());
               break;
               
            default :
               System.out.println("[ERRO]: Tipo de pergunta desconhecido - " + tipo);
               break;
         }

      }
      return res;
   }
  

   //done
   @Override public ST visitPlist(quizParser.PlistContext ctx) {
      return visitChildren(ctx);
   }

   //done
   @Override public ST visitP(quizParser.PContext ctx) {
      return visitChildren(ctx);
   }
   

   //done
   @Override public ST visitShowQuestionBasic(quizParser.ShowQuestionBasicContext ctx) {
      ST res = stg.getInstanceOf("showBasic");
      String id = ctx.NAME().getText();
      res.add("id", id);
      return res;
   }


   //done
   @Override public ST visitShowQuestionMultiOpt(quizParser.ShowQuestionMultiOptContext ctx) {
      ST res = stg.getInstanceOf("showMultiOpt");
      String id = ctx.NAME().getText();
      String str = "";

      int c = 0;
      int size = ctx.ques_opt().NAME().size();

      for (TerminalNode t : ctx.ques_opt().NAME()){
        
         if (c != size-1){
            str += '"' + t.getText() + '"'+ ",";
            c++;
         }
         else{
            str +='"' +  t.getText() + '"';
         }
      }

      res.add("id", id);
      res.add("options", str);
      return res;
   }


   //done
   @Override public ST visitShowQuestionMultiOptandQuestion(quizParser.ShowQuestionMultiOptandQuestionContext ctx) {
      
      ST res = stg.getInstanceOf("showMultiOptandQuestion");
      String id;
      ArrayList<String> opt = new ArrayList<>();
      boolean hasOpt = false;

      for (quizParser.QuestionContext t: ctx.question()){
         id = t.NAME().getText();
         if (t.ques_opt() != null) {
            int size = t.ques_opt().NAME().size();
            int count = 0;
            for (TerminalNode p : t.ques_opt().NAME()) {
               opt.add('"' + p.getText() + '"');
            }
         }

         String str = String.join(",", opt);

         if (opt.isEmpty()){
            ST m = stg.getInstanceOf("showBasic");
            m.add("id",id);
            res.add("stat", m.render());
         } else {
            ST m = stg.getInstanceOf("showMultiOpt");
            m.add("id",id);
            m.add("options",str);
            res.add("stat", m.render());
         }

         opt.clear();
      }
   
      return res;
   }
   
   
   //done
   @Override public ST visitQues_opt(quizParser.Ques_optContext ctx) {
      return visitChildren(ctx);
   }

   //done
   @Override public ST visitShuffleQuestion(quizParser.ShuffleQuestionContext ctx) {
      ST res = stg.getInstanceOf("shuffle");
      String id = ctx.NAME().getText();

      res.add("id", id);
      return res;
   }


   //done
   @Override public ST visitGetAnswerNum(quizParser.GetAnswerNumContext ctx) {
      ST res = stg.getInstanceOf("getAnswer");
      String question_id = ctx.NAME().getText();
      res.add("id",question_id);
      return res;
   }

   // Doneish
   @Override public ST visitGetChoice(quizParser.GetChoiceContext ctx) {
      //'get' 'choice' NAME ques_opt? ',' NAME ques_opt?     | ques_opt: ('with' NAME(',' NAME)*) | ex: get choice P1 with o1,o2,o3,o4 , P2
      ST res = stg.getInstanceOf("getChoice");

      String id1 = ctx.question(0).NAME().getText();
      String str1 = "";

      int c = 0;
      if (ctx.question(0).ques_opt() != null){
         int size = ctx.question(0).ques_opt().NAME().size();

         for (TerminalNode t : ctx.question(0).ques_opt().NAME()){
         
            if (c != size-1){
               str1 += '"' + t.getText() + '"'+ ",";
               c++;
            }
            else{
               str1 +='"' +  t.getText() + '"';
            }
         }
         
      } else {
         str1 = null;
      }

      String id2 = ctx.question(1).NAME().getText();
      String str2 = "";
      
      if (ctx.question(1).ques_opt() != null){
         int size = ctx.question(1).ques_opt().NAME().size();

         for (TerminalNode t : ctx.question(1).ques_opt().NAME()){
         
            if (c != size-1){
               str2 += '"' + t.getText() + '"'+ ",";
               c++;
            }
            else{
               str2 +='"' +  t.getText() + '"';
            }
         }
      } else  {str2 = null;}
      
      res.add("id1", id1);
      res.add("options1", str1);
      res.add("id2", id2);
      res.add("options2", str2);
      return res;
   }
 

   //TODO
   @Override public ST visitGetAnswerToChoice(quizParser.GetAnswerToChoiceContext ctx) {
      ST res = stg.getInstanceOf("getAnswerToChoice");
      return res;
      }

   //done
   @Override public ST visitRespostaCurta(quizParser.RespostaCurtaContext ctx) {
      ST res = stg.getInstanceOf("shortquestion");

      String id = ctx.NAME().getText(); 
      String text = ctx.STRING(0).getText(); 

      String str = "";
      for (int i = 1; i < ctx.STRING().size(); i++) {
         if (i != ctx.STRING().size() - 1) {
            str += ctx.STRING(i).getText() + "," ;
         } else {
            str += ctx.STRING(i).getText();
         }
      }

      res.add("id", id);
      res.add("text", text);
      res.add("answers",str);
      
      return res;
   }

   //done
   @Override public ST visitNumericQuestion(quizParser.NumericQuestionContext ctx) {
      
      String id= ctx.NAME().getText();
      String text = ctx.title().getText();
      boolean hasAnswer = false;
      Double answer = null;

      if (ctx.mark() != null) {
         answer = Double.parseDouble(ctx.mark().getText());
         hasAnswer = true;
      }

      ST res = stg.getInstanceOf("numeric");
      res.add("id",id);
      res.add("text",text);
      res.add("hasanswer",hasAnswer);
      res.add("answer", answer);

   
      return res;
   
   }

   //done
   @Override public ST visitEssayQuestion(quizParser.EssayQuestionContext ctx) {
     ST res = stg.getInstanceOf("essayquestion");

      String id = ctx.NAME().getText(); 
      String text = ctx.STRING().getText(); 

      res.add("id", id);
      res.add("text", text);

      return res;
   }


   //done
   @Override public ST visitOption(quizParser.OptionContext ctx) {
      return visitChildren(ctx);
   }


   //done
   @Override public ST visitOptionMult(quizParser.OptionMultContext ctx) {
      ST res = stg.getInstanceOf("optionMult");

      String id = ctx.NAME().getText(); 
      String text = ctx.STRING().getText(); 

      res.add("id", id);
      res.add("text", text);

      return res;
   }


   //done
   @Override public ST visitFinishQuiz(quizParser.FinishQuizContext ctx) {
      ST res = stg.getInstanceOf("finish");
      return res;
   }


   //done
   @Override public ST visitTitle(quizParser.TitleContext ctx) {
      return visitChildren(ctx);
   }
}
