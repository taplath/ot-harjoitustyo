package com.tplathan.covidhack21.gui;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

//Draws the board for the GUI
//TODO: Move to correct package
//TODO: Expand
public class DrawBoard {

    GridPane gp;

    public DrawBoard() {
        this.gp = new GridPane();
    }

    public GridPane drawBoard(char[][] data) {
        for (int x = 0; x < data[0].length; x++) {
            for (int y = 0; y < data.length; y++) {
                Label label = new Label(data[y][x] + "");
                GridPane.setConstraints(label, x, y);
                gp.getChildren().add(label);
            }
        }
        return this.gp;
    }
}
