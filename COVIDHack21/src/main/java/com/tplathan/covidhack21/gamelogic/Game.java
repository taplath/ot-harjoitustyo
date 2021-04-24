package com.tplathan.covidhack21.gamelogic;

import java.util.ArrayList;

public class Game {

    private boolean isWon;
    private boolean isLost;
    private ArrayList<Level> levels;
    private int currentLevelIndex;
    private Player player;

    public Game() {
        this.isWon = false;
        this.isLost = false;
        this.player = new Player();
        this.levels = new ArrayList<>();
        this.levels.add(LevelLoader.firstLevel());
        this.levels.add(LevelLoader.secondLevel());

    }

    public boolean isWon() {
        return isWon;
    }

    public boolean isLost() {
        return isLost;
    }

    public void movePlayer(Direction direction) {
        this.getCurrentLevel().movePlayer(direction);

        if (this.getCurrentLevel().isLost()) {
            this.isLost = true;
            return;
        }

        if (getCurrentLevel().isWon()) {
            if (this.currentLevelIndex == this.levels.size() - 1) {
                this.isWon = true;
            } else {
                this.currentLevelIndex++;
            }
        }
    }

    public Level getCurrentLevel() {
        return this.levels.get(this.currentLevelIndex);
    }
}
