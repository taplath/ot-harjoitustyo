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
    public Direction getRandomDirection() throws NullPointerException {
        int randomNumber = rollRandomNumber();
        switch (randomNumber) {
            case 1:
                return UP;
            case 2:
                return RIGHT;
            case 3:
                return DOWN;
            case 4:
                return LEFT;
        }
        return null;
    }
        /**
         *
         * @return a number between 1 and 4
         */
    public static int rollRandomNumber() {
        int min = 1;
        int max = 4;
        int range = max - min + 1;
        int number = (int) (Math.random() * range + min);
        return number;
    }
}
