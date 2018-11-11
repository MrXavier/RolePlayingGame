package com.rpg.main.action;

public class LoadAction implements Action {
    private final String TEXT = "Save";

    @Override
    public void doAction(){
//        if(Context.getInstance().getPreviousGameState() != null) {
//            Context.getInstance().getGameState().setGameStateType(Context.getInstance().getPreviousGameState().getGameStateType());
//        } else {
//
//        }
//        Context.getInstance().setGameState(Context.getInstance().getPreviousGameState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
