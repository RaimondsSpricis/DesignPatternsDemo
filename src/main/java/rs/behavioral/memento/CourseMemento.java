package rs.behavioral.memento;

public class CourseMemento {
    private final CourseData data;

    public CourseMemento(CourseData data) {
        this.data = data;
    }

    public CourseData getData() {
        return data;
    }
}
