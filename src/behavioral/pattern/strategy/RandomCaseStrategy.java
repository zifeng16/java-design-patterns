package behavioral.pattern.strategy;

import java.util.Locale;
import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        String output = "";
        Random random = new Random();
        for (Character c : input.toCharArray()) {
            if (random.nextBoolean()) {
                output += c.toString().toUpperCase();
            } else {
                output += c.toString().toLowerCase();
            }
        }
        return output;
    }
}
