package rs.behavioral.command;

public class DecreaseWidthCommand extends Command {
    private int size;

    public DecreaseWidthCommand(Rectangle rectangle, int size) {
        super(rectangle);
        this.size = size;
    }

    @Override
    public void execute() {
        rectangle.decreaseWidth(size);
    }
}
