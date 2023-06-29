package behavioral.pattern.strategy;

public class LowerCaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        return input.toLowerCase();
    }
}
