package Quiz;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import classes.*;

import bancoPerguntas.*;

public class QuizSemantic extends quizBaseVisitor<Boolean> {
   private boolean checkCreateQuiz=false;
   private boolean checkCreateQuizAutocorrective=false;
   private boolean checkCreateReport=false;
   private boolean getChoice = false;
   private boolean finishQuiz = false;
   private static int showCount = 0; // para fazer get choice tem de mostrar duas
   private static int cotador=0;
   private ArrayList<String> group_names = new ArrayList<>();
   private HashMap<String, HashMap<String,Question>> bancosP = new HashMap<>();
   private HashMap<String, ArrayList<String>> group_questions = new HashMap<>();
   private HashMap<String, String> options_ids = new HashMap<>();
   private HashMap<String, String> questions_ids = new HashMap<>();
   private HashMap<String, ArrayList<String>> questions_options = new HashMap<>();
   private HashMap<String, ArrayList<String>> questions_answers = new HashMap<>();
   private HashMap<String, Double> questions_marks = new HashMap<>();
   private HashMap<String,Question> perguntas_banco = new HashMap<>();
   @Override public Boolean visitProgram(quizParser.ProgramContext ctx) {
      Boolean ret=true;
      if(ctx.stat() != null){
         Iterator<quizParser.StatContext> iterador=ctx.stat().iterator();
         while(iterador.hasNext()){            
            if (!visit(iterador.next())) {
               ret = ret && false;
            }
         }
      }
      //done
      return ret;
   }

   @Override public Boolean visitStat(quizParser.StatContext ctx) {
      Boolean ret = true;
      if(ctx.expr() != null){
         Iterator<quizParser.ExprContext> iterador=ctx.expr().iterator();
         while(iterador.hasNext()){
            if (!visit(iterador.next())) {
               ret = ret && false;
            }
         }
      }
      //done
      return ret;
   }

   @Override public Boolean visitExpr(quizParser.ExprContext ctx) {
      //done
      return visitChildren(ctx);
   }

   @Override public Boolean visitCreateQuiz(quizParser.CreateQuizContext ctx) {
      if (!checkCreateQuiz &&  !checkCreateQuizAutocorrective){
         checkCreateQuiz=true;
         return true;
      }
      System.err.println("Só pode ter 1 create quiz");
      return false;
      //done
   }

   @Override public Boolean visitCreateQuizCorrection(quizParser.CreateQuizCorrectionContext ctx) {

      if (!checkCreateQuiz && !checkCreateQuizAutocorrective){
         checkCreateQuizAutocorrective=true;
         return true;
      }
      System.err.println("Só pode ter 1 create quiz");
      return false;
      //done
   }

   @Override public Boolean visitCreateReport(quizParser.CreateReportContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!checkCreateReport){
         checkCreateReport=true;
         return true;
      }
      System.err.println("Só pode ter 1 create report");
      return false;
      //done
   }

   @Override public Boolean visitCreateGroup(quizParser.CreateGroupContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      if (!group_names.contains(ctx.NAME().getText())) {
         group_names.add(ctx.NAME().getText());
         return true;
      }

      System.err.println("Já existe um grupo com o nome " + ctx.NAME().getText());
      return false;
      //done
   }

   @Override public Boolean visitCreateMultiGroup(quizParser.CreateMultiGroupContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      for (TerminalNode t : ctx.NAME()){
         if (!group_names.contains(t.getText())) {
            group_names.add(t.getText());
         }
         else {
            System.err.println("Já existe um grupo com o nome " + t.getText());
            return false;
         }
      }

      return true;
      //done
   }

   @Override public Boolean visitAddOption(quizParser.AddOptionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      String option_id = ctx.NAME().getText();
      if (!options_ids.keySet().contains(option_id)) {
         System.err.println("Não existe nenhuma opção com o ID " + option_id);
         return false;
      }

      for (TerminalNode t : ctx.sub_question().NAME()){
         if (!questions_ids.containsKey(t.getText()) || questions_ids.get(t.getText()) != options_ids.get(option_id)) {
            System.err.println("Não existe nenhuma pergunta do tipo "+ options_ids.get(option_id) +" com o ID " + t.getText());
            return false;
         }

         ArrayList<String> options = questions_options.get(t.getText());
         if (options.contains(option_id)) {
            System.err.println("A pergunta com o ID " + t.getText() + " já contem uma opção com o ID " + option_id);
            return false;
         }

         options.add(option_id);
         questions_options.put(t.getText(), options);
      }

      //done
      return true;
   }

   @Override public Boolean visitAddAll(quizParser.AddAllContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      String option_id = ctx.NAME().getText();
      if (!options_ids.keySet().contains(option_id)) {
         System.err.println("Não existe nenhuma opção com o ID " + option_id);
         return false;
      }
    
      for (String qid : questions_ids.keySet()){
         ArrayList<String> options = questions_options.get(qid);
         if (questions_ids.get(qid).equals(options_ids.get(option_id))  && !options.contains(option_id)) {
            options.add(option_id);
            questions_options.put(qid, options);
         }         
      }

      //done
      return true;
   }

   @Override public Boolean visitAddQuestion2Group(quizParser.AddQuestion2GroupContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      for (TerminalNode t : ctx.sub_question().NAME()){
         if (!questions_ids.containsKey(t.getText())) {
            System.err.println("Não existe nenhuma pergunta com o ID " + t.getText());
            return false;
         }

         for (TerminalNode g : ctx.sub_groups().NAME()){
            if (!group_names.contains(g.getText())) {
               System.err.println("Não existe nenhum grupo com o nome " + g.getText());
               return false;
            }
            ArrayList<String> questions;
            if (group_questions.get(g.getText()) == null) {
               questions = new ArrayList<>();
            }
            else {
               questions = group_questions.get(g.getText());
            }
            if (questions.contains(t.getText())) {
               System.err.println("O grupo com o nome " + g.getText() + " já contem uma pergunta com o ID " + t.getText());
               return false;
            }

            questions.add(t.getText());
            group_questions.put(g.getText(), questions);
         }
      }

      //done
      return true;
   }

   @Override public Boolean visitSub_question(quizParser.Sub_questionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      return true;
   }

   @Override public Boolean visitLoadBanco(quizParser.LoadBancoContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      

      String fileName = "../examples/" + ctx.STRING().getText().replace("\"", "");
      File tmpDir = new File(fileName);
      if (!tmpDir.exists()) {
         System.err.println("O ficheiro não existe.");
         return false;
      }

      // fazer verificação do banco de perguntas

      HashMap<String,Question> perguntas_banco = bancoPerguntas.bancopMain.loadBancoPerguntas(fileName);
 
      if (perguntas_banco == null) {
         // há erro no banco de perguntas
         System.err.println("O banco de perguntas está mal formulado");
         return false;
      }
      
      bancosP.put(ctx.NAME().getText(), perguntas_banco);
      // Nota: o visitor do banco de perguntas pode devolver um objeto com todas as perguntas e suas opções?
      // semi done

      return true;
   }

   @Override public Boolean visitEliminar(quizParser.EliminarContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!questions_ids.keySet().contains(ctx.NAME(1).getText())) {
         System.err.println("Não existe nenhuma pergunta com o ID " + ctx.NAME(1).getText());
         return false;
      }

      ArrayList<String> options = questions_options.get(ctx.NAME(1).getText());
      if (!options_ids.keySet().contains(ctx.NAME(0).getText())) {
         System.err.println("Não existe nenhuma opção com o ID " + ctx.NAME(0).getText());
         return false;
      }
      else if (!options.contains(ctx.NAME(0).getText())) {
         System.err.println("A pergunta com o ID "+ ctx.NAME(1).getText() +" não contem nenhuma opção com o ID " + ctx.NAME(0).getText());
         return false;
      }

      options.remove(ctx.NAME(0).getText());
      questions_options.put(ctx.NAME(1).getText(), options);

      if (questions_answers.keySet().contains(ctx.NAME(1).getText())) {
         ArrayList<String> answers = questions_answers.get(ctx.NAME(1).getText());

         if (answers.contains(ctx.NAME(0).getText())) {
            answers.remove(ctx.NAME(0).getText());
            questions_answers.put(ctx.NAME(1).getText(), answers);
         }
      }

      // done
      return true;
   }

   @Override public Boolean visitDefinirResposta(quizParser.DefinirRespostaContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      String option_id = ctx.NAME().getText();
      if (!options_ids.keySet().contains(option_id)) {
         System.err.println("Não existe nenhuma opção com o ID " + option_id);
         return false;
      }

      for (TerminalNode t : ctx.sub_question().NAME()){
         if (!questions_ids.keySet().contains(t.getText())) {
            System.err.println("Não existe nenhuma pergunta com o ID " + t.getText());
            return false;
         }

         if (!questions_options.containsKey(t.getText())) {
            System.err.println("Não existem opções de resposta para a pergunta com o ID " + t.getText());
            return false;
         }

         ArrayList<String> options = questions_options.get(t.getText());

         if (!options.contains(option_id)) {
            System.err.println("A pergunta com o ID "+ t.getText() +" não contem nenhuma opção com o ID " + option_id);
            return false;
         }
         else if (questions_ids.get(t.getText()) != options_ids.get(option_id)) {
            System.err.println("A resposta definida ("+ option_id +" do tipo "+ options_ids.get(option_id) +") tem um tipo diferente da pergunta com o ID "+ t.getText() +" ("+ questions_ids.get(t.getText()) +")");
            return false;
         }
         
         ArrayList<String> answers;
         if (questions_answers.keySet().contains(t.getText())) {
            answers = questions_answers.get(t.getText());
            answers.add(option_id);            
         }
         else {
            answers = new ArrayList<>();
            answers.add(option_id);
         }
         questions_answers.put(t.getText(), answers);
      }

      return true;
   }

   @Override public Boolean visitDefinirCotacaoSemDesconto(quizParser.DefinirCotacaoSemDescontoContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!questions_ids.keySet().contains(ctx.NAME().getText())) {
         
         System.err.println("Não existe nenhuma pergunta com o ID " + ctx.NAME().getText());
         return false;
      }

      if (ctx.mark().FLOAT() != null) {
         questions_marks.put(ctx.NAME().getText(), Double.parseDouble(ctx.mark().FLOAT().getText()));
         return true;
      }
      else if (ctx.mark().NUMBER() != null){
         questions_marks.put(ctx.NAME().getText(), Double.parseDouble(ctx.mark().NUMBER().getText()));
         return true;
      }
      
      return false;
   }

   @Override public Boolean visitDefinirCotacaoMudaPergunta(quizParser.DefinirCotacaoMudaPerguntaContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!questions_ids.keySet().contains(ctx.NAME(0).getText())) {
         System.err.println("Não existe nenhuma pergunta com o ID " + ctx.NAME(0).getText());
         return false;
      }

      if (ctx.mark().FLOAT() != null) {
         questions_marks.put(ctx.NAME(0).getText(), Double.parseDouble(ctx.mark().FLOAT().getText()));
      }
      else if (ctx.mark().NUMBER() != null){
         questions_marks.put(ctx.NAME(0).getText(), Double.parseDouble(ctx.mark().NUMBER().getText()));
      }

      
      
      return true;
   }

   @Override public Boolean visitDefinirCotacaoDescontar(quizParser.DefinirCotacaoDescontarContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!questions_ids.keySet().contains(ctx.NAME().getText())) {
         System.err.println("Não existe nenhuma pergunta com o ID " + ctx.NAME().getText());
         return false;
      }

      if (ctx.mark(0).FLOAT() != null) {
         questions_marks.put(ctx.NAME().getText(), Double.parseDouble(ctx.mark(0).FLOAT().getText()));
      }
      else if (ctx.mark(0).NUMBER() != null){
         questions_marks.put(ctx.NAME().getText(), Double.parseDouble(ctx.mark(0).NUMBER().getText()));
      }

      if (ctx.mark(1).FLOAT() != null && Double.parseDouble(ctx.mark(0).FLOAT().getText()) > Double.parseDouble(ctx.mark(1).FLOAT().getText())) {
         return true;
      }
      else if (ctx.mark(0).NUMBER() != null && Double.parseDouble(ctx.mark(0).NUMBER().getText()) > Double.parseDouble(ctx.mark(1).NUMBER().getText())){
         return true;
      }
      
      return false;
   }

   @Override public Boolean visitMark(quizParser.MarkContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      return true; // number ou float
   }

   @Override public Boolean visitShowGroup(quizParser.ShowGroupContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!group_names.contains(ctx.NAME().getText())) {
         System.err.println("Não existe nenhum grupo com o nome " + ctx.NAME().getText());
         return false;
      }

      Boolean ret = true;

      for (int i = 0; i < ctx.showOpt().size(); i++){
         ret = ret && visitShowOpt(ctx.showOpt(i));
      }

      return ret;
   }

   @Override public Boolean visitShowOpt(quizParser.ShowOptContext ctx) {
      if (!quizCreated()){
         return false;
      }

      return visitChildren(ctx); // está ok
   }

   @Override public Boolean visitAvaliar(quizParser.AvaliarContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      if (!group_names.contains(ctx.NAME().getText())) {
         System.err.println("Não existe nenhum grupo com o nome " + ctx.NAME().getText());
         return false;
      }

      Boolean ret = true;
      
      for (int i = 0; i < ctx.defineMark().size(); i++){
         ret = ret && visit(ctx.defineMark(i));
      }

      return ret;
   }

   @Override public Boolean visitMultichoice(quizParser.MultichoiceContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      if (questions_ids.keySet().contains(ctx.NAME().getText())) {
         System.err.println("Já existe uma pergunta com o ID " + ctx.NAME().getText());
         return false;
      }

      ArrayList<String> options = new ArrayList<>();

      if(ctx.multichoiceoption() != null){
         Iterator<quizParser.MultichoiceoptionContext> iterador=ctx.multichoiceoption().iterator();
         while(iterador.hasNext()){
            String opt_id = iterador.next().NAME().getText();
            if (options.contains(opt_id)) {
               System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " já contem uma opção com o ID " + opt_id);
               return false;
            }
            options.add(opt_id);
            options_ids.put(opt_id, "MultiChoice");
         }
      }
      else {
         return false;
      }
      
      questions_ids.put(ctx.NAME().getText(), "MultiChoice");
      questions_options.put(ctx.NAME().getText(), options);    
      
      //done
      return true;
   }

   @Override public Boolean visitMultichoiceoption(quizParser.MultichoiceoptionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      return true; // não é usado porque o multichoice já visita as opções
   }

   @Override public Boolean visitMatching(quizParser.MatchingContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (questions_ids.keySet().contains(ctx.NAME().getText())) {
         System.err.println("Já existe uma pergunta com o ID " + ctx.NAME().getText());
         return false;
      }

      ArrayList<String> options = new ArrayList<>();

      HashMap<String, String> side0 = new HashMap<>();
      HashMap<String, String> side1 = new HashMap<>();

      boolean matchExists = false;

      if(ctx.matchingoption() != null){
         Iterator<quizParser.MatchingoptionContext> iterador=ctx.matchingoption().iterator();
         while(iterador.hasNext()){
            quizParser.MatchingoptionContext i = iterador.next();
            String opt_id = i.NAME().getText();
            if (options.contains(opt_id)) {
               System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " já contem uma opção com o ID " + opt_id);
               return false;
            }
            options.add(opt_id);
            options_ids.put(opt_id, "Matching");
            if (i.match() != null) {
               matchExists = true;
               if (i.CORRECT().getText().replace("\"", "").equals("0")) {
                  side0.put(opt_id, i.match().NAME().getText());
               }
               else if (i.CORRECT().getText().replace("\"", "").equals("1")) {
                  side1.put(opt_id, i.match().NAME().getText());
               }
            }
         }
      }
      else {
         return false;
      }

      for (String key0 : side0.keySet()) {
         if (!side1.containsKey(side0.get(key0)) || !side1.get(side0.get(key0)).equals(key0)){
            System.err.println("O par da opção " + key0 + " não está bem definido.");
            return false;
         }
      }

      for (String key1 : side1.keySet()) {
         if (!side0.containsKey(side1.get(key1)) || !side0.get(side1.get(key1)).equals(key1)){
            System.err.println("O par da opção " + key1 + " não está bem definido.");
            return false;
         }
      }
      
      questions_ids.put(ctx.NAME().getText(), "Matching");
      questions_options.put(ctx.NAME().getText(), options);  
      questions_answers.put(ctx.NAME().getText(), new ArrayList<String>());
      
      //done
      return true;
   }

   @Override public Boolean visitMatchingoption(quizParser.MatchingoptionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      return true; // não é usado, matching já visita as opções
   }

   @Override public Boolean visitMatch(quizParser.MatchContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      return true; // se não dá erro de gramática não há mais nada a ver
   }

   @Override public Boolean visitImport_expr(quizParser.Import_exprContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!bancosP.containsKey(ctx.NAME().getText())) {
         System.err.println("O banco de dados " + ctx.NAME().getText() + " não existe.");
         return false;
      }

      String id = "";
      for (quizParser.PContext p : ctx.plist().p()) {
         if (!bancosP.get(ctx.NAME().getText()).containsKey(p.NAME(0).getText())) {
            System.err.println("Não existe nenhuma pergunta com o ID " + p.NAME(0).getText() + " no banco de perguntas");
            return false;
         }

         if (p.NAME(1) != null && questions_ids.containsKey(p.NAME(1).getText())) {
            System.err.println("Já existe uma pergunta com o ID " + p.NAME(1).getText());
            return false;
         }
         else if (p.NAME(1) == null && questions_ids.containsKey(p.NAME(0).getText())) {
            System.err.println("Já existe uma pergunta com o ID " + p.NAME(0).getText());
            return false;
         }
         else if (p.NAME(1) != null) {
            id = p.NAME(1).getText();
         }
         else {
            id = p.NAME(0).getText();
         }
        ArrayList<String>bp=bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOptions();
        if (bp != null){
          
           for (String a: bp){
           
            options_ids.put(a, bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getType());
         }
        }
         
         questions_ids.put(id, bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getType());
         //options_ids.put(key, value)
         // tipos com opções: MultiChoice e Matching
         if (questions_ids.get(id) == "Matching" || questions_ids.get(id) == "MultiChoice") {
            questions_options.put(id, bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getOptions());
         }

         if (questions_ids.get(id) == "Matching") {
            questions_answers.put(id, new ArrayList<String>());
         }
         else {
            questions_answers.put(id, bancosP.get(ctx.NAME().getText()).get(p.NAME(0).getText()).getCorrectAnswers());
         }
      }

      return true;
   }

   @Override public Boolean visitPlist(quizParser.PlistContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      

      //done
      return visitChildren(ctx);
   }

   @Override public Boolean visitP(quizParser.PContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      //done
      return true;
   }

   @Override public Boolean visitShowQuestionBasic(quizParser.ShowQuestionBasicContext ctx) {
      verifyShow(true);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      showCount++;

      if (!questions_ids.containsKey(ctx.NAME().getText())){
         System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " não existe");
         return false;
      }
      //Apenas validar se existe esta pergunta??
      return true; // se existe retorna true
   }

   @Override public Boolean visitShowQuestionMultiOpt(quizParser.ShowQuestionMultiOptContext ctx) {
      verifyShow(true);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      showCount++;

      if (!questions_ids.containsKey(ctx.NAME().getText())){
         System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " não existe");
         return false;      
      }

      if (!questions_options.containsKey(ctx.NAME().getText())) {
         System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " não contem a opções");
         return false;
      }

      ArrayList opcoes=questions_options.get(ctx.NAME().getText());
      for (TerminalNode p : ctx.ques_opt().NAME()) {
         if (p != null && !opcoes.contains(p.getText())) {
            System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " não contem a opção com o ID "+p.getText());
            return false;
         }        
      }
      
      //done
      return true;
   }

   @Override public Boolean visitShowQuestionMultiOptandQuestion(quizParser.ShowQuestionMultiOptandQuestionContext ctx) {
      verifyShow(true);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      int c = 0;

      //VALIDAR OS PRIMEIROS CHECK
      for (quizParser.QuestionContext t: ctx.question()){
         if (!questions_ids.containsKey(t.NAME().getText())){
            System.err.println("A pergunta com o ID " + t.NAME().getText() + " não existe");
            return false;
         }

         if (!questions_options.containsKey(t.NAME().getText()) && ctx.question(c).ques_opt() != null) {
            System.err.println("A pergunta com o ID " + t.NAME().getText() + " não contem opções");
            return false;
         }

         if (t.ques_opt() != null) {
            ArrayList opcoes = questions_options.get(t.NAME().getText());
            for (TerminalNode p : t.ques_opt().NAME()) {
               if (p != null && !opcoes.contains(p.getText())) {
                  System.err.println("A pergunta com o ID " + t.NAME().getText() + " não contem a opção com o ID "+p.getText());
                  return false;
               }
            }
         }

         c++;
         showCount++;
      }
      
      return true;
   }

   @Override public Boolean visitQuestion(quizParser.QuestionContext ctx) {
      verifyShow(true);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      return true; // é verifado em cima
   }


   @Override public Boolean visitQues_opt(quizParser.Ques_optContext ctx) {
      verifyShow(true);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      return true; // é verifado em cima
   }

   @Override public Boolean visitShuffleQuestion(quizParser.ShuffleQuestionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      if (!questions_ids.containsKey(ctx.NAME().getText())) {
         System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " não existe");
         return false;
      }
      if (questions_ids.get(ctx.NAME().getText()) != "Matching" &&
      questions_ids.get(ctx.NAME().getText()) != "MultiChoice") {
         System.err.println("Não é possível dar shuffle a perguntas que não sejam do tipo Matching ou MultiChoice");
         return false;
      }
      
      return true;
   }

   @Override public Boolean visitGetAnswerNum(quizParser.GetAnswerNumContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (!questions_ids.containsKey(ctx.NAME().getText())) {
         System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " não existe");
         return false;
      }

      if (checkCreateQuizAutocorrective && !questions_answers.containsKey(ctx.NAME().getText())) {
         System.err.println("A pergunta com o ID " + ctx.NAME().getText() + " não tem uma resposta definida e não poderá ser avaliada automaticamente.");
         return false;
      }
      
      return true;
   }

   @Override public Boolean visitGetChoice(quizParser.GetChoiceContext ctx) {
      if (!quizCreated()){
         return false;
      }

      if (showCount < 2) {

         verifyShow(false);
         verifyChoice(false);

         System.err.println("Deve mostrar pelo menos duas perguntas para que o utilizador possa escolher.");
         return false;
      }
      if (!questions_ids.containsKey(ctx.question(0).NAME().getText())) {
         System.err.println("A pergunta com o ID " + ctx.question(0).NAME().getText() + " não existe");
         return false;
      }
      if (!questions_ids.containsKey(ctx.question(1).NAME().getText())) {
            System.err.println("A pergunta com o ID " + ctx.question(1).NAME().getText()+ " não existe");
            return false;
         }
      ArrayList opt1=questions_options.get(ctx.question(0).NAME().getText());
      ArrayList opt2=questions_options.get(ctx.question(1).NAME().getText());
      if(ctx.question(0).ques_opt() != null){
         for (TerminalNode aq :ctx.question(0).ques_opt().NAME() ){
            String opt= aq.getText();
            if (! opt1.contains(opt)){
               System.err.println("A pergunta com o ID " + ctx.question(0).NAME().getText() + " não contem a opção "+opt);
               return false;
            }
         }
      }
      if(ctx.question(1).ques_opt() != null){
         for (TerminalNode aq :ctx.question(1).ques_opt().NAME() ){
            String optt= aq.getText();
            if (! opt2.contains(optt)){
               System.err.println("A pergunta com o ID " + ctx.question(1).NAME().getText() + " não contem a opção "+optt);
               return false;
            }
         }
      }
      verifyShow(false);
      verifyChoice(true);

      return true;
   }

   @Override public Boolean visitGetAnswerToChoice(quizParser.GetAnswerToChoiceContext ctx) {
      if (!quizCreated()){
         return false;
      }

      if (!getChoice) {
         verifyShow(false);
         verifyChoice(false);

         System.err.println("Não foi escolhida nenhuma pergunta para responder (get choice deve ser a linha imediatamente anterior a esta).");
         return false;
      }

      verifyShow(false);
      verifyChoice(false);
      
      return true;
   }

   @Override public Boolean visitRespostaCurta(quizParser.RespostaCurtaContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (questions_ids.containsKey(ctx.NAME().getText())) {
         System.err.println("Já existe uma pergunta com o ID " + ctx.NAME().getText());
         return false;
      }

      if (ctx.STRING(1) == null && checkCreateQuizAutocorrective) {
         System.err.println("O quiz é de auto correção, logo deve definir uma resposta à pergunta com ID " + ctx.NAME().getText());
         return false;
      }

      ArrayList<String> answers = new ArrayList<>();
      if (ctx.STRING(1) != null) {
         int c = 1;

         while (ctx.STRING(c) != null) {
            answers.add(ctx.STRING(c).getText());
            c++;
         }
      }

      questions_ids.put(ctx.NAME().getText(), "short");
      questions_answers.put(ctx.NAME().getText(), answers);
      
      return true;
   }

   @Override public Boolean visitNumericQuestion(quizParser.NumericQuestionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (questions_ids.containsKey(ctx.NAME().getText())) {
         System.err.println("Já existe uma pergunta com o ID " + ctx.NAME().getText());
         return false;
      }

      if (ctx.mark() == null && checkCreateQuizAutocorrective) {
         System.err.println("O quiz é de auto correção, logo deve definir uma resposta à pergunta com ID " + ctx.NAME().getText());
         return false;
      }

      ArrayList<String> answers = new ArrayList<>();
      if (ctx.mark().FLOAT() != null) {
         answers.add(ctx.mark().FLOAT().getText());
      }
      else if (ctx.mark().NUMBER() != null) {
         answers.add(ctx.mark().NUMBER().getText());
      }

      questions_ids.put(ctx.NAME().getText(), "numeric");
      questions_answers.put(ctx.NAME().getText(), answers);
      
      return true;
   }

   @Override public Boolean visitEssayQuestion(quizParser.EssayQuestionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (questions_ids.containsKey(ctx.NAME().getText())) {
         System.err.println("Já existe uma pergunta com o ID " + ctx.NAME().getText());
         return false;
      }

      if (checkCreateQuizAutocorrective) {
         System.err.println("Não pode adicionar perguntas do tipo essay num questionário com auto correção.");
         return false;
      }

      questions_ids.put(ctx.NAME().getText(), "essay");
      
      return true;
   }

   @Override public Boolean visitOption(quizParser.OptionContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }
      
      return visitChildren(ctx); // visita a option mult, como só tem uma está tudo bem
   }

   @Override public Boolean visitOptionMult(quizParser.OptionMultContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      if (options_ids.containsKey(ctx.NAME().getText())) {
         System.err.println("Já existe uma opção com o ID " + ctx.NAME().getText());
         return false;
      }

      options_ids.put(ctx.NAME().getText(), "MultiChoice");

      return true;
   }

   @Override public Boolean visitFinishQuiz(quizParser.FinishQuizContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      finishQuiz = true;

      return true;
   }

   @Override public Boolean visitTitle(quizParser.TitleContext ctx) {
      verifyShow(false);
      verifyChoice(false);
      if (!quizCreated()){
         return false;
      }

      return true; // ou é String ou não é, não há mais nada a ver
   }

   private boolean quizCreated() {
      if (!checkCreateQuiz && !checkCreateQuizAutocorrective){
         System.err.println("Deve criar o quiz antes de escrever outras instruções.");
         return false;
      }
      if (finishQuiz) {
         System.err.println("Só pode definir um quiz que não esteja terminado.");
         return false;
      }
      return true;
   }

   private void verifyShow(boolean show) {
      if (!show) {
         showCount = 0;
      }
   }

   private void verifyChoice(boolean choice) {
      getChoice = choice;
   }
}