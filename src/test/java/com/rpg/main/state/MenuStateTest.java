package com.rpg.main.state;

import com.rpg.main.Context;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuStateTest {

    @Before
    public void setup() {
        Context.getInstance().setGameState(null);
    }

    @Test
    public void testExitState() {
        Context context = Context.getInstance();
        context.setGameState(new MenuState());

        MenuState state = new MenuState();
        state.getActions().get(5).doAction();

        assertNotNull("gameState is null", context.getGameState());
        assertTrue("gameState is not Exit",
                GameState.GameStateType.EXIT.equals(context.getGameState().getGameStateType()));
    }

    @Test
    public void testStartState() {
        Context context = Context.getInstance();
        context.setGameState(new MenuState());


        context.getGameState().getActions().get(1).doAction();

        assertNotNull("gameState is null", context.getGameState());
        assertTrue("gameState is not MENU",
                GameState.GameStateType.MENU.equals(context.getGameState().getGameStateType()));
        assertTrue("gameState is not ChooseCharState", context.getGameState() instanceof ChooseCharState);
    }
}
