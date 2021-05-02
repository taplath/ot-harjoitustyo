package com.tplathan.covidhack21.gamelogic.monsters;

public class Junnu implements Monster {

    @Override
    public char getCharacter() {
        return 'J';
    }

    @Override
    public boolean isStationary() {
        return false;
    }

    @Override
    public Action getAction() {
        return new Action("Junnudevaaja: Voitko auttaa mua null pointer exceptionien kanssa?");
    }
}