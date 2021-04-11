
package com.tplathan.covidhack21;

import com.tplathan.covidhack21.monsters.Monster;
import java.util.ArrayList;

public class Level {
    private ArrayList<Monster> monsters;
    private Coordinate playerCoordinate;
    private Coordinate staircaseCoordinate;
    
    public Level() {
        this.monsters = new ArrayList<>();
        this.playerCoordinate = new Coordinate(0, 0);
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
}
