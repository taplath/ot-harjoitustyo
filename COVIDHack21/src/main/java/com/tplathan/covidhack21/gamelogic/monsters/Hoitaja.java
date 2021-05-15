package com.tplathan.covidhack21.gamelogic.monsters;

public class Hoitaja implements Monster {

    @Override
    public char getCharacter() {
        return 'H';
    }

    @Override
    public MovementType getMovement() {
        return MovementType.STATIONARY;
    }

    @Override
    public Action getAction() {
        return new Action("Hoitaja antaa sinulle koronarokotuksen! Juokse ulos aurinkoon!");
    }

}
