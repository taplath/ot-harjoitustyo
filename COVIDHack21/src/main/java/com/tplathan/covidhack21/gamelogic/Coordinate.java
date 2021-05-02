package com.tplathan.covidhack21.gamelogic;

import java.util.ArrayList;

/**
 * Coordinate represents a single location on the map
 *
 * @author Tapani Plathan
 */
public class Coordinate {

    private int x;
    private int y;

    /**
     *
     * @param x Horizontal axis
     * @param y Vertical axis
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    protected Coordinate getAdjacent(Direction direction) {
        return new Coordinate(this.x + direction.x, this.y + direction.y);
    }

    protected ArrayList<Direction> getDirectionTowards(Coordinate target) {
        ArrayList<Direction> dirs = new ArrayList<>();
        if (target.x > this.x) {
            dirs.add(Direction.RIGHT);
        } else if (target.x < this.x) {
            dirs.add(Direction.LEFT);
        }
        if (target.y > this.y) {
            dirs.add(Direction.DOWN);
        } else if (target.y < this.y) {
            dirs.add(Direction.UP);
        }
        return dirs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.x;
        hash = 67 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coordinate other = (Coordinate) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
