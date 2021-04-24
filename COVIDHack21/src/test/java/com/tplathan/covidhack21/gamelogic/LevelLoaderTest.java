package com.tplathan.covidhack21.gamelogic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author plathant
 */
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

}
