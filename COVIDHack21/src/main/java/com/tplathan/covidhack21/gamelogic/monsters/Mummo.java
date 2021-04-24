package com.tplathan.covidhack21.gamelogic.monsters;

public class Mummo implements Monster {
    
    private Action action;
    
    public Mummo() {
        this.action = new Action("Mummo höpisee polvivaivoista.");
    }

    @Override
    public char getCharacter() {
        return 'M';
    }

    @Override
    public Boolean stationary(Boolean stationary) {
        return true;
    }

    @Override
    public Action getAction() {
        return this.action;
    }

}
