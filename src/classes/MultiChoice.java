package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MultiChoice extends Question {
    HashMap<String, Option> multiOptions = new HashMap<>();
    ArrayList<String> correctAnswer = new ArrayList<>();
    String userAnswer = null;
    boolean shuffle = false;
    List<String> keys;

    public MultiChoice(String id, String text) {
        super(id, text, true);
    }
    
    public void show(String[] options) {
        if (options != null) {
            for (String op : options) {
                if (!multiOptions.containsKey(op)) {
                    System.err.println("MultiChoice question with the ID " + this.getId() + " does not have an option with the id " + op);
                    return;
                }
            }
        }

        System.out.println(this.getText());

        List<String> keys;

        if (options != null) {
            keys = new ArrayList<>();
            int x = 1;
            for (String op : options) {
                keys.add(multiOptions.get(op).getId());
                System.out.println(x + " - " + multiOptions.get(op).getText());
                x++;
            }
        }
        else {
            keys = new ArrayList<>(multiOptions.keySet());

            if (shuffle) {
                Collections.shuffle(keys);
            }
            
            int x = 1;
            for (String op : keys) {
                System.out.println(x + " - " + multiOptions.get(op).getText());
                x++;
            }
        }

        this.keys = keys;
    }

    public void setUserAnswer(String answer) {
        int i = Integer.parseInt(answer);

        if (i > this.multiOptions.size()) {
            System.err.println("Invalid answer.");
        }
        else {
            List<String> keys = new ArrayList<>(multiOptions.keySet());
            this.userAnswer = keys.get(i-1);
        }
    }

    public String getUserAnswer() {
        return this.multiOptions.get(this.userAnswer).getText();
    }

    public String getType() {
        return "MultiChoice";
    }

    public ArrayList<String> getCorrectAnswers() {
        return this.correctAnswer;
    }

    public ArrayList<String> getOptions() {
        ArrayList<String> options = new ArrayList<>();

        for (String opid : this.multiOptions.keySet()) {
            options.add(opid);
        }

        return options;
    }

    public void getAnswer() {
        System.out.println("Enter your answer: ");

        String answer;
        
        boolean ok = false;
        do {
            answer = Quiz.sc.nextLine();

            if (answer.matches("[0-9]+")) {
                int x = Integer.parseInt(answer);
                if (x <= this.keys.size()) {
                    ok = true;
                }
                else {
                    System.out.println("Invalid answer.");
                    ok = false;
                }
            }
            else {
                System.out.println("Invalid answer.");
                ok = false;
            }
        } while (!answer.matches("[0-9]+") || !ok);

        this.setUserAnswer(answer);
    }

    public Option getOption(String id) {
        if (!this.multiOptions.containsKey(id)) {
            return null;
        }

        return this.multiOptions.get(id);
    }

    public void removeOption(String id) {
        if (!this.multiOptions.containsKey(id)) {
            System.err.println("This question does not contain an option with the id " + id);
        }
        else {
            this.multiOptions.remove(id);
        }
    }

    public void shuffle() {
        this.shuffle = true;
    }

    public boolean correct(){
        int x = Integer.parseInt(this.userAnswer);
        if (this.correctAnswer.contains(this.keys.get(x - 1))) {
            return true;
        }
        return false;
    }

    public void addOption(Option op) {
       
        if (!this.multiOptions.containsKey(op.getId())) {
            this.multiOptions.put(op.getId(), op);
        }
        else {
            System.err.println("This MultiChoice question, " + this.getId() + ", already has an option with the ID " + op.getId());
        }
    }

    public void defineAnswer(String opName) {
        if (!correctAnswer.contains(opName)) {
            correctAnswer.add(opName);
        }
        else {
            System.err.println("This MultiChoice question, " + this.getId() + ", has already been added as a solution to this question.");
        }
    }
}
