package com.tplathan.covidhack21.gamelogic;

import gamelogic.monsters.Monster;
import java.util.ArrayList;
import java.util.HashMap;

public class Level {

    private HashMap<Coordinate, TerrainType> terrain;
    private ArrayList<Monster> monsters;
    private Coordinate playerCoordinate;
    private Coordinate staircaseCoordinate;

    public Level() {
        this.terrain = new HashMap<>();
        this.monsters = new ArrayList<>();
        this.playerCoordinate = new Coordinate(2, 2);
        // Actual coordinate TBD
        this.staircaseCoordinate = new Coordinate(10, 10);
    }

    public boolean isWon() {
        return this.playerCoordinate.equals(this.staircaseCoordinate);
    }

    public boolean isLost() {
        return false;
    }

    public void movePlayer(Direction direction) {
        int newPlayerX = this.playerCoordinate.getX() + direction.x;
        this.playerCoordinate.setX(newPlayerX);

        int newPlayerY = this.playerCoordinate.getY() + direction.y;
        this.playerCoordinate.setY(newPlayerY);
    }

    public Coordinate getPlayerCoordinate() {
        return this.playerCoordinate;
    }

    public void setTerrain(HashMap<Coordinate, TerrainType> terrain) {
        this.terrain = terrain;
    }

    public HashMap<Coordinate, TerrainType> getTerrain() {
        return this.terrain;
    }

    public Coordinate getStaircaseCoordinate() {
        return this.staircaseCoordinate;
    }
}
