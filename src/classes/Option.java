package classes;

public abstract class Option {

    private String id, text;

    public Option(String id, String text) {
        this.id = id;
        this.text = text;
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

    public abstract int getSide();
    public abstract String getMatch();
    public abstract String getType();

}
