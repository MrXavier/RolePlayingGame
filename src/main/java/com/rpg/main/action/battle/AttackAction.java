package com.rpg.main.action.battle;

import com.rpg.main.Context;
import com.rpg.main.action.Action;
import com.rpg.main.state.BattleWolfState;

public class AttackAction implements Action {
    private final String TEXT = "Attack";
    private final int DAMAGE = 10;

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
