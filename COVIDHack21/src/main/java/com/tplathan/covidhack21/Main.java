package com.tplathan.covidhack21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        
        DrawBoard draw = new DrawBoard();
        GridPane gp = draw.drawBoard(StaticLevel.LEVEL);
        
        Scene scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
