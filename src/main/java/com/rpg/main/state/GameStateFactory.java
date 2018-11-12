package com.rpg.main.state;

import java.util.HashMap;

public class GameStateFactory {
    private static GameStateFactory gameStateFactory = new GameStateFactory();
    
    HashMap<Class<? extends GameState>, GameState> states;

    private GameStateFactory() {
        states = new HashMap<>();
    }

    public static GameStateFactory getInstance(){
        return gameStateFactory;
    }

    public GameState buildStartState(){
        GameState state = states.get(StartState.class);
        if(state == null){
            state = new StartState();
            states.put(StartState.class, state);
        }
        return state;
    }

    public GameState buildMenuState(){
        GameState state = states.get(MenuState.class);
        if(state == null){
            state = new MenuState();
            states.put(MenuState.class, state);
        }
        return state;
    }

    public GameState buildChooseCharState(){
        GameState state = states.get(ChooseCharState.class);
        if(state == null){
            state = new ChooseCharState();
            states.put(ChooseCharState.class, state);
        }
        return state;
    }

    public GameState buildBattleWolfState(){
        GameState state = states.get(BattleWolfState.class);
        if(state == null){
            state = new BattleWolfState();
            states.put(BattleWolfState.class, state);
        }
        return state;
    }

    public GameState buildGravediggerState(){
        GameState state = states.get(GravediggerState.class);
        if(state == null){
            state = new GravediggerState();
            states.put(GravediggerState.class, state);
        }
        return state;
    }

    public GameState buildHowlsState(){
        GameState state = states.get(HowlsState.class);
        if(state == null){
            state = new HowlsState();
            states.put(HowlsState.class, state);
        }
        return state;
    }

    public GameState buildExitGateState(){
        GameState state = states.get(ExitGateState.class);
        if(state == null){
            state = new ExitGateState();
            states.put(ExitGateState.class, state);
        }
        return state;
    }

}
