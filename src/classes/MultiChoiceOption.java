package classes;

public class MultiChoiceOption extends Option {

    public MultiChoiceOption(String id, String text) {
        super(id, text);
    }

    public int getSide() {
        System.err.println("MultiChoice type options do not have a side.");
        return 0;
    }

    public String getMatch() {
        System.err.println("MultiChoice type options do not have a match.");
        return "";
    }

    public String getType() {
        return "MultiChoice";
    }

}