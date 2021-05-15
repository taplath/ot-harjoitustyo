package com.tplathan.covidhack21.gamelogic.monsters;

public class Jaara implements Monster {

    @Override
    public char getCharacter() {
        return 'J';
    }

    @Override
    public MovementType getMovement() {
        return MovementType.RANDOM;
    }

    @Override
    public Action getAction() {
        return new Action("Jäärä kertoo tarinoita Gurulan historiasta.");
    }
}