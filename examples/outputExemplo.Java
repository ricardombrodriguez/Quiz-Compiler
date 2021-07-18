// Exemplo de como deve ficar o código gerado:

import java.util.Arraylist;
import java.util.HashMap;

public class outputExemplo {

    //funções
    //.....

    public static void main(String[] args) {

        //verificar na semântica se o quiz já foi criado antes da adição de perguntas e outras coisas
        //o show report só é mostrado se existir 1 ou mais questions
        //o create report n pode ser invocado antes que o show report

        //criar um auto-corrective quiz com nota máxima 20
        //o programa já sabe que é a variável quiz que armazena todas as questions
        ArrayList<Question> questions = new ArrayList<Question>();

        Quiz quiz = new Quiz("Quiz de cultura geral:",20);

        //ver se é preciso adicionar uma descrição ao grupo para aparecer no show do quiz
        Group cores = new Group("cores");
        Group geografia = new Group("geografia");
        Group futebol = new Group("futebol");

        MultiChoice p1 = new MultiChoice("p1","Cores do rgb?");
        // ver se é preciso add o id da pergunta
        MultiChoiceOption o1 = new MultiChoiceOption("p1","o1","Red green blue");
        MultiChoiceOption o2 = new MultiChoiceOption("p1","o2","Red green blue");
        MultiChoiceOption o3 = new MultiChoiceOption("p1","o3","Red green blues");
        MultiChoiceOption o4 = new MultiChoiceOption("p1","o4","Red green blue");
        p1.setTexto("Quais são as cores do RGB?");
        p1.addOption(o1);
        p1.addOption(o2);
        p1.addOption(o3);
        p1.addOption(o4);

        Matching p2 = new Matching("p2","Capitais de países:");
        MatchingOption m1 = new MatchingOption("p2","m1","Portugal",0,"m3");
        MatchingOption m2 = new MatchingOption("p2","m2","Espanha",0,"m4");
        MatchingOption m3 = new MatchingOption("p2","m3","Lisboa",1,"m1");
        MatchingOption m4 = new MatchingOption("p2","m4","Madrid",1,"m2");
        p2.setTexto("Associe os países às suas capitais:");
        p2.addOption(m1);
        p2.addOption(m2);
        p2.addOption(m3);
        p2.addOption(m4);

        Essay p3 = new Essay("essay1","Faça uma composição escrita sobre a geografia de Aveiro.");

        Short p4 = new Short("p4","Capital do uruguay")
        p4.setAnswer("Montevideo");

        MultiChoice p5 = new MultiChoice("p5","Melhor clube nacional?");
        // ver se é preciso add o id da pergunta
        MultiChoiceOption o5 = new MultiChoiceOption("p5","o5","FC Porto",1);
        MultiChoiceOption o6 = new MultiChoiceOption("p5","o6","Benfica",0);
        MultiChoiceOption o7 = new MultiChoiceOption("p5","o7","Sporting",0);
        MultiChoiceOption o8 = new MultiChoiceOption("p5","o8","Santa Clara",0);
        MultiChoiceOption o9 = new MultiChoiceOption("p5","o9","SC Braga",0);
        MultiChoiceOption o10 = new MultiChoiceOption("p5","o10","Nacional",0);
        p5.addOption(o5);
        p5.addOption(o6);
        p5.addOption(o7);
        p5.addOption(o8);
        p5.addOption(o9);
        p5.addOption(o10);
        p5.removeOption(o10);   //remove o10 from p5


        cores.addQuestion(p1);

        geografia.addQuestion(p2);
        geografia.addQuestion(p3);
        geografia.addQuestion(p4);

        futebol.addQuestion(p5);

        MultiChoiceOption abcde = new MultiChoiceOption("abcde","Nenhuma das anteriores.");
        addOptionToAll(abcde);  //adiciona option a todas as multichocie


        // o id n é necessáriamente incrementado, é aquele que o utilizador introduz (uma short question pode vir com a resposta já definida no construtor (?))
        Short random_question_id = new Short("random_question_id","Pior cidade nacional","Ovar");
        random_question_id.addAnswer("Furadouro");
        random_question_id.addAnswer("Viseu");
        //uma short question pode ter mais do que uma resposta correta (devem ser adicionadas a um arraylist no objeto Short criado)

        geografia.addQuestion(random_question_id);

        // add blabla to p5
        MultiChoiceOption blabla = new MultiChoiceOption("p5","blabla","CD Estarreja",1);
        p5.addOption(blabla);

        // define-answer "3.14" to num1
        Numeric num1 = new Numeric("num1","Pi com duas casas decimais: ");
        num1.setAnswer("3.14");


        /* LOAD

        - ver como se pode conetar com a gramática/visitor auxiliar para fazer a leitura dos tokens e a avaliação semântica
        - talvez deviamos um arraylist com nome de variável igual ao ficheiro de banco de perguntas que armazenava todas as questões e depois com o from BP import P1,P3
        - adicionavamos essas perguntas ao quiz atual
        - load acaba quando o ficheiro do BP é lido
        */

        //faz-se load do ficheiroinput.txt (retrieve de todas as questions)
        Scanner sc = new Scanner(new File("ficheiroinput.txt"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if line.contains("multi-choice") {

            } 
            else if (line.contains("matching")) {

            }
            else if (line.contains("short-question")) {

            }
            else if (line.contains("numeric-question")) {

            }
            else if (line.contains("essay")) {

            }
            else {

            }
    
        }

        // from bancoperguntas import P1, P4

        //ir ao arraylist do banco perguntas, retirar as que queremos e adicionar ao arraylist de questions do quiz
        // verificar id's repetidos e isso




        //mostrar pergunta a pergunta e espera pelo output do utilizador


        finishQuiz();

        /* show report:

        - varia se é autocorrective ou não
        - se for, aquilo mostra o texto pergunta a pergunta e espera pelo input do utilizador (deve haver um ESCAPE para saber, por exemplo, quando é que acaba
        - a resposta para um essay)
        - ver se é preciso criar atributos nas classes para guardar resposta dos utilizadores
        - mostrar perguntas na forma como foi definido

        */

        showReport();
        

        /* create report:

        - quando é autocorrective, o aluno deve obter um relatório final sobre o seu desempenho
        - pode mostrar (se conseguirmos) a resposta certa e quando é que obteve por questão

        */
        createReport();


    }

}
