package structural.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Fighter> army = new ArrayList<>();

    public void spawnFighter(FighterRank fighterRank) {
        Fighter fighter = FighterFactory.getFighter(fighterRank);
        army.add(fighter);
    }

    public void drawArmy() {
        for (Fighter fighter : army) {
            switch(fighter.getFighterRank()) {
                case PRIVATE:
                    System.out.println("P ");
                    break;
                case SERGEANT:
                    System.out.println("S ");
                    break;
                case MAJOR:
                    System.out.println("M ");
                    break;
            }
        }
    }
}
