package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.GameState;
import com.rpg.main.state.HowlsState;

public class GoToHowlsAction implements Action {
    private final String TEXT = "Go do howls";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.PLACE);
        Context.getInstance().setGameState(new HowlsState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
