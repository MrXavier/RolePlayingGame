package com.rpg.main.action;

import com.rpg.main.action.battle.AttackAction;
import com.rpg.main.action.battle.FighterAbilityAction;
import com.rpg.main.action.battle.RangerAbilityAction;
import com.rpg.main.state.*;

import java.util.HashMap;

public class ActionFactory {
    private static ActionFactory actionFactory = new ActionFactory();
    
    HashMap<Class<? extends Action>, Action> states;

    private ActionFactory() {
        states = new HashMap<>();
    }

    public static ActionFactory getInstance(){
        return actionFactory;
    }

    public Action buildBattleWolfAction(){
        Action action = states.get(BattleWolfAction.class);
        if(action == null){
            action = new BattleWolfAction();
            states.put(BattleWolfAction.class, action);
        }
        return action;
    }

    public Action buildChooseFighterAction(){
        Action action = states.get(ChooseFighterAction.class);
        if(action == null){
            action = new ChooseFighterAction();
            states.put(ChooseFighterAction.class, action);
        }
        return action;
    }

    public Action buildChooseRangerAction(){
        Action action = states.get(ChooseRangerAction.class);
        if(action == null){
            action = new ChooseRangerAction();
            states.put(ChooseRangerAction.class, action);
        }
        return action;
    }

    public Action buildContinueAction(){
        Action action = states.get(ContinueAction.class);
        if(action == null){
            action = new ContinueAction();
            states.put(ContinueAction.class, action);
        }
        return action;
    }

    public Action buildExitAction(){
        Action action = states.get(ExitAction.class);
        if(action == null){
            action = new ExitAction();
            states.put(ExitAction.class, action);
        }
        return action;
    }

    public Action buildExitCemiteryAction(){
        Action action = states.get(ExitCemiteryAction.class);
        if(action == null){
            action = new ExitCemiteryAction();
            states.put(ExitCemiteryAction.class, action);
        }
        return action;
    }

    public Action buildGoToGateAction(){
        Action action = states.get(GoToGateAction.class);
        if(action == null){
            action = new GoToGateAction();
            states.put(GoToGateAction.class, action);
        }
        return action;
    }

    public Action buildGoToHowlsAction(){
        Action action = states.get(GoToHowlsAction.class);
        if(action == null){
            action = new GoToHowlsAction();
            states.put(GoToHowlsAction.class, action);
        }
        return action;
    }

    public Action buildGravediggerAction(){
        Action action = states.get(GravediggerAction.class);
        if(action == null){
            action = new GravediggerAction();
            states.put(GravediggerAction.class, action);
        }
        return action;
    }

    public Action buildLoadAction(){
        Action action = states.get(LoadAction.class);
        if(action == null){
            action = new LoadAction();
            states.put(LoadAction.class, action);
        }
        return action;
    }

    public Action buildMenuAction(){
        Action action = states.get(MenuAction.class);
        if(action == null){
            action = new MenuAction();
            states.put(MenuAction.class, action);
        }
        return action;
    }

    public Action buildSaveAction(){
        Action action = states.get(SaveAction.class);
        if(action == null){
            action = new SaveAction();
            states.put(SaveAction.class, action);
        }
        return action;
    }

    public Action buildStartAction(){
        Action action = states.get(StartAction.class);
        if(action == null){
            action = new StartAction();
            states.put(StartAction.class, action);
        }
        return action;
    }

    public Action buildAttackAction(){
        Action action = states.get(AttackAction.class);
        if(action == null){
            action = new AttackAction();
            states.put(AttackAction.class, action);
        }
        return action;
    }

    public Action buildFighterAbilityAction(){
        Action action = states.get(FighterAbilityAction.class);
        if(action == null){
            action = new FighterAbilityAction();
            states.put(FighterAbilityAction.class, action);
        }
        return action;
    }

    public Action buildRangerAbilityAction(){
        Action action = states.get(RangerAbilityAction.class);
        if(action == null){
            action = new RangerAbilityAction();
            states.put(RangerAbilityAction.class, action);
        }
        return action;
    }

}
