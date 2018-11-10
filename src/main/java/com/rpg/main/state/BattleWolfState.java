package com.rpg.main.state;

public class BattleWolfState extends GameState {
    //Character wolf;

    public BattleWolfState() {
        super.setGameStateType(GameStateType.BATTLE);
        super.setName("Howls");
        super.setText("You find a wolf eating a body." +
                "\nWhat do you do?");
//        super.addAction(1, new BattleHowl());
//        super.addAction(2, new ExitAction());
    }
}
