package com.rpg.main;

import java.util.Arrays;
import java.util.List;

public class MenuState extends GameState {
    public MenuState() {
        super.setGameStateType(GameStateType.MENU);
        super.setName("Menu");
        super.setText("Menu");
        super.setActions(Arrays.asList(new StartAction(), new ExitAction()));
    }
}
