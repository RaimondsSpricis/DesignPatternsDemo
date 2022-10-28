package rs.behavioral.memento;

public class Course {
    private CourseData data;

    public Course(CourseData data) {
        update(data);
    }

    public void update(CourseData data) {
        this.data = data;
    }

    public CourseMemento createMemento() {
        return new CourseMemento(data);
    }

    public void restoreMemento(CourseMemento m) {
        data = m.getData();
    }

    @Override
    public String toString() {
        return String.format("{ title: '%s', description: '%s', lectures: %d }",
                data.title(), data.description(), data.lectures());
    }
}
