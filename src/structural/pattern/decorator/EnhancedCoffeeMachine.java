package structural.pattern.decorator;

/**
 *  Extends the functionality of normal coffee machine
 */
public class EnhancedCoffeeMachine implements CoffeeMachine {
    private NormalCoffeMachine normalCoffeMachine;

    public EnhancedCoffeeMachine(NormalCoffeMachine normalCoffeMachine) {
        this.normalCoffeMachine = normalCoffeMachine;
    }

    // Override behavior
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine: make small coffee");
    }

    // Unaltered behavior
    @Override
    public void makeLargeCoffee() {
        this.normalCoffeMachine.makeLargeCoffee();
    }

    // Extended behavior
    public void makeMilkCoffee() {
        System.out.println("Enhanced coffee machine: making milk coffee");
        this.normalCoffeMachine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: adding milk");
    }
}
