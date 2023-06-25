package structural.pattern.flyweight;

public class Fighter implements Sprite {
    private FighterRank fighterRank;

    public Fighter(FighterRank fighterRank) {
        this.fighterRank = fighterRank;
    }

    public FighterRank getFighterRank() {
        return fighterRank;
    }

    @Override
    public void draw() {
        System.out.println("Drawing fighter");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving fighter to position " + x + ", " + y);
    }
}
