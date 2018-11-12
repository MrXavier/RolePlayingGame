package com.rpg.main.state;

import com.rpg.main.action.ExitCemiteryAction;
import com.rpg.main.action.GoToHowlsAction;
import com.rpg.main.action.GravediggerAction;

public class ExitGateState extends GameState {
    public ExitGateState() {
        super.setGameStateType(GameStateType.PLACE);
        super.setName("Exit Gate");
        super.setText("You see the Exit Gate." +
                "\nWhat do you do?");
        super.addAction(1, new GoToHowlsAction());
        super.addAction(2, new ExitCemiteryAction());
    }
}
