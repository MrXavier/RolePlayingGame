package com.rpg.main.action;

import com.rpg.main.persistance.LocalFilePersistence;

public class SaveAction implements Action {
    private final String TEXT = "Save";

    @Override
    public void doAction(){
        if(LocalFilePersistence.save()){
            System.out.println("Game saved.");
        } else {
            System.out.println("Failed to save game.");
        }
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
