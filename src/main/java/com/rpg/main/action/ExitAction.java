package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.GameState;

public class ExitAction implements Action {
    private final String TEXT = "Exit";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.EXIT);
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
