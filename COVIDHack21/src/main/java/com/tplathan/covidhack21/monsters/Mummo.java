package com.tplathan.covidhack21.monsters;

import com.tplathan.covidhack21.monsters.Action;

public class Mummo implements Monster {

    @Override
    public char character(char character) {
        return 'M';
    }

    @Override
    public Boolean stationary(Boolean stationary) {
        return true;
    }

    @Override
    public void action(Action action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
