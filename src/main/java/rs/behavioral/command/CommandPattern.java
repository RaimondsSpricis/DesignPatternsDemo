package rs.behavioral.command;

public class CommandPattern {

    public static void run() {
        System.out.println("=== Command Pattern ===");
        var r = new Rectangle(0, 0, "Green");
        System.out.println("Initial rectangle: " + r);
        var queue = new CommandQueue();
        queue.add(new IncreaseWidthCommand(r, 7));
        queue.add(new IncreaseHeightCommand(r, 5));
        queue.add(new DecreaseHeightCommand(r, 3));
        queue.add(new DecreaseWidthCommand(r, 10));
        queue.add(new ColorCommand(r, "Red"));
        queue.executeAll();
        System.out.println("Rectangle update 1: " + r);
        queue.add(new IncreaseWidthCommand(r, 7));
        queue.add(new IncreaseWidthCommand(r, 5));
        queue.add(new IncreaseHeightCommand(r, 3));
        queue.add(new IncreaseHeightCommand(r, 10));
        queue.add(new ColorCommand(r, "Yellow"));
        queue.executeAll();
        System.out.println("Rectangle update 2: " + r);
        System.out.println();
    }
}
