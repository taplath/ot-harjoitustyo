package com.tplathan.covidhack21.gamelogic.monsters;

public class Mummo implements Monster {

    @Override
    public char getCharacter() {
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
