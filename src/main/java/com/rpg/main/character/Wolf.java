package com.rpg.main.character;

import com.rpg.main.action.Action;
import com.rpg.main.action.battle.FighterAbilityAction;

public class Wolf implements Character {
    private int experience;
    private int hp;
    private int mp;
    private int attackPower;
    private Action ability;

    public Wolf(int experience, int hp, int mp, int attackPower) {
        this.experience = experience;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
        this.ability = null;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void increaseExperience(int value) {
        this.experience += value;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void increaseHp(int value) {
        this.hp += value;
    }

    @Override
    public void decreaseHp(int value) {
        this.hp -= value;
    }

    @Override
    public int getMp() {
        return mp;
    }

    @Override
    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public void increaseMp(int value) {
        this.mp += value;
    }

    @Override
    public void decreaseMp(int value) {
        this.mp -= value;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public Action getAbility() {
        return ability;
    }

    public void setAbility(Action ability) {
        this.ability = ability;
    }
}
