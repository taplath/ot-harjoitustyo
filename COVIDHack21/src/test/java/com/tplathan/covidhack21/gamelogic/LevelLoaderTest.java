package com.tplathan.covidhack21.gamelogic;

import org.junit.Test;
import static org.junit.Assert.*;

public class LevelLoaderTest {

    @Test
    public void testLoadingFirstLevel() {
        Level level = LevelLoader.firstLevel();
        assertNotNull(level.getPlayerCoordinate());
        assertNotNull(level.getStaircaseCoordinate());
    }

    @Test
    public void testLoadingSecondLevel() {
        Level level = LevelLoader.secondLevel();
        assertNotNull(level.getPlayerCoordinate());
        assertNotNull(level.getStaircaseCoordinate());
    }

    @Test
    public void testLoadingThirdLevel() {
        Level level = LevelLoader.thirdLevel();
        assertNotNull(level.getPlayerCoordinate());
        assertNotNull(level.getStaircaseCoordinate());
    }

    @Test
    public void testLoadingFourthLevel() {
        Level level = LevelLoader.fourthLevel();
        assertNotNull(level.getPlayerCoordinate());
        assertNotNull(level.getStaircaseCoordinate());
    }

}
