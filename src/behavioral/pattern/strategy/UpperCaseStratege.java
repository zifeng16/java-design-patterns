package behavioral.pattern.strategy;

public class UpperCaseStratege implements PrintStrategy {
    @Override
    public String formatString(String input) {
        return input.toUpperCase();
    }
}
