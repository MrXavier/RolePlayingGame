package com.rpg.main.character;

public class Fighter implements Character {
    private String name;
    private int hp;
    private int mp;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public int getMp() {
        return 0;
    }

    @Override
    public int getAttackPower() {
        return 1;
    }
}
