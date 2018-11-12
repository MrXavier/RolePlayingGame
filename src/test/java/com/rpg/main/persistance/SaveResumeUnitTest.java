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
import static org.junit.Assert.*;

import java.io.File;

public class SaveResumeUnitTest {
    @Before
    public void setup() {
        resetContext();
    }

    @Test
    public void saveTest(){
        LocalFilePersistence.save();
        File file = new File(LocalFilePersistence.PATH);
        file.exists();
    }

    @Test
    public void resumeTest(){
        buildContext();
        LocalFilePersistence.save();
        resetContext();
        LocalFilePersistence.resume();

        assertThat(Context.getInstance().getEnemy().getClass(), equalTo(Wolf.class));
        assertTrue(Context.getInstance().getGameState() instanceof BattleWolfState);
        assertTrue(Context.getInstance().getPlayerCharacter() instanceof Fighter);
        assertTrue(Context.getInstance().getPreviousGameState() instanceof HowlsState);
    }

    private void buildContext(){
        Context.getInstance();
        Character playerCharacter = CharacterFactory.buildFighter();
        Character enemy = CharacterFactory.buildWolf();
        GameState previousGameState = new HowlsState();

        Context.getInstance().setEnemy(enemy);
        Context.getInstance().setPlayerCharacter(playerCharacter);

        GameState state = new BattleWolfState();
        Context.getInstance().setGameState(state);
        Context.getInstance().setPreviousGameState(previousGameState);
    }

    private void resetContext(){
        Context.getInstance().setPreviousGameState(null);
        Context.getInstance().setPlayerCharacter(null);
        Context.getInstance().setEnemy(null);
        Context.getInstance().setGameState(null);
    }
}
