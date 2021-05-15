package com.tplathan.covidhack21.gamelogic;

public class Player {

    private int sanity;

    public Player(int sanity) {
        this.sanity = sanity;
    }

    public int getSanity() {
        return this.sanity;
    }

    public void reduceSanity() {
        this.sanity--;
    }

}
