package classes;

import java.util.ArrayList;

public abstract class Question {
    
    private String id, text;
    private boolean canAddOption = false;
    private boolean wrongDefined = false;
    private String wrongAction;
    private String wrongQuestionId;
    private Double wrongRepeatTimes;
    private Double wrongRepeatDiscount;
    private Double mark = null;
    
    public Question(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public Question(String id, String text, boolean canAdd) {
        this.id = id;
        this.text = text;
        this.canAddOption = canAdd;
    }
 
    public abstract void show(String[] options);
    public abstract void shuffle();
    public abstract boolean correct();
    public abstract void addOption(Option op);
    public abstract void defineAnswer(String opName);
    public abstract void setUserAnswer(String answer);
    public abstract String getUserAnswer();
    public abstract void getAnswer();
    public abstract String getType();
    public abstract ArrayList<String> getCorrectAnswers();
    public abstract ArrayList<String> getOptions();
    public abstract Option getOption(String id);
    public abstract void removeOption(String id);

    public void defineMark(double m) {
        this.mark = m;
    }

    public Double getMark() {
        return this.mark;
    }

    public void wrongAction(String command, String[] options) {
        this.wrongDefined = true;
        this.wrongAction = command;

        if (command.equals("show")) {
            this.wrongQuestionId = options[0];
        }
        else if (command.equals("repeat")) {
            this.wrongRepeatTimes = Double.parseDouble(options[0]);
            this.wrongRepeatDiscount = Double.parseDouble(options[1]);
        }
    }
    
    public boolean canAddOption() { // short e long não podem
        return this.canAddOption;
    }

    public String getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return getText() ;            
    }

    public boolean wrongDefined() {
        return this.wrongDefined;
    }

    public String getWrongAction() {
        return this.wrongAction;
    }

    public String getWrongShow() {
        return this.wrongQuestionId;
    }

    public double getWrongDiscount() {
        return this.wrongRepeatDiscount;
    }

    public double getRepeatTimes() {
        return this.wrongRepeatTimes;
    }

}
