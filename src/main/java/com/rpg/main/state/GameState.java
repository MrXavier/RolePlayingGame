package com.rpg.main.state;

import com.rpg.main.Context;
import com.rpg.main.action.Action;
import com.rpg.main.action.MenuAction;

import java.io.Serializable;
import java.util.HashMap;

public class GameState implements Serializable {
    private static final long serialVersionUID = 1952358793540268673L;

    private GameStateType gameStateType;
    private String name;
    private String text;
    private HashMap<Integer, Action> actions = new HashMap<>();

    public GameState() {
        if(Context.getInstance().getGameState() != null &&
                !GameStateType.MENU.equals(Context.getInstance().getGameState().gameStateType) &&
                Context.getInstance().getGameState().gameStateType != null) {
            actions.put(0, new MenuAction());
        }
    }

    public GameStateType getGameStateType() {
        return gameStateType;
    }

    public void setGameStateType(GameStateType gameStateType) {
        this.gameStateType = gameStateType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HashMap<Integer,Action> getActions() {
        return actions;
    }

    public void setActions(HashMap<Integer,Action> actions) {
        this.actions = actions;
    }

    public void addAction(Integer i, Action action){
        actions.put(i, action);
    }

    public enum GameStateType  {
        MENU(),
        PLACE(),
        BATTLE(),
        EXIT()
    }
}
