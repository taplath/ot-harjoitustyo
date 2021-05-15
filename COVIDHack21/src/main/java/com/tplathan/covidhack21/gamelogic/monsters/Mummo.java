package com.tplathan.covidhack21.gamelogic.monsters;

import com.tplathan.covidhack21.gamelogic.RandomDirection;

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
    public Action getAction() throws NullPointerException {
        switch (RandomDirection.rollRandomNumber()) {
            case 1:
                return new Action("Mummo höpisee polvivaivoistaan.");
            case 2:
                return new Action("Mummo muistelee vanhoja hyviä DOS-aikoja.");
            case 3:
                return new Action("Mummo yrittää muistella, kuka se Maud-henkilö taas olikaan.");
            case 4:
                return new Action("Mummo: Onko tämä se intternets?");
        }
        return null;
    }

}
