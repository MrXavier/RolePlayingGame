package com.rpg.main;

import java.util.List;

public class GameState {
    private GameStateType gameStateType;
    private String name;
    private String text;
    private List<Action> actions;

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

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public static enum GameStateType {
        MENU(),
        PLACE(),
        BATTLE(),
        EXIT()
    }
}
