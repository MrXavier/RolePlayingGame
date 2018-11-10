package com.rpg.main;

import com.rpg.main.action.Action;
import com.rpg.main.enums.Menu;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prompt {
    private Scanner scan = new Scanner(System.in);
    private int lastIntValue;
    private String lastStrValue;


    public void out(String str){
        System.out.println(str);
    }
    public void outOptions(HashMap<Integer, Action> options){
        options.entrySet().stream().forEach(
                e -> System.out.println(new StringBuilder().append(e.getKey()).append(Menu.DOT.value())
                        .append(e.getValue().getTEXT())));
    }
    public void brLn(){
        System.out.println();
    }

    public int readInt() {
        lastIntValue = -1;
        System.out.println("Insert a integer number:");
        try {
            lastIntValue = scan.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("! Invalid inserted integer number !");
            scan.next();
            return -1;
        }
        return lastIntValue;
    }

    public int readPositiveInt() {
        lastIntValue = 0;
        do {
            System.out.println("Insert a integer number bigger than zero:");
            lastIntValue = scan.nextInt();
        } while(lastIntValue <= 0);
        return lastIntValue;
    }

    public String readString() {
        lastStrValue = null;
        do {
            System.out.println("Insert a value:");
            lastStrValue = scan.nextLine();
        } while(lastStrValue == null && lastStrValue.isEmpty());
        return lastStrValue;
    }

    public int getLastIntValue() {
        return lastIntValue;
    }

    public String getLastStrValue() {
        return lastStrValue;
    }
}
