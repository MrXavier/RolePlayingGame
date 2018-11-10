package com.rpg.main;

//import com.rpg.main.enums.Menu;

import com.rpg.main.enums.Menu;
import com.rpg.main.state.GameState;
import com.rpg.main.state.MenuState;

import java.util.Optional;

public class Game {
    private Prompt prompt = new Prompt();
    private Context context = Context.getInstance();

    public void run() {
        context.setGameState(new MenuState());
        prompt.out(Menu.GAME_TITLE.value());
        while(!GameState.GameStateType.EXIT.equals(context.getGameState().getGameStateType())){
            prompt.out(context.getGameState().getText());
            prompt.outOptions(context.getGameState().getActions());
            Optional.ofNullable(context.getGameState().getActions().get(prompt.readInt())).ifPresent(e -> e.doAction());
            prompt.brLn();
        }
        prompt.out("See you.");
        System.exit(0);
    }
}
