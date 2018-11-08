package com.rpg.main;

//Singleton
public class Context {
    GameState gameState;
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
        this.gameState = gameState;
    }
}
