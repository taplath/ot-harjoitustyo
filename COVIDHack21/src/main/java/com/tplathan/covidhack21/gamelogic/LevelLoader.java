package com.tplathan.covidhack21.gamelogic;

import com.tplathan.covidhack21.gamelogic.monsters.Junnu;
import com.tplathan.covidhack21.gamelogic.monsters.Mummo;
import java.util.HashMap;

/**
 * Initiates Level objects, contains logic for creating and loading them.
 *
 * @author Tapani Plathan
 */
public class LevelLoader {

    private static HashMap<Coordinate, TerrainType> generateTerrain(Coordinate topLeft, int width, int height) {
        HashMap<Coordinate, TerrainType> map = new HashMap<>();
        for (int x = topLeft.getX() - 1; x < topLeft.getX() + width + 1; x++) {
            for (int y = topLeft.getY() - 1; y < topLeft.getY() + height + 1; y++) {
                if (x < topLeft.getX() || y < topLeft.getY() || x >= topLeft.getX() + width || y >= topLeft.getY() + height) {
                    // Outside map area, add a wall
                    map.put(new Coordinate(x, y), new TerrainType('#', true));
                } else {
                    map.put(new Coordinate(x, y), new TerrainType('.', false));
                }
            }
        }
        return map;
    }

    /**
     *
     * Creates the first level of the game
     *
     * @return the first level object
     */
    public static Level firstLevel() {
        Level level = new Level("Level 1");

        HashMap<Coordinate, TerrainType> terrainMap = generateTerrain(new Coordinate(1, 1), 34, 15);

        level.setTerrain(terrainMap);
        return level;
    }

    /**
     *
     * Creates the second level of the game
     *
     * @return the second level object
     */
    public static Level secondLevel() {
        Level level = new Level("Level 2");

        HashMap<Coordinate, TerrainType> terrainMap = generateTerrain(new Coordinate(1, 1), 34, 15);

        level.setTerrain(terrainMap);

        level.addMonster(new Coordinate(4, 4), new Mummo());
        level.addMonster(new Coordinate(6, 2), new Mummo());
        level.addMonster(new Coordinate(11, 14), new Mummo());
        level.addMonster(new Coordinate(8, 8), new Mummo());
        level.addMonster(new Coordinate(2, 9), new Mummo());
        level.addMonster(new Coordinate(33, 8), new Mummo());

        level.addMonster(new Coordinate(12, 12), new Junnu());

        return level;
    }
}
