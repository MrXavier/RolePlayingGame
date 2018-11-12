package com.rpg.main.state;

import com.rpg.main.Context;
import com.rpg.main.action.ActionFactory;
import com.rpg.main.action.battle.AttackAction;
import com.rpg.main.character.CharacterFactory;

public class BattleWolfState extends GameState {
    public BattleWolfState() {
        super.setGameStateType(GameStateType.BATTLE);
        super.setName("BattleWolf");
        if(Context.getInstance().getEnemy() == null) {
            Context.getInstance().setEnemy(CharacterFactory.buildWolf());
        }
        String text = new StringBuilder()
                .append("Wolf - ").append("hp:").append(Context.getInstance().getEnemy().getHp())
                .append("\nPlayer - ").append("hp:").append(Context.getInstance().getPlayerCharacter().getHp())
                .toString();
        super.setText(text);
        super.addAction(1, ActionFactory.getInstance().buildAttackAction());
        super.addAction(2, Context.getInstance().getPlayerCharacter().getAbility());

    }
}
