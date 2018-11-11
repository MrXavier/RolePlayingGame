package com.rpg.main.character;

public class CharacterFactory {
    public static Character buildFighter(){
        return new Fighter(0, 100, 20, 10);
    }

    public static Character buildRanger(){
        return new Ranger(0,  50, 40, 20);
    }
    public static Character buildWolf(){
        return new Wolf(0,  80, 0, 10);
    }
}
