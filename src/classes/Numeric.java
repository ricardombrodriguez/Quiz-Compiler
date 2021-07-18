package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeric extends Question {
    Double correctAnswer = null;
    Double userAnswer = null;

    public Numeric(String id, String text) {
        super(id, text);
    }

    public Numeric(String id, String text, double answer) {
        super(id, text);
        this.correctAnswer = answer;
    }
    
    public void show(String[] answers) {
        System.out.println(this.getText());
    }

    public void shuffle(){
        System.err.println("Numeric type questions cannot be shuffled.");
    }

    public void setUserAnswer(String answer) {
        try {
            this.userAnswer = Double.parseDouble(answer);            
        } catch (Exception e) {
            System.err.println("Numeric type questions expect a numeric answer.");
        }
    }

    public String getUserAnswer() {
        return this.userAnswer.toString();
    }

    public String getType() {
        return "Numeric";
    }

    public ArrayList<String> getCorrectAnswers() {
        ArrayList<String> answers = new ArrayList<>();
        answers.add(this.correctAnswer.toString());
        return answers;
    }

    public void getAnswer() {
        System.out.println("Enter your answer: ");

        String answer = Quiz.sc.nextLine();

        while(!answer.matches("[0-9]+(.[0-9]+)?")){
            System.out.println("Invalid answer, expecting a number");
            System.out.println("Enter your answer: ");
            answer = Quiz.sc.nextLine();
        }

        this.setUserAnswer(answer);
    }

    public ArrayList<String> getOptions() {
        System.out.println("Numeric type questions do not have options.");
        return null;
    }

    public Option getOption(String id) {
        System.out.println("Numeric type questions do not have options.");
        return null;
    }

    public void removeOption(String id) {
        System.out.println("Numeric type questions do not have options.");
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

        return this.correctAnswer.equals(this.userAnswer);
    }

    public void addOption(Option op) {
        System.err.println("Numeric type questions do not have options.");
    }

    public void defineAnswer(String opName) {
        System.err.println("Numeric type questions do not have a method to define answers.");
    }
}
