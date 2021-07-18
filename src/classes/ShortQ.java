package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortQ extends Question {
    ArrayList<String> correctAnswer =null;
    String userAnswer = null;

    public ShortQ(String id, String text) {
        super(id, text);
    }

    public ShortQ(String id, String text, ArrayList<String> answer) {
        super(id, text);
        this.correctAnswer = answer;
    }
    
    public void show(String[] answers) {
        System.out.println(this.getText());
    }

    public void shuffle(){
        System.err.println("Short type questions cannot be shuffled.");
    }

    public void setUserAnswer(String answer) {
        this.userAnswer = answer;
    }

    public String getUserAnswer() {
        return this.userAnswer;
    }

    public String getType() {
        return "Short";
    }

    public ArrayList<String> getCorrectAnswers() {
        ArrayList<String> answers = new ArrayList<>();
        
        for (String op : this.correctAnswer) {
            answers.add(op);
        }

        return answers;
    }

    public void getAnswer() {
        System.out.println("Enter your answer: ");

        String answer = Quiz.sc.nextLine();

        this.setUserAnswer(answer);
    }

    public ArrayList<String> getOptions() {
        System.out.println("Short type questions do not have options.");
        return null;
    }

    public Option getOption(String id) {
        System.out.println("Short type questions do not have options.");
        return null;
    }

    public void removeOption(String id) {
        System.out.println("Short type questions do not have options.");
    }

    public boolean correct(){
        if (this.correctAnswer == null) {
            System.err.println("No solution defined.");
            return false;
        }
        else if (this.userAnswer == null) {
            System.err.println("The user has not answered this question yet.");
            return false;
        }

        for (String an : this.correctAnswer) {
            if (an.equals(this.userAnswer)) {
                return true;
            }
        }
        return false;
    }

    public void addOption(Option op) {
        System.err.println("Short type questions do not have options.");
    }

    public void defineAnswer(String opName) {
        System.err.println("Short type questions do not have a method to define answers.");
    }

}
