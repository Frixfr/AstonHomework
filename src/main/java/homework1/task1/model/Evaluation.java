package homework1.task1.model;

public class Evaluation {
    private final int evaluation;
    private final String comment;

    public Evaluation(int evaluation, String comment) {
        this.evaluation = evaluation;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "evaluation=" + evaluation +
                ", comment='" + comment + '\'' +
                '}';
    }
}
