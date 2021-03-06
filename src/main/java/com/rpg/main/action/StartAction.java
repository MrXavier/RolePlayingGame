package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.ChooseCharState;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GameStateFactory;
import com.rpg.main.state.StartState;

public class StartAction implements Action {
    private final String TEXT = "Start";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.MENU);
        Context.getInstance().setGameState(GameStateFactory.getInstance().buildChooseCharState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
