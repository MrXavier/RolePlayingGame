package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GravediggerState;
import com.rpg.main.state.HowlsState;

public class GravediggerAction implements Action {
    private final String TEXT = "You find a key.";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.PLACE);
        Context.getInstance().setGameState(new GravediggerState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
