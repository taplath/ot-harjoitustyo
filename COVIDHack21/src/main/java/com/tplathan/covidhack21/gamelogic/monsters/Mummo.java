package com.tplathan.covidhack21.gamelogic.monsters;

import com.tplathan.covidhack21.gamelogic.Randomizer;

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
        String[] textValues = new String[]{
            "Mummo höpisee polvivaivoistaan.",
            "Mummo muistelee vanhoja hyviä DOS-aikoja.",
            "Mummo yrittää muistella, kuka se Maud-henkilö taas olikaan.",
            "Mummo: Onko tämä se intternets?"
        };
        String text = Randomizer.selectRandomValue(textValues);
        return new Action(text);
    }
}
