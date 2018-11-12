package com.rpg.main;

import com.rpg.main.enums.Menu;
import com.rpg.main.state.GameState;
import com.rpg.main.state.GravediggerState;
import com.rpg.main.state.MenuState;

import java.util.Optional;

public class Game{
    private Prompt prompt = new Prompt();
    private Context context = Context.getInstance();

    public void run() throws Exception{
        context.setGameState(new MenuState());
        prompt.out(Menu.GAME_TITLE.value());

        while(!GameState.GameStateType.EXIT.equals(context.getGameState().getGameStateType())){
            //Player turn
            prompt.out(context.getGameState().getText());
            prompt.outOptions(context.getGameState().getActions());
            Optional.ofNullable(context.getGameState().getActions().get(prompt.readInt())).ifPresent(e -> e.doAction());
            prompt.brLn();

            // Enemy turn TODO create a Battle turns in separate classes
            if(GameState.GameStateType.BATTLE.equals(context.getGameState().getGameStateType())){
                enemyTurn();
            }
        }
        prompt.out("See you.");
        System.exit(0);
    }

    private void enemyTurn() throws Exception{
        if(context.getEnemy() != null){
            if(context.getEnemy().getHp() > 0 && context.getPlayerCharacter().getHp() > 0) {
                int damage = context.getEnemy().getAttackPower();
                context.getPlayerCharacter().decreaseHp(damage);
                prompt.out("Wolf attaked! You received " + damage + " damage.");
            } else if(context.getPlayerCharacter().getHp() <= 0) {
                prompt.out("You were defeated.\n");
                context.getGameState().setGameStateType(GameState.GameStateType.EXIT); //TODO: back to menu
            } else {
                context.getPlayerCharacter().increaseExperience(context.getEnemy().getExperience());
                prompt.out("Congratulations! You defeated the wolf. You received "+context.getEnemy().getExperience()+
                        "of experience. Character experience" + context.getPlayerCharacter().getExperience() + "\n");
                context.setGameState(new GravediggerState());
                context.setEnemy(null);
            }
        } else {
            throw new Exception("Enemy not instaniated.");
        }
    }
}
