package com.tplathan.covidhack21.gamelogic;

import static com.tplathan.covidhack21.gamelogic.Direction.DOWN;
import static com.tplathan.covidhack21.gamelogic.Direction.LEFT;
import static com.tplathan.covidhack21.gamelogic.Direction.RIGHT;
import static com.tplathan.covidhack21.gamelogic.Direction.UP;

/**
 * Used to create a random direction for monsters to move in to
 *
 * @author Tapani Plathan
 */
public class RandomDirection {

    /**
     *
     * @return a random direction
     */
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

    /**
     *
     * @return a number between 1 and 4
     */
    private static int rollRandomNumber() {
        int min = 1;
        int max = 4;
        int range = max - min + 1;
        int number = (int) (Math.random() * range + min);
        return number;
    }
}
