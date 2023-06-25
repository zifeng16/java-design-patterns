package structural.pattern.decorator;

public class Client {
    public static void main(String[] args) {
        NormalCoffeMachine normalCoffeMachine = new NormalCoffeMachine();
        EnhancedCoffeeMachine enhancedCoffeeMachine = new EnhancedCoffeeMachine(normalCoffeMachine);

        normalCoffeMachine.makeSmallCoffee();
        normalCoffeMachine.makeLargeCoffee();

        enhancedCoffeeMachine.makeSmallCoffee();
        enhancedCoffeeMachine.makeLargeCoffee();
        enhancedCoffeeMachine.makeMilkCoffee();
    }
}
