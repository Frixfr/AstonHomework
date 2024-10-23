package homework1.task1.logic;

import homework1.task1.model.*;

import java.util.HashSet;

public class OptionalService {
    private OptionalService() {
    }

    public static void showArchive(Archive archive) {
        for (Student student : archive.getJournal().keySet()) {
            System.out.println(student + "\t" + archive.getJournal().get(student));
        }
    }

    public static void setGradesAndAddToArchive(Educator educator, Course course, Archive archive) {
        HashSet<Student> students = course.getStudents();
        for (Student student : students) {
            int grade = (int) (Math.random() * 5 + 1);
            Evaluation evaluation = educator.giveGrade(grade, commentOfGrade(grade));
            archive.writeToJournal(student, evaluation);
        }
    }

    public static void addStudentsToCourse(Course course) {
        for (int i = 0; i < 20; i++) {
            Student student = new Student("Алексей" + i, "Петров" + i, 22 + i);
            student.registerToCourse(course);
        }
    }

    private static String commentOfGrade(int grade) {
        return switch (grade) {
            case 1 -> "Очень плохо, старайся больше!";
            case 2 -> "Плохо, еще всё впереди";
            case 3 -> "Удовлетворительно, ты можешь лучше";
            case 4 -> "Хорошо, ты почти лучший";
            case 5 -> "Отлично, продолжай в том же духе";
            default -> "Неправильная оценка";
        };
    }
}
