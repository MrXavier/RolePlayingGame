package com.rpg.main.persistance;

import com.rpg.main.Context;

import java.io.*;

public final class LocalFilePersistence {
    public static final String PATH = LocalFilePersistence.class.getClassLoader().getResource("saved_context.obj").getPath();

    public static boolean save() {
        try {
            FileOutputStream fileOut = new FileOutputStream(PATH);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(Context.getInstance());
            objectOut.close();
            fileOut.close();
        }catch (IOException ex){
            ex.printStackTrace();
            return false;
        }
        return new File(PATH).exists();
    }

    public static boolean resume(){
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(PATH);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Context context = (Context)objectIn.readObject();
            Context.getInstance().setPlayerCharacter(context.getPlayerCharacter());
            Context.getInstance().setEnemy(context.getEnemy());
            Context.getInstance().setGameState(context.getGameState());
            Context.getInstance().setPreviousGameState(context.getPreviousGameState());
            objectIn.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
