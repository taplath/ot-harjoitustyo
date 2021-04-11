package com.tplathan.covidhack21;

import com.tplathan.covidhack21.gui.Gui;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Game game = new Game();
        
        Gui gui = new Gui(game);
        
        stage.setScene(gui.getScene());
        
        stage.show();
        
        gui.drawLevel();
    }

    public static void main(String[] args) {
        launch();
    }
}
