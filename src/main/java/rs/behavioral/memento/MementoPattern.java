package rs.behavioral.memento;

public class MementoPattern {

    public static void run() {
        System.out.println("=== Memento Pattern ===");
        var c = new Course(new CourseData("Java", "Java basics", 401));
        var ch = new CourseHistory(c);
        System.out.println("Initial course: " + c);
        ch.update(new CourseData("C++", "C++ basics", 555));
        System.out.println("Course update 1: " + c);
        ch.update(new CourseData("Python", "Python basics", 399));
        System.out.println("Course update 2: " + c);
        ch.undo();
        System.out.println("Restored course: " + c);
        System.out.println();
    }
}
