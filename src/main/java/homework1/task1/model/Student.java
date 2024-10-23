package homework1.task1.model;

import java.util.ArrayList;

public class Student extends Human {
    private ArrayList<Course> courses;

    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
        courses = new ArrayList<>();
    }

    public void registerToCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
