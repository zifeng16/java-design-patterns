package behavioral.pattern.state;

public class BreakState extends State {
    public BreakState(Game game) {
        super(game);
        System.out.println("-- Game in break state --");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not allowed to move to welcome screen");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Currently on break state");
    }

    @Override
    public void onEndGame() {
        System.out.println("Not allowed to end game state");
    }
}
