package com.rpg.main.state;

import com.rpg.main.action.ActionFactory;
import com.rpg.main.action.ExitCemiteryAction;
import com.rpg.main.action.GoToGateAction;
import com.rpg.main.action.GoToHowlsAction;

public class StartState extends GameState {
    public StartState() {
        super.setGameStateType(GameStateType.PLACE);
        super.setName("Start");
        super.setText("You wake up in a cemitery and look around. You see a church, a gate and hear howls near some trees." +
                "\nWhat do you do?");
        super.addAction(1, ActionFactory.getInstance().buildGoToHowlsAction());
        super.addAction(2, ActionFactory.getInstance().buildGoToGateAction());
    }
}
