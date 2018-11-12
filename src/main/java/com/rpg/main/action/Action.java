package com.rpg.main.action;

import java.io.Serializable;

public interface Action extends Serializable {
    public void doAction();
    public String getTEXT();
}
