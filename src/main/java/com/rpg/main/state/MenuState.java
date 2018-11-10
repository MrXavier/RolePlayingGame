package com.rpg.main.state;

import com.rpg.main.Context;
import com.rpg.main.action.ContinueAction;
import com.rpg.main.action.ExitAction;
import com.rpg.main.action.StartAction;

public class MenuState extends GameState {
    public MenuState() {
        super.setGameStateType(GameStateType.MENU);
        super.setName("Menu");
        super.setText("Menu");
        if(Context.getInstance().getGameState() == null) {
            super.addAction(1, new StartAction());
        }else{
            super.addAction(1, new ContinueAction());
        }
        super.addAction(2, new ExitAction());
    }
}
