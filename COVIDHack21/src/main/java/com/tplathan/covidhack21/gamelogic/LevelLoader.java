package com.tplathan.covidhack21.gamelogic;

import com.tplathan.covidhack21.gamelogic.monsters.Mummo;
import java.util.HashMap;

/**
 * Initiates Level objects, contains logic for creating and loading them.
 *
 * @author Tapani Plathan
 */
public class LevelLoader {

    // Simple level for testing and future expansion
    private static final char[][] LEVEL_BASE = new char[][]{
        "################################################################################".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "#..............................................................................#".toCharArray(),
        "################################################################################".toCharArray()};

    /**
     *
     * Creates the first level of the game
     */
    public static Level firstLevel() {
        Level level = new Level("Level 1");

        HashMap<Coordinate, TerrainType> terrainMap = new HashMap<>();
        for (int y = 0; y < LEVEL_BASE.length; y++) {
            for (int x = 0; x < LEVEL_BASE[0].length; x++) {
                char terrainMarker = LEVEL_BASE[y][x];
                boolean isWall = false;
                if (terrainMarker == '#') {
                    isWall = true;
                }
                TerrainType terrain = new TerrainType(terrainMarker, isWall);

                // y coordinate 0 should be bottom, not top
                int invertedY = LEVEL_BASE.length - y;
                Coordinate coordinate = new Coordinate(x, invertedY);
                terrainMap.put(coordinate, terrain);
            }
        }

        level.setTerrain(terrainMap);
        return level;
    }

    /**
     *
     * Creates the second level of the game
     */

    public static Level secondLevel() {
        Level level = new Level("Level 2");

        HashMap<Coordinate, TerrainType> terrainMap = new HashMap<>();
        for (int y = 0; y < LEVEL_BASE.length; y++) {
            for (int x = 0; x < LEVEL_BASE[0].length; x++) {
                char terrainMarker = LEVEL_BASE[y][x];
                boolean isWall = false;
                if (terrainMarker == '#') {
                    isWall = true;
                }
                TerrainType terrain = new TerrainType(terrainMarker, isWall);

                // y coordinate 0 should be bottom, not top
                int invertedY = LEVEL_BASE.length - y;
                Coordinate coordinate = new Coordinate(x, invertedY);
                terrainMap.put(coordinate, terrain);
            }
        }

        level.setTerrain(terrainMap);

        level.addMonster(new Coordinate(4, 4), new Mummo());

        return level;
    }

}
