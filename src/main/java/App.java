import com.rpg.main.Game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.run();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
