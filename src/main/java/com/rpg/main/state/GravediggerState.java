package com.rpg.main.state;

import com.rpg.main.action.BattleWolfAction;
import com.rpg.main.action.GravediggerAction;

public class GravediggerState extends GameState {
    public GravediggerState() {
        super.setGameStateType(GameStateType.PLACE);
        super.setName("Gravedigger");
        super.setText("You see the gravedigger." +
                "\nWhat do you do?");
        super.addAction(1, new GravediggerAction());
//        super.addAction(2, new ExitAction());
    }
}
