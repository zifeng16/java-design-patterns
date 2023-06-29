package behavioral.pattern.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        Game game = new Game();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        do {
            System.out.println("-- Please input command --");
            input = bufferedReader.readLine().trim().toLowerCase();
            switch (input) {
                case "w":
                    game.state.onWelcomeScreen();
                    break;
                case "p":
                    game.state.onPlaying();
                    break;
                case "b":
                    game.state.onBreak();
                    break;
                case "e":
                    game.state.onEndGame();
                    break;
            }
        } while (!input.equals("exit"));
    }
}
