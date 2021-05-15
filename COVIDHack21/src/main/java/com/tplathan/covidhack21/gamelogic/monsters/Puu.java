package com.tplathan.covidhack21.gamelogic.monsters;

import com.tplathan.covidhack21.gamelogic.RandomDirection;

public class Puu implements Monster {

    @Override
    public char getCharacter() {
        return 'P';
    }

    @Override
    public MovementType getMovement() {
        return MovementType.STATIONARY;
    }

    @Override
    public Action getAction() throws NullPointerException {
        switch (RandomDirection.rollRandomNumber()) {
            case 1:
                return new Action("Tämä on puu.");
            case 2:
                return new Action("Törmäsit puuhun!");
            case 3:
                return new Action("Kävelit puuta päin, senkin pölkkypää!");
            case 4:
                return new Action("Betula pendula, rauduskoivu.");
        }
        return null;
    }
}
