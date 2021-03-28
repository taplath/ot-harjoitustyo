package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.StaticLevel;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class Gui {

    public Scene createScene() {
        DrawBoard draw = new DrawBoard();
        GridPane gp = draw.drawBoard(StaticLevel.LEVEL);
        
        Scene scene = new Scene(gp, 640, 480);
        
        return scene;

    }
}
