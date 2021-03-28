package com.tplathan.covidhack21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // TODO: BorderPane centering troubleshoot and sizing
        // BorderPane bp = new BorderPane();

        DrawBoard draw = new DrawBoard();
        GridPane gp = draw.drawBoard(StaticLevel.LEVEL);

        //  bp.getChildren().add(gp);
        // bp.setCenter(gp);
        Scene scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
