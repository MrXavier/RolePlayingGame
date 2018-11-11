package com.rpg.main.state;

import com.rpg.main.action.ChooseFighterAction;
import com.rpg.main.action.ChooseRangerAction;

public class ChooseCharState extends GameState {
    public ChooseCharState() {
        super.setGameStateType(GameStateType.MENU);
        super.setName("Start");
        super.setText("Choose your character:");
        super.addAction(1, new ChooseFighterAction());
        super.addAction(2, new ChooseRangerAction());
    }
}
