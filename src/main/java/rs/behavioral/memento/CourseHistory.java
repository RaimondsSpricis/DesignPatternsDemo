package rs.behavioral.memento;

import java.util.Stack;

public class CourseHistory {
    private Course course;
    private Stack<CourseMemento> history = new Stack<>();

    public CourseHistory(Course course) {
        this.course = course;
    }

    public void update(CourseData data) {
        history.push(course.createMemento());
        course.update(data);
    }

    public void undo() {
        if (!history.isEmpty())
            course.restoreMemento(history.pop());
    }
}
