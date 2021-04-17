package com.tplathan.covidhack21.gamelogic;

public class TerrainType {
    private boolean isWall;
    private char marker;
    
    public TerrainType(char marker, boolean isWall) {
        this.marker = marker;
        this.isWall = isWall;
    }
        
    public boolean isWall() {
        return this.isWall;
    }
    
    public char getMarker() {
        return this.marker;
    }
}
