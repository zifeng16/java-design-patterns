package behavioral.pattern.command;

public class ExecuteOrderCommand implements Command {
    int id;
    public ExecuteOrderCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Order id " + id + " executed");
    }
}
