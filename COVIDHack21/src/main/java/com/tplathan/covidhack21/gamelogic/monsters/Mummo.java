package com.tplathan.covidhack21.gamelogic.monsters;

public class Mummo implements Monster {

    @Override
    public char getCharacter() {
        return 'M';
    }

    @Override
    public MovementType getMovement() {
        return MovementType.STATIONARY;
    }

    @Override
    public Action getAction() {
        return new Action("Mummo höpisee polvivaivoista.");
    }

}
