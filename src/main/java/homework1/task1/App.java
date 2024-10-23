package homework1.task1;

import homework1.task1.logic.OptionalService;
import homework1.task1.model.Archive;
import homework1.task1.model.Course;
import homework1.task1.model.Educator;

public class App {
    public static void main(String[] args) {
        Archive archive = new Archive();
        Educator educator = new Educator("Егор", "Филиппов", 37);
        Course course = educator.createCourse("Многопоточность");
        OptionalService.addStudentsToCourse(course);
        OptionalService.setGradesAndAddToArchive(educator, course, archive);
        OptionalService.showArchive(archive);
    }
}
