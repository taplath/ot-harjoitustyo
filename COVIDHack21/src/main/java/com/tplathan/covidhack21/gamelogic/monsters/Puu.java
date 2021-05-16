package com.tplathan.covidhack21.gamelogic.monsters;

import com.tplathan.covidhack21.gamelogic.Randomizer;

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
    public Action getAction() {
        String[] textValues = new String[]{
            "Tämä on puu.",
            "Törmäsit puuhun!",
            "Kävelit puuta päin, senkin pölkkypää!",
            "Betula pendula, rauduskoivu."
        };
        String text = Randomizer.selectRandomValue(textValues);
        return new Action(text);
    }
}
