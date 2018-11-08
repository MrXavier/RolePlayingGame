package com.rpg.main;

public class ExitAction implements Action {
    private final String TEXT = "Exit";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.EXIT);
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
