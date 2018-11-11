package com.rpg.main.action;

import com.rpg.main.Context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveAction implements Action {
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
