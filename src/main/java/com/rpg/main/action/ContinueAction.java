package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.GameState;
import com.rpg.main.state.StartState;

public class ContinueAction implements Action {
    private final String TEXT = "Continue";

    @Override
    public void doAction(){
        if(Context.getInstance().getPreviousGameState() != null) {
            Context.getInstance().getGameState().setGameStateType(Context.getInstance().getPreviousGameState().getGameStateType());
        } else {

        }
        Context.getInstance().setGameState(Context.getInstance().getPreviousGameState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
