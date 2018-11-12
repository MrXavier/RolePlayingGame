package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.BattleWolfState;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GameStateFactory;

public class BattleWolfAction implements Action {
    private final String TEXT = "Face wolf";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.BATTLE);
        Context.getInstance().setGameState(GameStateFactory.getInstance().buildBattleWolfState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
