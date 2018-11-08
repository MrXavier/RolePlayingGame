package com.rpg.main.enums;

public enum Character {
    FIGHTER("Fighter"),
    RANGER("Ranger"),
    MAGE("Mage");

    private String value;

    Character(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
