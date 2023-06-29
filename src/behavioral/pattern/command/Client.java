package behavioral.pattern.command;

public class Client {
    public static void main(String[] args) {
        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.addCommand(new AddOrderCommand(1, 16))
              .addCommand(new AddOrderCommand(2, 18))
              .addCommand(new ExecuteOrderCommand(3))
              .addCommand(new ExecuteOrderCommand(6))
              .process();
    }

}
