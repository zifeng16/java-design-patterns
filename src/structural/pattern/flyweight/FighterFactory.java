package structural.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FighterFactory {
    static Map<FighterRank, Fighter> fighterMap = new HashMap<>();

    public static Fighter getFighter(FighterRank fighterRank) {
        Fighter fighter = fighterMap.get(fighterRank);
        if (fighter == null) {
            fighter = new Fighter(fighterRank);
            fighterMap.put(fighterRank, fighter);
        }
        return fighter;
    }
}
