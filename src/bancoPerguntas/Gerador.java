
package bancoPerguntas;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;


import classes.*;

public class Gerador extends bancopBaseVisitor< HashMap<String,Question> > {
   public HashMap<String,Question> ret = new HashMap<>();
   
   @Override public HashMap<String,Question> visitProgram(bancopParser.ProgramContext ctx) {
      if (ctx.stat() != null){
         Iterator<bancopParser.StatContext> iterador = ctx.stat().iterator();
         while (iterador.hasNext()){
            ret = visit(iterador.next());
         }
      }
      
      return ret;
   }

   @Override public HashMap<String,Question> visitStat(bancopParser.StatContext ctx) {
      if (ctx.expr() != null){
         Iterator<bancopParser.ExprContext> iterador = ctx.expr().iterator();
         while (iterador.hasNext()){
            ret = visit(iterador.next());
         }
      }
      return ret;
   }

   @Override public HashMap<String,Question> visitExpr(bancopParser.ExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public HashMap<String,Question> visitMultichoice(bancopParser.MultichoiceContext ctx) {
      String id = ctx.id().getText();
      String text = ctx.title().getText();
      MultiChoice pergunta =new MultiChoice(id, text);
      ret.put(id, pergunta);
     
      Iterator<bancopParser.MultichoiceoptionContext> it = ctx.multichoiceoption().iterator();
      while (it.hasNext()){
         bancopParser.MultichoiceoptionContext  op = it.next();
         pergunta.addOption(new MultiChoiceOption(op.id().getText(), op.title().getText()));
      }
    
      return ret;
   }

   @Override public HashMap<String,Question> visitMatching(bancopParser.MatchingContext ctx) {
      String id = ctx.id().getText();
      String text = ctx.title().getText();
      Matching pergunta = new Matching(id,text);
      ret.put(id,pergunta);
      Iterator<bancopParser.MatchingoptionContext> it = ctx.matchingoption().iterator();
      while (it.hasNext()){
         bancopParser.MatchingoptionContext op = it.next();
         String correct = op.CORRECT().getText();
         correct=correct.replaceAll("\"", "");
        
         String idop = op.id().getText();
         String teop= op.title().getText();
         String match= op.match().getText();
         pergunta.addOption(new MatchingOption(idop, teop,Integer.parseInt(correct),match));
      }
      return ret;
   }

   @Override public HashMap<String,Question> visitShortQ(bancopParser.ShortQContext ctx) {
      String id = ctx.id().getText();
      String text = ctx.title().getText();

      if (ctx.answer() != null){
         ArrayList<String> answer = new ArrayList<>();
         
         answer.add( ctx.answer().getText());
         ShortQ pergunta = new ShortQ(id,text,answer);
         ret.put(id, pergunta);
         return ret;
      }


      ShortQ pergunta = new ShortQ(id,text);
      ret.put(id,pergunta);
      return ret;
      
   }

   @Override public HashMap<String,Question> visitNumeric(bancopParser.NumericContext ctx) {
      String id = ctx.id().getText();
      String text = ctx.title().getText();
      
      if (ctx.FLOAT() != null){
         Double res = Double.parseDouble(ctx.FLOAT().getText());
         Numeric pergunta = new  Numeric(id,text,res);
         ret.put(id, pergunta);
         return ret;
      }
      if (ctx.NUMBER() != null){
         Double res = Double.parseDouble(ctx.NUMBER().getText());
         Numeric pergunta = new  Numeric(id,text,res);
         ret.put(id, pergunta);
         return ret;
      }


      Numeric pergunta = new Numeric(id,text);
      ret.put(id,pergunta);

      return ret;

   }

   @Override public HashMap<String,Question> visitEssay(bancopParser.EssayContext ctx) {
      String id = ctx.id().getText();
      String text = ctx.title().getText();
      Essay pergunta = new Essay(id,text);
      ret.put(id,pergunta);

      return ret;

   }

   @Override public HashMap<String,Question> visitMultichoiceoption(bancopParser.MultichoiceoptionContext ctx) {
      return ret;
   }

   @Override public HashMap<String,Question> visitMatchingoption(bancopParser.MatchingoptionContext ctx) {
       return ret;
   }

   @Override public HashMap<String,Question> visitMatch(bancopParser.MatchContext ctx) {
      return ret;
   }

   @Override public HashMap<String,Question> visitAnswer(bancopParser.AnswerContext ctx) {
      return ret;
   }

   @Override public HashMap<String,Question> visitTitle(bancopParser.TitleContext ctx) {
      return ret;
   }

   @Override public HashMap<String,Question> visitId(bancopParser.IdContext ctx) {
      return ret;
   }
}
