package com.tplathan.covidhack21;

public class Game {
    private boolean isWon;
    private boolean isLost;
    private Level currentLevel;
    private Player player;
    
    public Game() {
        this.isWon = false;
        this.isLost = false;
        this.player = new Player();
        this.currentLevel = LevelLoader.firstLevel();
    }
    
    public boolean isWon() {
        return isWon;
    }
    
    public boolean isLost() {
        return isLost;
    }
    
    public void movePlayer(Direction direction) {
        this.currentLevel.movePlayer(direction);
        
        if (this.currentLevel.isLost()) {
            this.isLost = true;
            return;
        }
        
        if(currentLevel.isWon()) {
            this.isWon = true;
        }
    }
    
    public Level getCurrentLevel() {
        return this.currentLevel;
    }
}
