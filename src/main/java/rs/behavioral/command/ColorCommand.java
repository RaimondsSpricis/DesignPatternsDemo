package rs.behavioral.command;

public class ColorCommand extends Command {
    private String color;

    public ColorCommand(Rectangle rectangle, String color) {
        super(rectangle);
        this.color = color;
    }

    @Override
    public void execute() {
        rectangle.setColor(color);
    }
}
