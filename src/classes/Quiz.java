package classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {
    //fazer um método showGroup que faz show a todas as perguntas do grupo
    //o autocorrective devia ter um inteiro em vez de um booleano (ex: set auto-corrective 20)

    //algo para fazer as cotações no total terem de ser 100 %
    private String name;
    private boolean autocorrective = false;
    private Group defaultGroup = new Group("");
    private HashMap<String, Group> groups = new HashMap<>();
    private HashMap<String, ArrayList<String>> group_questions = new HashMap<>();
    private HashMap<String, Option> options = new HashMap<>();
    private double mark;
    private double actualMark;
    private boolean createReport = false;
    private ArrayList<String> answered_questions = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public Quiz(String name) {
        this.name = name;
        this.groups.put("", this.defaultGroup);
        this.group_questions.put("", new ArrayList<>());
    }

    public void setAutoCorrective(boolean val) {
        this.autocorrective = val;
    }

    public void addQuestion(Question q) {
        this.defaultGroup.addQuestion(q);
        this.group_questions.get("").add(q.getId());
    }

    public void addQuestion(Question q, String id) {
        this.groups.get(id).addQuestion(q);
        this.group_questions.get(id).add(q.getId());
    }

    public Question getQuestion(String question_id) {
        for (String group_id : group_questions.keySet()) {
            if (group_questions.get(group_id).contains(question_id)) {
                return groups.get(group_id).getQuestion(question_id);
            }
        }
        
        return null;
    }

    public String getChoice(String q1_id, String[] options_q1, String q2_id, String[] options_q2) {
        System.out.println("You can chose one question to answer from the following: ");

        Question q1 = this.getQuestion(q1_id);
        if (q1 == null) {
            System.err.println("Question with id "+ q1_id +" does not exist");
            return null;
        }
        Question q2 = this.getQuestion(q2_id);
        if (q2 == null) {
            System.err.println("Question with id "+ q2_id +" does not exist");
            return null;
        }

        System.out.println("Option 1:");
        q1.show(options_q1);
        System.out.println("Option 2:");
        q2.show(options_q2);

        boolean ok = false;
        do {
            System.out.println("You prefer option 1 or 2? (1/2)");
            String x = sc.nextLine();

            if (x.trim().matches("1|2")) {
                if (x.trim().equals("1")) {
                    return q1_id;
                }
                else if (x.trim().equals("2")) {
                    return q2_id;
                }
            }
            else {
                System.err.println("Invalid choice.");
            }
        } while(!ok);
        return "";
    }

    public void defineMark(double m) {
        this.mark = m;
    }

    public void addOption(Option op) { // se só receber uma opção é para adicionar ao quiz
        if (!this.options.keySet().contains(op.getId())) {
            this.options.put(op.getId(), op);
        }
        else {
            System.err.println("Option " + op.getId() + " already exists.");
        }
    }

    public Option getOption(String op_id) {
        if (this.options.keySet().contains(op_id)) {
            return this.options.get(op_id);
        }
        else {
            System.err.println("Option " + op_id + " does not exist.");
            return null;
        }
    }

    public void addOption(String id, Option op) { // se receber uma pergunta e uma opção, é para adicionar a opção à pergunta 
        Question q = this.getQuestion(id);

        if (q != null) {
            if (q.canAddOption()) {
                q.addOption(op);
            }
            else {
                System.err.println("Question " + id + " does not have options.");
            }
        }
    }

    public void addGroup(Group g) {
        if (g.getName().length() == 0) {
            System.err.println("The group name cannot be empty.");
            return;
        }

        if (!this.groups.containsKey(g.getName())) {
            this.groups.put(g.getName(), g);
            this.group_questions.put(g.getName(), new ArrayList<>());
        }
        else {
            System.err.println("This quiz already has a group with the name " + g.getName());
        }
    }

    public Group getGroup(String name) {
        if (this.groups.containsKey(name)) {
            return this.groups.get(name);
        }
        else {
            System.err.println("This quiz does not have a group with the name " + name);
            return null;
        }
    }

    public void showQuestion(String questionId, String[] optionsId) {
        Question q = this.defaultGroup.getQuestion(questionId);

        if (q != null) {
            if (q.canAddOption()) {
                q.show(optionsId);
            }
            else {
                System.err.println("Question " + questionId + "does not have options.");
            }
        }        
    }

    public void showQuestion(String questionId) {
        Question q = this.defaultGroup.getQuestion(questionId);

        if (q != null) {
            q.show(null);
        }
    }

    public void defineAnswer(String questionId, Option op) {
        Question q = this.defaultGroup.getQuestion(questionId);

        if (q != null) {
            q.defineAnswer(op.getId());
        }
    }

    public void createReport() {
        this.createReport = true;
    }

    public void finishQuiz() {
       
        try {
            FileWriter myWriter = new FileWriter("ret.txt");
            Question res =null;
            String pergunta ="";
            String answer ="";
            String ret= "";
            String correct ="";
            System.out.println(answered_questions);
            System.out.println("\n");
            System.out.println("================================== Report ==================================");
            for (String a : answered_questions){
                res = this.getQuestion(a);
                pergunta= res.getText();
                answer=res.getUserAnswer();
                ret = "Pergunta: " + pergunta + " \nResposta: " + answer.replaceAll("\n", ",");
                if (this.autocorrective){
                    ret += '\n Mark:' + res.getMark();
                }
                ret += "\n============================================================================";
                ret+="\n";
                System.out.println(ret);
                myWriter.write(ret);
            }
            if (this.autocorrective){
                myWriter.write("Nota final: "+this.actualMark+"/"+this.mark);
                System.out.println("Nota final: "+this.actualMark+"/"+this.mark);
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
      
        sc.close();
    }

    public void getAnswer(String questionId) {
    
        Question q = this.getQuestion(questionId);
        Double mark = null;

        if (q != null) {
            mark = q.getMark();
            q.getAnswer();
            this.answered_questions.add(q.getId());      

            if (q.wrongDefined() && !q.correct()) {
                if (q.getWrongAction().equals("show")) {
                    this.showQuestion(q.getWrongShow());
                    this.getAnswer(q.getWrongShow());
                }
                else {
                    double c = 1;
                    mark = mark - q.getWrongDiscount();
                    while (c <= q.getRepeatTimes() && !q.correct()) {
                        mark = mark - q.getWrongDiscount();
                        c++;
                        q.getAnswer();                        
                    }
                }
            }

            if (q.correct() && this.autocorrective) {
                System.out.println("+" + mark);
                this.actualMark += mark;
            }
        }
    }

    public void addOptionToAll(Option op) {
        if (op != null) {
            if (!op.getType().equals("MultiChoice")) {
                System.err.println("Only multichoice options can be added to questions.");
            }
            else {
                for (String group_id : this.group_questions.keySet()) {
                    for (String question_id : this.group_questions.get(group_id)) {
                        Question q = this.getQuestion(question_id);
                        if (q != null) {
                            if (q.getType().equals("MultiChoice")) {
                                q.addOption(op);
                            }
                        }
                    }
                }
            }
        }
    }

}