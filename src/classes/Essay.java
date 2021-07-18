package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Essay extends Question {
    String userAnswer = null;
    
    public Essay(String id, String text) {
        super(id, text);
    }

    public void show(String[] options) {
        System.out.println(this.getText());
    }

    public void shuffle(){
        System.out.println("Essay type questions cannot be shuffled.");
    }

    public void setUserAnswer(String answer) {
        this.userAnswer = answer;
    }

    public void getAnswer() {
        System.out.println("Enter your answer: ");

        String answer = Quiz.sc.nextLine();

        this.setUserAnswer(answer);
    }

    public String getUserAnswer() {
        return this.userAnswer;
    }

    public String getType() {
        return "Essay";
    }

    public ArrayList<String> getCorrectAnswers() {
        System.out.println("Essay type questions do not have answers.");
        return null;
    }

    public ArrayList<String> getOptions() {
        System.out.println("Essay type questions do not have options.");
        return null;
    }

    public Option getOption(String id) {
        System.out.println("Essay type questions do not have options.");
        return null;
    }

    public void removeOption(String id) {
        System.out.println("Essay type questions do not have options.");
    }

    public boolean correct(){
        System.out.println("Essay type questions cannot be corrected automatically.");
        return false;
    }

    public void addOption(Option op) {
        System.out.println("Essay type questions do not have options.");
    }

    public void defineAnswer(String opName) {
        System.err.println("Essay type questions cannot be corrected automatically, so they do not have an option to define answers.");
    }

}
