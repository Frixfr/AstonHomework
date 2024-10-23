package homework1.task1.model;

import java.util.HashMap;

public class Archive {
    private HashMap<Student, Evaluation> journal;

    public Archive() {
        journal = new HashMap<>();
    }

    public HashMap<Student, Evaluation> getJournal() {
        return journal;
    }

    public void setJournal(HashMap<Student, Evaluation> journal) {
        this.journal = journal;
    }

    public void writeToJournal(Student student, Evaluation evaluation) {
        journal.put(student, evaluation);
    }
}
