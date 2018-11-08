package com.rpg.main;

import java.util.Scanner;

public class Prompt {
    private Scanner scan = new Scanner(System.in);
    private int lastIntValue;
    private String lastStrValue;


    public void out(String str){
        System.out.println(str);
    }
    public void brLn(){
        System.out.println();
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
