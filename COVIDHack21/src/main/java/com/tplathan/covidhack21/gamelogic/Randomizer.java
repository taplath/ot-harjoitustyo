package com.tplathan.covidhack21.gamelogic;

/**
 * Used to create a randomness based behaviours
 *
 * @author Tapani Plathan
 */
public class Randomizer {

    /**
     *
     * @param min minimum integer value to be returned
     * @param max maximum integer value to be returned
     * @return a number between min and max
     */
    public static int rollRandomNumber(int min, int max) {
        int range = max - min + 1;
        int number = (int) (Math.random() * range + min);
        return number;
    }

    /**
     * Accepts an array of strings and returns a random element from it
     * @param strings array of options
     * @return a random value in the array
     */
    public static String selectRandomValue(String[] strings) {
        int index = rollRandomNumber(0, strings.length - 1);
        return strings[index];
    }
}
