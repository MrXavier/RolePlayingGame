package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.ExitGateState;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GameStateFactory;
import com.rpg.main.state.HowlsState;

public class GoToGateAction implements Action {
    private final String TEXT = "Go to cemitery exit gate.";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.PLACE);
        Context.getInstance().setGameState(GameStateFactory.getInstance().buildExitGateState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
