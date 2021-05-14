package com.tplathan.covidhack21.gamelogic.monsters;

public class Kapistelija implements Monster {

    @Override
    public char getCharacter() {
        return 'K';
    }

    @Override
    public MovementType getMovement() {
        return MovementType.TOWARDS_PLAYER;
    }

    @Override
    public Action getAction() {
        return new Action("Käpistelijä: Voitko antaa noppia edes säälistä?");
    }
}