package com.tplathan.covidhack21.gamelogic.monsters;

public interface Monster {

    char getCharacter();

    Boolean stationary(Boolean stationary);

    void action(Action action);

}
