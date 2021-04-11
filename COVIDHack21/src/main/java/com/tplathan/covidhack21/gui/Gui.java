package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.LevelLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class Gui {

    public Scene createScene() {
        DrawBoard draw = new DrawBoard();
        GridPane gp = draw.drawBoard(LevelLoader.LEVEL);
        
        Scene scene = new Scene(gp, 640, 480);
        
        return scene;

    }
}
