package com.tplathan.covidhack21.gamelogic;

import java.util.ArrayList;

public class Game {

    private boolean isWon;
    private boolean isLost;
    private ArrayList<Level> levels;
    private int currentLevelIndex;
    private Player player;

    public Game() {
        this.initNewGame();
    }

    public void initNewGame() {
        this.isWon = false;
        this.isLost = false;
        this.resetPlayer();
        this.levels = new ArrayList<>();
        this.levels.add(LevelLoader.firstLevel());
        this.levels.add(LevelLoader.secondLevel());
        this.currentLevelIndex = 0;
    }

    private void resetPlayer() {
        this.player = new Player(30);
    }

    public boolean isWon() {
        return isWon;
    }

    public boolean isLost() {
        return isLost;
    }

    public void movePlayer(Direction direction) {
        this.getCurrentLevel().movePlayer(direction);
        this.player.reduceSanity();
        if (getCurrentLevel().isWon()) {
            if (this.currentLevelIndex == this.levels.size() - 1) {
                this.isWon = true;
            } else {
                this.currentLevelIndex++;
                this.resetPlayer();
            }
        }

        this.getCurrentLevel().moveMonsters();

        if (this.getCurrentLevel().isLost() || this.player.getSanity() <= 0) {
            this.isLost = true;
        }

    }

    public Level getCurrentLevel() {
        return this.levels.get(this.currentLevelIndex);
    }

    public Player getPlayer() {
        return this.player;
    }
}
