package structural.pattern.flyweight;

import java.util.Random;

/**
 * 对象池的一种实现，类似线程池
 */
public class Client {
    public static void main(String[] args) {
        int toDraw = 1000;
        Army army = new Army();
        FighterRank currentRank = null;
        Random random = new Random();

        for (int i = 0; i < toDraw; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    currentRank = FighterRank.PRIVATE;
                    break;
                case 1:
                    currentRank = FighterRank.SERGEANT;
                    break;
                case 2:
                    currentRank = FighterRank.MAJOR;
                    break;
                default:
                    break;
            }
            army.spawnFighter(currentRank);
        }

        army.drawArmy();
    }
}
