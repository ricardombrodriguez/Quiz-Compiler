package classes;

import java.util.HashMap;

public class Group {
    private String name;
    HashMap<String, Question> questions = new HashMap<>();
    HashMap<String, Question> answered_questions = new HashMap<>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addQuestion(Question q) {
        this.questions.put(q.getId(), q);
    }

    public Question getQuestion(String id) {
        if (this.questions.containsKey(id)) {
            return this.questions.get(id);
        }

        System.err.println("There is not a question with the id " + id + " in the " + this.name + " group.");
        return null;
    }
}
