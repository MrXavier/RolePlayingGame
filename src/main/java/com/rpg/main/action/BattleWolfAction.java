package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.BattleWolfState;
import com.rpg.main.state.GameState;

public class BattleWolfAction implements Action {
    private final String TEXT = "Face wolf";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.BATTLE);
        Context.getInstance().setGameState(new BattleWolfState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
