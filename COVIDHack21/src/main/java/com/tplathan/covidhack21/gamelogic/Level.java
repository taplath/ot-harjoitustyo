package com.tplathan.covidhack21.gamelogic;

import com.tplathan.covidhack21.gamelogic.monsters.Monster;
import java.util.HashMap;

public class Level {

    private HashMap<Coordinate, TerrainType> terrain;
    private HashMap<Coordinate, Monster> monsters;
    private Coordinate playerCoordinate;
    private Coordinate staircaseCoordinate;
    private String name;
    private String activeStatusText;

    public Level(String name) {
        this.name = name;
        this.terrain = new HashMap<>();
        this.monsters = new HashMap<>();
        this.playerCoordinate = new Coordinate(2, 2);
        // Actual coordinate TBD
        this.staircaseCoordinate = new Coordinate(10, 10);
    }

    public String getName() {
        return this.name;
    }

    public boolean isWon() {
        return this.playerCoordinate.equals(this.staircaseCoordinate);
    }

    public boolean isLost() {
        return false;
    }

    public void movePlayer(Direction direction) {
        int newPlayerX = this.playerCoordinate.getX() + direction.x;
        int newPlayerY = this.playerCoordinate.getY() + direction.y;
        Coordinate newPlayerCoordinate = new Coordinate(newPlayerX, newPlayerY);
        // Clear current status text
        this.activeStatusText = null;

        //Don't allow moving to a wall
        TerrainType terrainAtNewCoordinate = this.terrain.get(new Coordinate(newPlayerX, newPlayerY));
        if (terrainAtNewCoordinate == null || terrainAtNewCoordinate.isWall()) {
            return;
        }
        // If moving to a monster, perform action instead
        if (this.monsters.containsKey(newPlayerCoordinate)) {
            Monster monster = this.monsters.get(newPlayerCoordinate);
            this.activeStatusText = monster.getAction().getStatusText();
        }

        this.playerCoordinate.setX(newPlayerX);
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

    public void addMonster(Coordinate location, Monster monster) {
        this.monsters.put(location, monster);
    }

    public HashMap<Coordinate, Monster> getMonsters() {
        return this.monsters;
    }
    
    public String getActiveStatusText() {
        return this.activeStatusText;
    }
}
