package com.tplathan.covidhack21;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author plathant
 */

public class LevelTest {

    @Test
    public void playerAtOrigoAtStartOfLevel() {
        Level newLevel = new Level();
        Coordinate playerAtInit = newLevel.getPlayerCoordinate();
        assertEquals(0, playerAtInit.getX());
        assertEquals(0, playerAtInit.getY());
    }

    @Test
    public void playerMovesOnXAxis() {
        Level newLevel = new Level();
        newLevel.movePlayer(Direction.RIGHT);
        Coordinate playerAfterMoveRight = newLevel.getPlayerCoordinate();
        assertEquals(1, playerAfterMoveRight.getX());
        assertEquals(0, playerAfterMoveRight.getY());
    }

    @Test
    public void playerMovesOnYAxis() {
        Level newLevel = new Level();
        newLevel.movePlayer(Direction.UP);
        Coordinate playerAfterMoveRight = newLevel.getPlayerCoordinate();
        assertEquals(0, playerAfterMoveRight.getX());
        assertEquals(1, playerAfterMoveRight.getY());
    }
}
