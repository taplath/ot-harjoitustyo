package com.tplathan.covidhack21.gamelogic;

/**
 * Represents the options to which player/monster can move on the map, knows
 * which coordinates should be adjusted for each direction.
 *
 * On y-axis coordinates grow from top to bottom. 
 * On x-axis coordinates grow from left to right.
 *
 * @author Tapani Plathan
 */
public enum Direction {

    UP(0, -1),
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    public final int x;
    public final int y;

    Direction(int tempX, int tempY) {
        this.x = tempX;
        this.y = tempY;
    }

}
