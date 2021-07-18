package bancoPerguntas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BancoPerguntasVisitor extends bancopBaseVisitor<Boolean> {

   ArrayList<String> question_ids = new ArrayList<String>();      //guardar id's de perguntas existentes
   ArrayList<String> option_ids = new ArrayList<String>();        //guardar id's de options existentes

   @Override public Boolean visitProgram(bancopParser.ProgramContext ctx) {

      boolean validation = true;
      if (ctx.stat() != null){
         Iterator<bancopParser.StatContext> iterador = ctx.stat().iterator();
         while (iterador.hasNext()){
            validation = visit(iterador.next());
         }
      }
      return validation;
   }

   @Override public Boolean visitStat(bancopParser.StatContext ctx) {

      boolean validation = true;
      if (ctx.expr() != null){
         Iterator<bancopParser.ExprContext> iterador = ctx.expr().iterator();
         while (iterador.hasNext()){
            validation = visit(iterador.next());
         }
      }
      return validation;

   } 

   @Override public Boolean visitExpr(bancopParser.ExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitMultichoice(bancopParser.MultichoiceContext ctx) {

      boolean validation = true;
      String question_id = ctx.id().getText();
      String text = ctx.title().getText();
      
      if (question_ids.contains(question_id)) {
         System.out.println("There's already a question with the id: " + question_id);
         validation = false;
      } else {
         question_ids.add(question_id);
      }

      if (text.trim().equals("") ) validation = false;

      if(ctx.multichoiceoption() != null){
         Iterator<bancopParser.MultichoiceoptionContext> iterador = ctx.multichoiceoption().iterator();
         while (iterador.hasNext()){
            validation = visit(iterador.next());
         }
      }
      
      return validation;
   }

   @Override public Boolean visitMatching(bancopParser.MatchingContext ctx) {
      
      boolean validation = true;
      String question_id = ctx.id().getText();
      String text = ctx.title().getText();

      if (question_ids.contains(question_id)) {
         System.out.println("There's already a question with the id: " + question_id);
         validation = false;
      } else {
         question_ids.add(question_id);
      }

      if (text.trim().equals("")) validation = false;

      HashMap<String,String> matchings = new HashMap<String,String>();

      if (ctx.matchingoption() != null) {

         Iterator<bancopParser.MatchingoptionContext> iterador = ctx.matchingoption().iterator();
         while (iterador.hasNext()){
            bancopParser.MatchingoptionContext i = iterador.next();
            String option_id = i.id().getText();
            String title = i.title().getText();
            String side = i.CORRECT().getText();
            String match = i.match().getText();

            if (!side.equals("0") || !side.equals("1")) {
               validation = false;
            }

            if (option_id.equals(match) || option_ids.contains(option_id)) {
               validation = false;
            } else {
               option_ids.add(option_id);
               matchings.put(option_id, match);
            }
         }
      }

      for (Map.Entry<String, String> entry : matchings.entrySet()) {
         if (!matchings.values().contains(entry.getKey()) || !matchings.containsKey(entry.getValue())) {
            validation = false;
         }
      }

      return validation;
   }

   @Override public Boolean visitShortQ(bancopParser.ShortQContext ctx) {

      boolean validation = true;
      String question_id = ctx.id().getText();
      String text = ctx.title().getText(); 

      String answer;
      if (ctx.answer() != null) {
         answer = ctx.answer().getText();
      }

      if (text.trim() .equals("")) validation = false;

      if (question_ids.contains(question_id)) {
         System.out.println("There's already a question with the id: " + question_id);
         validation = false;
      } else {
         question_ids.add(question_id);
      }

      return validation;
   }

   @Override public Boolean visitNumeric(bancopParser.NumericContext ctx) {

      boolean validation = true;
      String question_id = ctx.id().getText();
      String text = ctx.title().getText();  

      if (question_ids.contains(question_id)) {
         System.out.println("There's already a question with the id: " + question_id);
         validation = false;
      } else {
         question_ids.add(question_id);
      }

      if (text.trim() .equals("")) validation = false;

      return validation;
   }

   @Override public Boolean visitEssay(bancopParser.EssayContext ctx) {

      boolean validation = true;
      String question_id = ctx.id().getText();
      String text = ctx.title().getText();

      if (question_ids.contains(question_id)) {
         System.out.println("There's already a question with the id: " + question_id);
         validation = false;
      } else {
         question_ids.add(question_id);
      }

      if (text.trim() == "") validation = false;

      return validation;
   }

   @Override public Boolean visitMultichoiceoption(bancopParser.MultichoiceoptionContext ctx) {

      boolean validation = true;
      String id = ctx.id().getText();
      String text = ctx.title().getText();

      if (option_ids.contains(id)) {
         System.out.println("There's already an option with the id: " + id);
         validation = false;
      } else {
         option_ids.add(id);
      }

      if (text.trim().equals("")) validation = false;

      return validation;
   }

   @Override public Boolean visitMatchingoption(bancopParser.MatchingoptionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitMatch(bancopParser.MatchContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitAnswer(bancopParser.AnswerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitTitle(bancopParser.TitleContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitId(bancopParser.IdContext ctx) {
      return visitChildren(ctx);
   }
}

