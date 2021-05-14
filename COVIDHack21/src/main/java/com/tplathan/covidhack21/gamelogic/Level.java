package com.tplathan.covidhack21.gamelogic;

import com.tplathan.covidhack21.gamelogic.monsters.Monster;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a single level and maintains the current state (what's the terrain
 * like, where are the monsters, where's the player etc)
 *
 * @author Tapani Plathan
 */
public class Level {

    private HashMap<Coordinate, TerrainType> terrain;
    private HashMap<Coordinate, Monster> monsters;
    private Coordinate playerCoordinate;
    private Coordinate staircaseCoordinate;
    private String name;
    private String activeStatusText;

    /**
     *
     * @param name is displayed to the player when they reach the level.
     */
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

    /**
     *
     * @return true if the player has reached the staircase.
     */
    public boolean isWon() {
        return this.playerCoordinate.equals(this.staircaseCoordinate);
    }

    /**
     *
     * @return true if the player sanity goes to zero.
     */
    public boolean isLost() {
        if (this.monsters.keySet().contains(this.playerCoordinate)) {
            return true;
        }
        return false;
    }

    protected void movePlayer(Direction direction) {
        int newPlayerX = this.playerCoordinate.getX() + direction.x;
        int newPlayerY = this.playerCoordinate.getY() + direction.y;
        Coordinate newPlayerCoordinate = new Coordinate(newPlayerX, newPlayerY);
        // Clear current status text
        this.activeStatusText = null;

        //Don't allow moving to a wall
        TerrainType terrainAtNewCoordinate = this.terrain.get(new Coordinate(newPlayerX, newPlayerY));
        if (terrainAtNewCoordinate == null || terrainAtNewCoordinate.isWall()) {
            // Do nothing
        } else if (this.monsters.containsKey(newPlayerCoordinate)) {
            // If moving to a monster, perform action instead
            Monster monster = this.monsters.get(newPlayerCoordinate);
            this.activeStatusText = monster.getAction().getStatusText();
        } else {
            this.playerCoordinate.setX(newPlayerX);
            this.playerCoordinate.setY(newPlayerY);
        }
    }

    protected void moveMonsters() {
        HashMap<Coordinate, Monster> newLocations = new HashMap<>();
        this.monsters.entrySet().forEach(entry -> {
            Coordinate monsterCoordinate = entry.getKey();
            Monster monster = entry.getValue();
            switch (monster.getMovement()) {
                case STATIONARY:
                    newLocations.put(monsterCoordinate, monster);
                    break;
                case TOWARDS_PLAYER:
                    ArrayList<Direction> directions = monsterCoordinate.getDirectionTowards(this.getPlayerCoordinate());
                    for (Direction dir : directions) {
                        Coordinate newCoord = monsterCoordinate.getAdjacent(dir);
                        if (this.isEmpty(newCoord)) {
                            newLocations.put(newCoord, monster);
                            return;
                        }
                    }
                    newLocations.put(monsterCoordinate, monster);
                    break;
                case DOWN:
                    Coordinate newLocationDown = monsterCoordinate.getAdjacent(Direction.DOWN);
                    if (this.terrain.containsKey(newLocationDown) && this.terrain.get(newLocationDown).isWall() == false) {
                        newLocations.put(newLocationDown, monster);
                    }
                    break;
                case UP:
                    Coordinate newLocationUp = monsterCoordinate.getAdjacent(Direction.UP);
                    if (this.terrain.containsKey(newLocationUp) && this.terrain.get(newLocationUp).isWall() == false) {
                        newLocations.put(newLocationUp, monster);
                    }
                    break;
            }
        });
        this.monsters = newLocations;
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

    /**
     * Adds a monster to a given location on the map.
     *
     * @param location
     * @param monster
     */
    public void addMonster(Coordinate location, Monster monster) {
        this.monsters.put(location, monster);
    }

    public HashMap<Coordinate, Monster> getMonsters() {
        return this.monsters;
    }

    public String getActiveStatusText() {
        return this.activeStatusText;
    }

    private boolean isEmpty(Coordinate coord) {
        if (terrain.get(coord).isWall()) {
            return false;
        }
        if (this.monsters.containsKey(coord)) {
            return false;
        }
        if (coord.equals(this.getPlayerCoordinate())) {
            return false;
        }
        if (coord.equals(this.getStaircaseCoordinate())) {
            return false;
        }
        return true;
    }

    public void setStaircaseCoordinate(Coordinate coord) {
        this.staircaseCoordinate = coord;
    }
}
