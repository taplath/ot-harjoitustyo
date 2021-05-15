package com.tplathan.covidhack21.gamelogic;

import com.tplathan.covidhack21.gamelogic.monsters.Bussi;
import com.tplathan.covidhack21.gamelogic.monsters.Hoitaja;
import com.tplathan.covidhack21.gamelogic.monsters.Jaara;
import com.tplathan.covidhack21.gamelogic.monsters.Kapistelija;
import com.tplathan.covidhack21.gamelogic.monsters.MovementType;
import com.tplathan.covidhack21.gamelogic.monsters.Mummo;
import com.tplathan.covidhack21.gamelogic.monsters.Puu;
import com.tplathan.covidhack21.gamelogic.monsters.Teekkari;
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
        Level level = new Level("Taso 1: Gurula");

        HashMap<Coordinate, TerrainType> terrainMap = generateTerrain(new Coordinate(1, 1), 34, 15);

        level.setTerrain(terrainMap);

        level.addMonster(new Coordinate(4, 4), new Jaara());
        level.addMonster(new Coordinate(7, 7), new Jaara());
        level.addMonster(new Coordinate(11, 12), new Jaara());

        return level;
    }

    /**
     *
     * Creates the second level of the game
     *
     * @return the second level object
     */
    public static Level secondLevel() {
        Level level = new Level("Taso 2: Pietari Kalmin katu");

        HashMap<Coordinate, TerrainType> terrainMap = generateTerrain(new Coordinate(1, 1), 34, 15);

        level.setTerrain(terrainMap);

        level.addMonster(new Coordinate(4, 4), new Puu());
        level.addMonster(new Coordinate(6, 2), new Mummo());
        level.addMonster(new Coordinate(11, 14), new Puu());
        level.addMonster(new Coordinate(8, 8), new Mummo());
        level.addMonster(new Coordinate(2, 9), new Puu());
        level.addMonster(new Coordinate(31, 7), new Puu());
        level.addMonster(new Coordinate(33, 8), new Mummo());
        level.addMonster(new Coordinate(32, 17), new Puu());
        level.addMonster(new Coordinate(22, 17), new Puu());
        level.addMonster(new Coordinate(21, 7), new Puu());
        level.addMonster(new Coordinate(22, 2), new Puu());

        level.addMonster(new Coordinate(12, 12), new Kapistelija());

        return level;
    }

    /**
     *
     * Creates the third level of the game
     *
     * @return the third level object
     */
    public static Level thirdLevel() {
        Level level = new Level("Taso 3: Mannerheimintie... Älä jää bussin alle!");

        HashMap<Coordinate, TerrainType> terrainMap = generateTerrain(new Coordinate(1, 1), 34, 15);

        level.setTerrain(terrainMap);

        level.addMonster(new Coordinate(4, 0), new Bussi(MovementType.DOWN));
        level.addMonster(new Coordinate(4, 1), new Bussi(MovementType.DOWN));
        level.addMonster(new Coordinate(6, 0), new Bussi(MovementType.DOWN));
        level.addMonster(new Coordinate(6, 1), new Bussi(MovementType.DOWN));
        level.addMonster(new Coordinate(7, 12), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(7, 13), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(9, 15), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(9, 16), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(11, 8), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(11, 9), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(14, 11), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(14, 12), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(16, 0), new Bussi(MovementType.DOWN));
        level.addMonster(new Coordinate(16, 1), new Bussi(MovementType.DOWN));
        level.addMonster(new Coordinate(17, 15), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(17, 16), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(23, 13), new Bussi(MovementType.UP));
        level.addMonster(new Coordinate(23, 14), new Bussi(MovementType.UP));

        level.setStaircaseCoordinate(new Coordinate(15, 7));

        return level;
    }

    /**
     *
     * Creates the fourth level of the game
     *
     * @return the fourth level object
     */
    public static Level fourthLevel() {
        Level level = new Level("Taso 4: Terveyskeskus");

        HashMap<Coordinate, TerrainType> terrainMap = generateTerrain(new Coordinate(1, 1), 34, 15);

        level.setTerrain(terrainMap);

        level.addMonster(new Coordinate(8, 9), new Hoitaja());
        level.addMonster(new Coordinate(4, 4), new Teekkari());
        level.addMonster(new Coordinate(5, 6), new Mummo());
        level.addMonster(new Coordinate(7, 7), new Mummo());
        level.addMonster(new Coordinate(11, 13), new Mummo());
        level.addMonster(new Coordinate(11, 17), new Mummo());
        level.addMonster(new Coordinate(12, 27), new Mummo());
        level.addMonster(new Coordinate(7, 23), new Mummo());
        level.addMonster(new Coordinate(3, 7), new Mummo());
        level.addMonster(new Coordinate(14, 4), new Mummo());
        
        return level;
    }
}
