package com.rpg.main.state;

import com.rpg.main.Context;
import com.rpg.main.action.ActionFactory;
import com.rpg.main.action.GoToGateAction;
import com.rpg.main.action.GravediggerAction;

public class GravediggerState extends GameState {
    public GravediggerState() {
        super.setGameStateType(GameStateType.PLACE);
        super.setName("Gravedigger");
        super.setText("You see the gravedigger." +
                "\nWhat do you do?");
        if(!Context.getInstance().isHasKey()) {
            super.addAction(1, ActionFactory.getInstance().buildGravediggerAction());
        }
        super.addAction(2, ActionFactory.getInstance().buildGoToGateAction());
    }
}
