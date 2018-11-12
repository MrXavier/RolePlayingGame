package com.rpg.main.state;

import com.rpg.main.action.BattleWolfAction;
import com.rpg.main.action.ExitCemiteryAction;
import com.rpg.main.action.GoToGateAction;

public class HowlsState extends GameState {
    public HowlsState() {
        super.setGameStateType(GameStateType.PLACE);
        super.setName("Howls");
        super.setText("You find a wolf eating a body." +
                "\nWhat do you do?");
        super.addAction(1, new BattleWolfAction());
        super.addAction(2, new GoToGateAction());
    }
}
