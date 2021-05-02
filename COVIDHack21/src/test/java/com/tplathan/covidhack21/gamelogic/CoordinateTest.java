package com.tplathan.covidhack21.gamelogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void testGetDiretionTowars() {
        Coordinate initial = new Coordinate(2, 2);
        Coordinate target = new Coordinate(100, 100);
        ArrayList<Direction> dirs = initial.getDirectionTowards(target);
        assertEquals(2, dirs.size());
        assertTrue(dirs.contains(Direction.DOWN));
        assertTrue(dirs.contains(Direction.RIGHT));
    }

    @Test
    public void testGetAdjacent() {
        Coordinate initial = new Coordinate(2, 2);
        assertEquals(new Coordinate(1, 2), initial.getAdjacent(Direction.LEFT));
        assertEquals(new Coordinate(3, 2), initial.getAdjacent(Direction.RIGHT));
        assertEquals(new Coordinate(2, 1), initial.getAdjacent(Direction.UP));
        assertEquals(new Coordinate(2, 3), initial.getAdjacent(Direction.DOWN));
    }

}
