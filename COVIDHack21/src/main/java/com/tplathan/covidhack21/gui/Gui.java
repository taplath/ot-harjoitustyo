package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.DrawBoard;
import com.tplathan.covidhack21.StaticLevel;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class Gui {

    public Scene createScene() {
        // TODO: BorderPane centering troubleshoot and sizing
        // BorderPane bp = new BorderPane();

        DrawBoard draw = new DrawBoard();
        GridPane gp = draw.drawBoard(StaticLevel.LEVEL);

        //  bp.getChildren().add(gp);
        // bp.setCenter(gp);
        Scene scene = new Scene(gp, 640, 480);
        return scene;

    }
}
