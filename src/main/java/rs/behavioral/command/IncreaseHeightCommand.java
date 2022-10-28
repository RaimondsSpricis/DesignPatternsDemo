package rs.behavioral.command;

public class IncreaseHeightCommand extends Command {
    private int size;

    public IncreaseHeightCommand(Rectangle rectangle, int size) {
        super(rectangle);
        this.size = size;
    }

    @Override
    public void execute() {
        rectangle.increaseHeight(size);
    }
}