package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GravediggerState;

public class ExitCemiteryAction implements Action {
    private final String TEXT = "Exit Cemitery.";

    @Override
    public void doAction(){
        if(Context.getInstance().isHasKey()){
            System.out.println("You exit the cemitery and go to the city.\nCongratulations, you won the game.");
            Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.EXIT);
        }else{
            System.out.println("The gate is locked.");
        }

    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
