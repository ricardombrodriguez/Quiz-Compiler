
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import classes.*;

public class output {
    public static void main(String[] args) {
        Group g;
        String[] groups;
        ArrayList<Question> questions_string;
        ArrayList<Group> groups_string;
        ArrayList<String> matchingoptions_string;
        MatchingOption matchingoption_object;
        ArrayList<String> multichoiceoptions_string;
        MultiChoiceOption multichoiceoption_object;
        ArrayList<String> shortquestion_answers;
        String [] question_names;
        String[] options;
        int contador =0;
        //adicionar aqui variáveis

        Quiz quiz = new Quiz("Exame final de programação"); 
        quiz.defineMark(20);
        quiz.setAutoCorrective(true);

        Group Grupo1 = new Group("Grupo1");
        quiz.addGroup(Grupo1);
        Group GrupoFinal = new Group("GrupoFinal");
        quiz.addGroup(GrupoFinal);
        multichoiceoptions_string = new ArrayList<String>(Arrays.asList("b1","Integer","b2","Double","b3","Boolean","b4","String"));
        MultiChoice Pa1 = new MultiChoice("Pa1","true/false são classificados como _ em java");
        for (int i = 0; i < 8; i += 2){
            multichoiceoption_object = new MultiChoiceOption(multichoiceoptions_string.get(i),multichoiceoptions_string.get(i+1));
            Pa1.addOption(multichoiceoption_object); 
        }
        quiz.addQuestion(Pa1);      

        multichoiceoptions_string = new ArrayList<String>(Arrays.asList("o1","-1","o2","4","o3","2","o4","5"));
        MultiChoice Pa2 = new MultiChoice("Pa2","Sabendo que o valor de x = 1 e que houve a instrução x++  e depois x=x+3 qual o valor atual de x");
        for (int i = 0; i < 8; i += 2){
            multichoiceoption_object = new MultiChoiceOption(multichoiceoptions_string.get(i),multichoiceoptions_string.get(i+1));
            Pa2.addOption(multichoiceoption_object); 
        }
        quiz.addQuestion(Pa2);      

        MultiChoiceOption b5 = new MultiChoiceOption("b5", "Long");
        question_names = new String[] {"Pa1"};
        for (String g1 : question_names) {
            Question question = quiz.getQuestion(g1);
            question.addOption(b5);
        }

        questions_string = new ArrayList<Question>(Arrays.asList(Pa1));
        for (Question question : questions_string) {
            question.defineAnswer("b3");
        }
        MultiChoiceOption o6 = new MultiChoiceOption("o6", "7");
        question_names = new String[] {"Pa2"};
        for (String g1 : question_names) {
            Question question = quiz.getQuestion(g1);
            question.addOption(o6);
        }

        questions_string = new ArrayList<Question>(Arrays.asList(Pa2));
        for (Question question : questions_string) {
            question.defineAnswer("o6");
        }


        multichoiceoptions_string = new ArrayList<String>(Arrays.asList("w1","while","w2","do while","w3","for"));
        MultiChoice Pa3 = new MultiChoice("Pa3","Qual destes não é um loop em java:");
        for (int i = 0; i < 6; i += 2){
            multichoiceoption_object = new MultiChoiceOption(multichoiceoptions_string.get(i),multichoiceoptions_string.get(i+1));
            Pa3.addOption(multichoiceoption_object); 
        }
        quiz.addQuestion(Pa3);      

        MultiChoiceOption tudo = new MultiChoiceOption("tudo", "Nenhuma das anteriores");
        quiz.addOptionToAll(tudo);
        questions_string = new ArrayList<Question>(Arrays.asList(Pa3));
        for (Question question : questions_string) {
            question.defineAnswer("tudo");
        }


        multichoiceoptions_string = new ArrayList<String>(Arrays.asList("o1","Olá","o2","Bom dia","o3","Adeus","o4","Viva"));
        MultiChoice P1 = new MultiChoice("P1","O que quer dizer Adios em português?");
        for (int i = 0; i < 4; i += 2){
            multichoiceoption_object = new MultiChoiceOption(multichoiceoptions_string.get(i),multichoiceoptions_string.get(i+1));
            P1.addOption(multichoiceoption_object); 
        }
        quiz.addQuestion(P1);      
        shortquestion_answers = new ArrayList (Arrays.asList(".g4"));
        ShortQ P2 = new ShortQ("P2","Extensão de um ficheiro de gramática de ANTLR-4?",shortquestion_answers);
        quiz.addQuestion(P2);
        shortquestion_answers = new ArrayList (Arrays.asList("Ronaldo"));
        ShortQ P3 = new ShortQ("P3","Cristiano ________",shortquestion_answers);
        quiz.addQuestion(P3);
        Numeric P4 = new Numeric("P4","Pi (com duas casas decimais):",3.14);
        quiz.addQuestion(P4);

        questions_string = new ArrayList<Question>(Arrays.asList(P1,P2,P3,P4));
        groups_string = new ArrayList<Group>(Arrays.asList(GrupoFinal));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        questions_string = new ArrayList<Question>(Arrays.asList(Pa1,Pa2,Pa3));
        groups_string = new ArrayList<Group>(Arrays.asList(Grupo1));
        for (Question pergunta : questions_string) {
            for (Group grupo : groups_string) {
                quiz.addQuestion(pergunta,grupo.getName());
            }    
        }
        questions_string = new ArrayList<Question>(Arrays.asList(P1));
        for (Question question : questions_string) {
            question.defineAnswer("o1");
        }

        Pa1.defineMark(4.0);
        Pa2.defineMark(4.0);
        Pa3.defineMark(4.0);

        g = quiz.getGroup("Grupo1");
        Pa2.shuffle();
        options = new String[] {"o1","o2","o4","o6"};
        Pa2.show(options);
        quiz.getAnswer("Pa2");
        Pa1.shuffle();
        Pa1.show(null);
        quiz.getAnswer("Pa1");
        Pa3.show(null);
        quiz.getAnswer("Pa3");

        P1.defineMark(1.0);
        P2.defineMark(3.0);
        quiz.getQuestion("P2").wrongAction("repeat", new String[] {"2.0", "1.0"});
        P3.defineMark(1.0);
        P4.defineMark(4.0);
        quiz.getQuestion("P4").wrongAction("show", new String[] {"P3"});

        g = quiz.getGroup("GrupoFinal");
        P2.show(null);
        quiz.getAnswer("P2");
        P4.show(null);
        quiz.getAnswer("P4");


        quiz.createReport();
        quiz.finishQuiz();

    }
} 