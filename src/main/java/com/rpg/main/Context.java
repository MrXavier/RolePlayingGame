package com.rpg.main;

import com.rpg.main.state.GameState;

//Singleton
public class Context {
    GameState gameState;
    GameState previousGameState;
//    Character playerChar;
//    Place place;
//    Place previousPlace;
//    List<PlaceEnum> remainPlaces;
//    Battle battle;

    private static Context context = new Context(null);

    public static Context getInstance() {
        return context;
    }

    public Context(GameState gameState) {
        this.gameState = gameState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        previousGameState = this.gameState;
        this.gameState = gameState;
    }

    public GameState getPreviousGameState() {
        return previousGameState;
    }

    public void setPreviousGameState(GameState previousGameState) {
        this.previousGameState = previousGameState;
    }
}
