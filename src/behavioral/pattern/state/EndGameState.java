package behavioral.pattern.state;

public class EndGameState extends State {
    public EndGameState(Game game) {
        super(game);
        System.out.println("-- Game in EndGame state --");
    }

    @Override
    public void onWelcomeScreen() {
        game.changeState(new WelcomeScreenState(game));
    }

    @Override
    public void onPlaying() {
        System.out.println("Not allowed to move to Playing state");
    }

    @Override
    public void onBreak() {
        System.out.println("Not allowed to move to Break state");
    }

    @Override
    public void onEndGame() {
        System.out.println("Currently on EndGame state");
    }
}
