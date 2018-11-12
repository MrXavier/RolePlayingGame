package com.rpg.main;

import com.rpg.main.character.Character;
import com.rpg.main.state.GameState;

import java.io.Serializable;

//Singleton
public class Context implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean hasKey = false;
    private Character playerCharacter;
    private Character enemy;
    private GameState gameState;
    private GameState previousGameState;

    private static Context context = new Context(null);

    public static Context getInstance() {
        return context;
    }

    private Context(GameState gameState) {
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

    public boolean isHasKey() {
        return hasKey;
    }

    public void setHasKey(boolean hasKey) {
        this.hasKey = hasKey;
    }
}
