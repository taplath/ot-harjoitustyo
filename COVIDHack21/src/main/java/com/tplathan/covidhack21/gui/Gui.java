package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.Coordinate;
import com.tplathan.covidhack21.Game;
import com.tplathan.covidhack21.Level;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Gui {
    private Game game;
    private GridPane levelPane;
    private Scene scene;
    
    public Gui(Game game) {
        this.game = game;
        this.levelPane = new GridPane();
        this.scene = new Scene(levelPane, 640, 480);
    }
    
    public Scene getScene() {
        return this.scene;
    }
    
    public void drawLevel() {
        this.levelPane.getChildren().clear();
        Level level = this.game.getCurrentLevel();
        
        // Draw terrain
        level.getTerrain().entrySet().stream().forEach(e -> {
            Coordinate coordinate = e.getKey();
            char marker = e.getValue().getMarker();
            Label terrainLabel = new Label(marker + "");
            GridPane.setConstraints(terrainLabel, coordinate.getX(), coordinate.getY());
            this.levelPane.getChildren().add(terrainLabel);
        });
                
    }
}
