package com.rpg.main.persistance;

import com.rpg.main.Context;
import com.rpg.main.character.Character;
import com.rpg.main.character.CharacterFactory;
import com.rpg.main.character.Fighter;
import com.rpg.main.character.Wolf;
import com.rpg.main.state.BattleWolfState;
import com.rpg.main.state.GameState;
import com.rpg.main.state.HowlsState;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileOutputStream;

public class SaveResumeUnitTest {
    @Before
    public void setup() {
        resetContext();
    }

    @Test
    public void saveTest(){
        Persistance.save();
        File file = new File(Persistance.getPath());
        file.exists();
    }

    @Test
    public void resumeTest(){
        buildContext();
        Persistence.save();
        resetContext();
        Persistence.resume();

        assertThat(Context.getInstance().getEnemy().getClass(), equalTo(Wolf.class));
        assertThat(Context.getInstance().getGameState(), equalTo(BattleWolfState.class));
        assertThat(Context.getInstance().getPlayerCharacter(), equalTo(Fighter.class));
        assertThat(Context.getInstance().getPreviousGameState(), equalTo(HowlsState.class));
    }

    private void buildContext(){
        Context.getInstance();
        Character playerCharacter = CharacterFactory.buildFighter();
        Character enemy = CharacterFactory.buildWolf();
        GameState previousGameState = new HowlsState();

        Context.getInstance().setEnemy(enemy);
        Context.getInstance().setPlayerCharacter(playerCharacter);
        Context.getInstance().setPreviousGameState(previousGameState);

        GameState state = new BattleWolfState();
        Context.getInstance().setGameState(state);
    }

    private void resetContext(){
        Context.getInstance().setPreviousGameState(null);
        Context.getInstance().setPlayerCharacter(null);
        Context.getInstance().setEnemy(null);
        Context.getInstance().setGameState(null);
    }
}
