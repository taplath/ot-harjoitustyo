package com.tplathan.covidhack21.gamelogic.monsters;

public interface Monster {

    char getCharacter();

    boolean isStationary();

    Action getAction();

}