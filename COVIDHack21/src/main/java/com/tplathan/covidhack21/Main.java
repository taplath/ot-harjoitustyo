package com.tplathan.covidhack21;

import com.tplathan.covidhack21.gui.Gui;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Gui gui = new Gui();
        stage.setScene(gui.createScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
