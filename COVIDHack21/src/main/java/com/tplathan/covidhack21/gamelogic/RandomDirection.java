package com.tplathan.covidhack21.gamelogic;

import static com.tplathan.covidhack21.gamelogic.Direction.DOWN;
import static com.tplathan.covidhack21.gamelogic.Direction.LEFT;
import static com.tplathan.covidhack21.gamelogic.Direction.RIGHT;
import static com.tplathan.covidhack21.gamelogic.Direction.UP;

public class RandomDirection {

    private static int rollRandomNumber() {
        int min = 1;
        int max = 4;
        int range = max - min + 1;
        int number = (int) (Math.random() * range + min);
        return number;
    }

    public Direction getRandomDirection() {
        int randomNumber = rollRandomNumber();
        if (randomNumber == 1) {
            return UP;
        }
        if (randomNumber == 2) {
            return RIGHT;
        }
        if (randomNumber == 3) {
            return DOWN;
        }
        return LEFT;
    }

}
