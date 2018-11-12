package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GameStateFactory;
import com.rpg.main.state.MenuState;
import com.rpg.main.state.StartState;

public class MenuAction implements Action {
    private final String TEXT = "Menu";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.MENU);
        Context.getInstance().setGameState(GameStateFactory.getInstance().buildMenuState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
