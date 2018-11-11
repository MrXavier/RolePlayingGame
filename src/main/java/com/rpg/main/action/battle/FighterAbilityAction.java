package com.rpg.main.action.battle;

import com.rpg.main.Context;
import com.rpg.main.action.Action;
import com.rpg.main.state.BattleWolfState;
import com.rpg.main.state.GameState;

public class FighterAbilityAction implements Action {
    private final int DAMAGE = 25;
    private final String TEXT = "Use sword spin ability - damage: " + DAMAGE;

    @Override
    public void doAction(){
        Context.getInstance().getEnemy().decreaseHp(DAMAGE);
        Context.getInstance().setGameState(new BattleWolfState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
