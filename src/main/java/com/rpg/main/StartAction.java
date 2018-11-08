package com.rpg.main;

public class StartAction implements Action {
    private final String TEXT = "Start";

    @Override
    public void doAction(){
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.PLACE);
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
