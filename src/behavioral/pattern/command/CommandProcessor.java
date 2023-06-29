package behavioral.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {

    List<Command> commandList = new ArrayList<>();

    public CommandProcessor addCommand(Command command) {
        commandList.add(command);
        return this;
    }

    public void process() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
