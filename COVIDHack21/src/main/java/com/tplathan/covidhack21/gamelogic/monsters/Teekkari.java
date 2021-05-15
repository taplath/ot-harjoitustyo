/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tplathan.covidhack21.gamelogic.monsters;

/**
 *
 * @author plathant
 */
public class Teekkari implements Monster {

    @Override
    public char getCharacter() {
        return 'T';
    }

    @Override
    public MovementType getMovement() {
        return MovementType.RANDOM;
    }

    @Override
    public Action getAction() {
        return new Action("Teekkari: Sori, pakkomyin mun Äpyt edelliselle @-merkille.");
    }
}

