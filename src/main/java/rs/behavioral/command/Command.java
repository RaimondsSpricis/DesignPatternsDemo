package rs.behavioral.command;

public abstract class Command {
    protected final Rectangle rectangle;

    protected Command(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public abstract void execute();
}
