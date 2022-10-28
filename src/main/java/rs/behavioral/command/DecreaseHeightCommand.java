package rs.behavioral.command;

public class DecreaseHeightCommand extends Command {
    private int size;

    public DecreaseHeightCommand(Rectangle rectangle, int size) {
        super(rectangle);
        this.size = size;
    }

    @Override
    public void execute() {
        rectangle.decreaseHeight(size);
    }
}