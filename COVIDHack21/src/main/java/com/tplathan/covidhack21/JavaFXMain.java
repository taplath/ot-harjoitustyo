package com.tplathan.covidhack21;

import com.tplathan.covidhack21.gui.Gui;
import com.tplathan.covidhack21.gamelogic.Game;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

    @Override
    public void start(Stage stage) {
        Game game = new Game();
        Gui gui = new Gui(game, stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
