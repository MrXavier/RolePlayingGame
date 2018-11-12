package com.rpg.main.action;

import com.rpg.main.Context;
import com.rpg.main.character.Character;
import com.rpg.main.character.CharacterFactory;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GameStateFactory;
import com.rpg.main.state.StartState;

public class ChooseRangerAction implements Action {
    private final String TEXT = "Ranger";

    @Override
    public void doAction(){
        Character character = CharacterFactory.buildRanger();
        Context.getInstance().setPlayerCharacter(character);
        Context.getInstance().getGameState().setGameStateType(GameState.GameStateType.PLACE);
        Context.getInstance().setGameState(GameStateFactory.getInstance().buildStartState());
    }

    @Override
    public String getTEXT() {
        return TEXT;
    }
}
