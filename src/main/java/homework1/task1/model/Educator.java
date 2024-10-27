package homework1.task1.model;

import java.util.ArrayList;
import java.util.Objects;

public class Educator extends Human {
    private ArrayList<Course> courses;

    public Educator(String name, String lastName, int age) {
        super(name, lastName, age);
        courses = new ArrayList<>();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Course createCourse(String nameCourse) {
        Course course = new Course(this, nameCourse);
        courses.add(course);
        return course;
    }

    public Evaluation giveGrade(int grade, String comment) {
        return new Evaluation(grade, comment);
    }

    @Override
    public String toString() {
        return "Educator{" +
                "name='" + super.getName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
