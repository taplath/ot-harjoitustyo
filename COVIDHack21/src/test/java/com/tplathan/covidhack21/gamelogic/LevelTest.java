package com.tplathan.covidhack21.gamelogic;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

public class LevelTest {

    public final int PLAYER_START_X = 2;
    public final int PLAYER_START_Y = 2;

    private Level buildTestLevel() {
        Level newLevel = new Level("");
        HashMap<Coordinate, TerrainType> terrain = new HashMap<>();
        terrain.put(new Coordinate(PLAYER_START_X, PLAYER_START_Y), new TerrainType('.', false));
        terrain.put(new Coordinate(PLAYER_START_X + 1, PLAYER_START_Y), new TerrainType('.', false));
        terrain.put(new Coordinate(PLAYER_START_X, PLAYER_START_Y + 1), new TerrainType('.', false));
        terrain.put(new Coordinate(PLAYER_START_X + 1, PLAYER_START_Y + 1), new TerrainType('.', false));
        newLevel.setTerrain(terrain);
        return newLevel;
    }

    @Test
    public void playerAtStartPosition() {
        Level newLevel = buildTestLevel();
        HashMap<Coordinate, TerrainType> terrain = new HashMap<>();
        Coordinate playerAtInit = newLevel.getPlayerCoordinate();
        assertEquals(this.PLAYER_START_X, playerAtInit.getX());
        assertEquals(this.PLAYER_START_Y, playerAtInit.getY());
    }

    @Test
    public void playerMovesOnXAxis() {
        Level newLevel = buildTestLevel();
        newLevel.movePlayer(Direction.RIGHT);
        Coordinate playerAfterMoveRight = newLevel.getPlayerCoordinate();
        assertEquals(this.PLAYER_START_X + 1, playerAfterMoveRight.getX());
        assertEquals(this.PLAYER_START_Y, playerAfterMoveRight.getY());
    }

    @Test
    public void playerMovesOnYAxis() {
        Level newLevel = buildTestLevel();
        newLevel.movePlayer(Direction.DOWN);
        Coordinate playerAfterMoveRight = newLevel.getPlayerCoordinate();
        assertEquals(this.PLAYER_START_X, playerAfterMoveRight.getX());
        assertEquals(this.PLAYER_START_Y + 1, playerAfterMoveRight.getY());
    }

}
