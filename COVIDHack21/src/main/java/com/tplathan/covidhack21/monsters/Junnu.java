package com.tplathan.covidhack21.monsters;

import com.tplathan.covidhack21.monsters.Action;

public class Junnu implements Monster {

    @Override
    public char character(char character) {
        return 'J';
    }

    @Override
    public Boolean stationary(Boolean stationary) {
        return false;
    }

    @Override
    public void action(Action action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
