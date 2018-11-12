package com.rpg.main.character;

import com.rpg.main.action.Action;

import java.io.Serializable;

public interface Character extends Serializable {
    public int getExperience(); //TODO: Use experience to implement level progress in the future
    public void setExperience(int value);
    public void increaseExperience(int value);
    public int getHp();
    public void setHp(int value); //TODO: make variable maximum hp
    public void increaseHp(int value);
    public void decreaseHp(int value);
    public int getMp(); //TODO: Use Mp in the future for mage character
    public void setMp(int value);
    public void increaseMp(int value);
    public void decreaseMp(int value);
    public int getAttackPower();
    public void setAttackPower(int value);
    public Action getAbility();
}
