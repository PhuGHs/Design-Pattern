package behavioral_dp.command;

import java.util.ArrayList;
import java.util.List;

public class LibraryInvoker {
    private List<LibraryCommand> commands;

    public LibraryInvoker() {
        commands = new ArrayList<LibraryCommand>();
    }

    public void addCommand(LibraryCommand command) {
        commands.add(command);
    }

    public void execute() {
        for (LibraryCommand command : commands) {
            command.execute();
        }
    }
}
