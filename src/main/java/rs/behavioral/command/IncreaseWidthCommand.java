package rs.behavioral.command;

public class IncreaseWidthCommand extends Command {
    private int size;

    public IncreaseWidthCommand(Rectangle rectangle, int size) {
        super(rectangle);
        this.size = size;
    }

    @Override
    public void execute() {
        rectangle.increaseWidth(size);
    }
}
