package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GameStateFactory;
import com.rpg.main.state.GravediggerState;
import com.rpg.main.state.HowlsState;

public class GravediggerAction implements Action {
    private final String TEXT = "Search the body.";

    @Override
    public void doAction(){
        System.out.println("You find a key.");
        Context.getInstance().setHasKey(true);
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.PLACE);
        Context.getInstance().setGameState(GameStateFactory.getInstance().buildGravediggerState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
