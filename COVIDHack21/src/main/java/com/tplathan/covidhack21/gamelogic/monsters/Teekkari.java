package com.tplathan.covidhack21.gamelogic.monsters;

public class Teekkari implements Monster {

    public Teekkari() {

    }

    @Override
    public char getCharacter() {
        return 'T';
    }

    @Override
    public Boolean stationary(Boolean stationary) {
        return false;
    }

    //TODO: Action for force-selling Äpy
    @Override
    public void action(Action action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
