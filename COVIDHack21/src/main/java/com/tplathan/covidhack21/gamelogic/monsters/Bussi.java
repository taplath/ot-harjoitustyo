package com.tplathan.covidhack21.gamelogic.monsters;

public class Bussi implements Monster {

    private final MovementType movementType;

    public Bussi(MovementType type) {
        this.movementType = type;
    }

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public MovementType getMovement() {
        return this.movementType;
    }

    @Override
    public Action getAction() {
        return new Action("Älä kävele bussia päin!");
    }
}
