package com.rpg.main;

import com.rpg.main.character.Character;
import com.rpg.main.state.GameState;

//Singleton
public class Context {
    Character playerCharacter;
    Character enemy;
    GameState gameState;
    GameState previousGameState;

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

    public Character getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(Character playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public Character getEnemy() {
        return enemy;
    }

    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }
}
