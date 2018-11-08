package com.rpg.main.enums;

public enum Menu {
    GAME_TITLE("  ____  ____   ____      ___        _            __    ____               _ _                  \n" +
            " |  _ \\|  _ \\ / ___|_   / _ \\ _   _| |_    ___  / _|  / ___|___ _ __ ___ (_) |_ ___ _ __ _   _ \n" +
            " | |_) | |_) | |  _(_) | | | | | | | __|  / _ \\| |_  | |   / _ \\ '_ ` _ \\| | __/ _ \\ '__| | | |\n" +
            " |  _ <|  __/| |_| |_  | |_| | |_| | |_  | (_) |  _| | |__|  __/ | | | | | | ||  __/ |  | |_| |\n" +
            " |_| \\_\\_|    \\____(_)  \\___/ \\__,_|\\__|  \\___/|_|    \\____\\___|_| |_| |_|_|\\__\\___|_|   \\__, |\n" +
            "                                                                                         |___/"),
    //\n1. Fighter\n2. Range\n3. Mage\n Type the number option:"
    SELECT_CHAR("Select your character:"),
    DOT(".");

    private String value;

    Menu(String value) {
        this.value = value;
    }

    public String value(){
        return value;
    }
}
