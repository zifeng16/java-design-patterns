package behavioral.pattern.command;

public class AddOrderCommand implements Command{
    int id;
    double price;

    public AddOrderCommand(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public void execute() {
        System.out.println("Order " + id + " added with price " + price);
    }
}
