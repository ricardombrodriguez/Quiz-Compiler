package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Matching extends Question {
    HashMap<String, Option> side1Options= new HashMap<>();
    HashMap<String, Option> side2Options= new HashMap<>();
    HashMap<String, String> userAnswer = new HashMap<>();
    boolean shuffle = false;
    List<String> keysSide1;
    List<String> keysSide2;

    public Matching(String id, String text) {
        super(id, text, false);
    }

    public void setUserAnswer(String answer) {
        String[] x = answer.split(" ");

        if (!this.side1Options.containsKey(x[0])) {
            System.err.println(x[0] + " is not a valid option in question " + this.getId() + " side 1.");
            return;
        }
        if (!this.side2Options.containsKey(x[1])) {
            System.err.println(x[1] + " is not a valid option in question " + this.getId() + " side 2.");
            return;
        }

        this.userAnswer.put(x[0], x[1]);
    }

    public String getUserAnswer() {
        String ret = "";
        for (String op : this.userAnswer.keySet()) {
            ret += op;
            ret += " -> ";
            ret += this.userAnswer.get(op);
            ret += "\n";
        }
        return ret;
    }

    public String getType() {
        return "Matching";
    }

    public ArrayList<String> getCorrectAnswers() {
        System.out.println("Matching type questions do not have answers.");
        return null;
    }

    public ArrayList<String> getOptions() {
        ArrayList<String> options = new ArrayList<>();

        for (String opid : this.side1Options.keySet()) {
            options.add(opid);
        }

        for (String opid : this.side2Options.keySet()) {
            options.add(opid);
        }

        return options;
    }

    public Option getOption(String id) {
        if (!this.side1Options.containsKey(id) && !this.side2Options.containsKey(id) ) {
            return null;
        }
        else if (!this.side2Options.containsKey(id)) {
            return this.side1Options.get(id);
        }
        else if (!this.side1Options.containsKey(id)) {
            return this.side2Options.get(id);
        }
        return null;
    }
    
    public void show(String[] answers) {
        System.out.println(this.getText());

        List<String> keys = new ArrayList<>(this.side1Options.keySet());

        if (shuffle) {
            Collections.shuffle(keys);
        }

        this.keysSide1 = keys;
        
        int x = 1;
        for (String op : keys) {
            System.out.println(x + " - " + this.side1Options.get(op).getText());
            x++;
        }

        List<String> keys2 = new ArrayList<>(this.side2Options.keySet());

        if (shuffle) {
            Collections.shuffle(keys2);
        }

        this.keysSide2 = keys2;
        
        int y = 0;
        for (String op : keys2) {
            System.out.println(Character.toString ((char) (65 + y)) + " - " + this.side2Options.get(op).getText());
            y++;
        }
    }

    public void shuffle(){
        this.shuffle = true;
    }

    public boolean correct(){
        // o user answer tem como chave as options do side 1, por isso se for mais pequeno é porque não respondeu a tudo e está errado

        if (this.userAnswer.size() != this.side1Options.size()) {
            return false;
        }

        for (String side1_op : this.userAnswer.keySet()) {         
            if (!this.side1Options.get(side1_op).getMatch().equals(this.userAnswer.get(side1_op))) {
                return false;
            }
        }

        return true;
    }

    public void getAnswer() {
        System.out.println("Enter your answer (1 - a): ");

        String answer;
        String ret = "";
        
        boolean ok1 = false;
        boolean ok2 = false;

        int c = 1;
        while(c <= this.keysSide1.size()) {
            do {
                answer = Quiz.sc.nextLine();
                if (answer.contains("-")) {
                    String[] s = answer.split("-");

                    if (s[0].trim().matches("[0-9]+")) {
                        int x = Integer.parseInt(s[0].trim());
                        
                        if (x <= this.keysSide1.size()) {
                            ok1 = true;
                            ret += this.keysSide1.get(x-1);
                        }
                        else {
                            System.out.println("Invalid answer.");
                            break;
                        }
                    }
                    if (s[1].trim().matches("[a-zA-Z]")) {
                        int x = (int) s[1].trim().charAt(0) - 65;

                        if (x < this.keysSide2.size()) {
                            ok2 = true;
                            ret += " " + this.keysSide2.get(x);
                        }
                        else {
                            System.out.println("Invalid answer.");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Invalid answer.");
                }
            } while (!answer.matches("[0-9]+") && !ok1 && !ok2);
     
            this.setUserAnswer(ret);
            ret = "";
            c++;
            ret = "";
        }

        
    }

    public void addOption(Option op) {
        if (op.getSide() == 0) {
            this.side1Options.put(op.getId(), op);
        }
        else if (op.getSide() == 1) {
            this.side2Options.put(op.getId(), op);
        }
    }

    public void removeOption(String id) {
        System.err.println("Cannot remove options");
    }

    public void defineAnswer(String opName) {
        System.err.println("Matching type questions do not have a method to define answers.");
    }
}
