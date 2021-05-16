package com.tplathan.covidhack21.gamelogic;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void initialisingNewGame() {
        Game game = new Game();
        assertFalse(game.isLost());
        assertFalse(game.isWon());
    }

    @Test
    public void movePlayer() {
        Game game = new Game();
        Coordinate playerCoordStart = game.getCurrentLevel().getPlayerCoordinate();
        Coordinate expectedNewLocation = playerCoordStart.getAdjacent(Direction.DOWN);
        game.movePlayer(Direction.DOWN);
        assertEquals(expectedNewLocation, game.getCurrentLevel().getPlayerCoordinate());
    }
}
