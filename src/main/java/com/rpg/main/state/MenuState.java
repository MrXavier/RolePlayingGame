package com.rpg.main.state;

import com.rpg.main.Context;
import com.rpg.main.action.*;

public class MenuState extends GameState {
    public MenuState() {
        super.setGameStateType(GameStateType.MENU);
        super.setName("Menu");
        super.setText("Menu");
        if(Context.getInstance().getGameState() == null) {
            super.addAction(1, new StartAction());
            super.addAction(2, new LoadAction());
            super.addAction(3, new ExitAction());
        }else{
            super.addAction(1, new ContinueAction());
            super.addAction(3, new SaveAction());
            super.addAction(4, new LoadAction());
            super.addAction(5, new ExitAction());
        }

    }
}
