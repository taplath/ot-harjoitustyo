package com.tplathan.covidhack21;

public enum Direction {

    UP(0,1),
    DOWN(0,-1),
    LEFT(-1,0),
    RIGHT(1,0);

    public final int x;
    public final int y;
    
    Direction(int tempX, int tempY) {
        this.x = tempX;
        this.y = tempY;
    }

}
