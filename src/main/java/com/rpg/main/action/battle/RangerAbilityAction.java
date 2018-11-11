package com.rpg.main.action.battle;

import com.rpg.main.Context;
import com.rpg.main.action.Action;
import com.rpg.main.state.BattleWolfState;

public class RangerAbilityAction implements Action {
    private final int VALUE = 25;
    private final String TEXT = "Heal - hp increase by: " + VALUE;

    @Override
    public void doAction(){
        Context.getInstance().getPlayerCharacter().increaseHp(VALUE);
        Context.getInstance().setGameState(new BattleWolfState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
