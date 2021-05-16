package com.tplathan.covidhack21.gamelogic;

import com.tplathan.covidhack21.gamelogic.monsters.Bussi;
import com.tplathan.covidhack21.gamelogic.monsters.Kapistelija;
import com.tplathan.covidhack21.gamelogic.monsters.MovementType;
import com.tplathan.covidhack21.gamelogic.monsters.Mummo;
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

    @Test
    public void stationaryMonsterDoesntMove() {
        Level newLevel = buildTestLevel();
        Coordinate monsterStartCoordinates = new Coordinate(PLAYER_START_X + 1, PLAYER_START_Y + 1);
        newLevel.addMonster(monsterStartCoordinates, new Mummo());
        newLevel.moveMonsters();
        Coordinate monsterEndCoordinates = (Coordinate) newLevel.getMonsters().keySet().toArray()[0];
        assertEquals(monsterStartCoordinates, monsterEndCoordinates);
    }

    @Test
    public void monsterMovesTowardsPlayer() {
        Level newLevel = buildTestLevel();
        Coordinate monsterStartCoordinates = new Coordinate(PLAYER_START_X + 1, PLAYER_START_Y + 1);
        newLevel.addMonster(monsterStartCoordinates, new Kapistelija());
        newLevel.moveMonsters();
        Coordinate monsterEndCoordinates = (Coordinate) newLevel.getMonsters().keySet().toArray()[0];
        assertNotEquals(monsterStartCoordinates, monsterEndCoordinates);
    }

    @Test
    public void monsterMovesUp() {
        Level newLevel = buildTestLevel();
        Coordinate monsterStartCoordinates = new Coordinate(PLAYER_START_X + 1, PLAYER_START_Y + 1);
        newLevel.addMonster(monsterStartCoordinates, new Bussi(MovementType.UP));
        Coordinate expectedMonsterEndCoordinates = monsterStartCoordinates.getAdjacent(Direction.UP);
        newLevel.moveMonsters();
        Coordinate monsterEndCoordinates = (Coordinate) newLevel.getMonsters().keySet().toArray()[0];
        assertEquals(expectedMonsterEndCoordinates, monsterEndCoordinates);
    }

    @Test
    public void monsterMovesDown() {
        Level newLevel = buildTestLevel();
        Coordinate monsterStartCoordinates = new Coordinate(PLAYER_START_X + 1, PLAYER_START_Y);
        newLevel.addMonster(monsterStartCoordinates, new Bussi(MovementType.DOWN));
        Coordinate expectedMonsterEndCoordinates = monsterStartCoordinates.getAdjacent(Direction.DOWN);
        newLevel.moveMonsters();
        Coordinate monsterEndCoordinates = (Coordinate) newLevel.getMonsters().keySet().toArray()[0];
        assertEquals(expectedMonsterEndCoordinates, monsterEndCoordinates);
    }

}
