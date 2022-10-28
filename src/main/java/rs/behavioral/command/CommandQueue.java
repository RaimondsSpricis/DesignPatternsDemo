package rs.behavioral.command;

import java.util.LinkedList;
import java.util.List;

public class CommandQueue {
    private List<Command> queue = new LinkedList<>();

    public void add(Command c) {
        queue.add(c);
    }

    public void executeAll() {
        for (var c : queue)
            c.execute();
        queue.clear();
    }
}
