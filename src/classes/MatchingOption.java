package classes;

public class MatchingOption extends Option {

    private int side;
    private String match;

    public MatchingOption(String id, String text, int side, String match) {
        super(id,text);
        this.side = side;
        this.match = match;
    }

    public int getSide() {
        return this.side;
    }

    public String getMatch() {
        return this.match;
    }

    public String getType() {
        return "Matching";
    }

}