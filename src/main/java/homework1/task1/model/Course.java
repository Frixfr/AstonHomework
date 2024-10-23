package homework1.task1.model;

import java.util.HashSet;

public class Course {
    private final String name;
    private final Educator educator;
    private final HashSet<Student> students;

    public Course(Educator educator, String name) {
        this.name = name;
        this.educator = educator;
        students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public Educator getEducator() {
        return educator;
    }
}
