package com.rpg.main;

//import com.rpg.main.enums.Menu;

import com.rpg.main.enums.Character;
import com.rpg.main.enums.Menu;

import java.util.Arrays;

public class Game {
    private Prompt prompt = new Prompt();
    private Context context = Context.getInstance();

    public void run() {
        context.setGameState(new MenuState());
        prompt.out(Menu.GAME_TITLE.value());
        while(!GameState.GameStateType.EXIT.equals(context.getGameState().getGameStateType())){

            prompt.out(context.getGameState().getText());
            context.getGameState().getActions().stream().forEach(e -> prompt.out(e.getTEXT()));
            prompt.readString();
        }
        prompt.out("See you.");
        System.exit(0);
    }
}
