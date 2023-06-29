package behavioral.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        LowerCaseStrategy lowerCaseStrategy = new LowerCaseStrategy();
        UpperCaseStratege upperCaseStratege = new UpperCaseStratege();
        RandomCaseStrategy randomCaseStrategy = new RandomCaseStrategy();

        String input = "LOREM ipsum DOLOR sit amet";
        Executor executor = new Executor(lowerCaseStrategy);
        executor.printString(input);

        executor.setStrategy(upperCaseStratege);
        executor.printString(input);

        executor.setStrategy(randomCaseStrategy);
        executor.printString(input);
    }
}
