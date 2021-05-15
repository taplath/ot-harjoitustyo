package com.tplathan.covidhack21.gamelogic;

/**
 * TerrainType represents the content of a level map in certain coordinate, how
 * to display it and whether the player/monsters can move into it.
 *
 * @author Tapani Plathan
 */
public class TerrainType {

    private final boolean isWall;
    private final char marker;

    /**
     *
     * @param marker the character used to represent terrain is ASCII maps
     * @param isWall whether the terrain is wall, and can't be moved into
     */
    public TerrainType(char marker, boolean isWall) {
        this.marker = marker;
        this.isWall = isWall;
    }

    /**
     *
     * @return true if the terrain can't be moved into
     */
    public boolean isWall() {
        return this.isWall;
    }

    /**
     *
     * @return the character used to represent terrain in ASCII maps
     */
    public char getMarker() {
        return this.marker;
    }
}
