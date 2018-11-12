package com.rpg.main.state;

import com.rpg.main.Context;
import com.rpg.main.action.*;

public class MenuState extends GameState {
    public MenuState() {
        super.setGameStateType(GameStateType.MENU);
        super.setName("Menu");
        super.setText("Menu");
        if(Context.getInstance().getGameState() == null) {
            super.addAction(1, ActionFactory.getInstance().buildStartAction());
            super.addAction(2, ActionFactory.getInstance().buildLoadAction());
            super.addAction(3, ActionFactory.getInstance().buildExitAction());
        }else{
            super.addAction(1, ActionFactory.getInstance().buildContinueAction());
            super.addAction(2, ActionFactory.getInstance().buildSaveAction());
            super.addAction(3, ActionFactory.getInstance().buildLoadAction());
            super.addAction(4, ActionFactory.getInstance().buildExitAction());
        }

    }
}
