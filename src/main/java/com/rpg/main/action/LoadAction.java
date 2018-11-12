package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.persistance.LocalFilePersistence;

public class LoadAction implements Action {
    private final String TEXT = "Resume";

    @Override
    public void doAction(){
        if(LocalFilePersistence.resume()){
            System.out.println("Game resumed.");
            Context.getInstance().setGameState(Context.getInstance().getPreviousGameState());
        } else {
            System.out.println("Failed to resume game.");
        }
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
