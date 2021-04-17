package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.Coordinate;
import com.tplathan.covidhack21.Game;
import com.tplathan.covidhack21.Level;
import java.util.Iterator;
import javafx.scene.Node;
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
        
        // Draw Player
        Coordinate playerCoord = level.getPlayerCoordinate();
        // Remove terrain label from player coord
        Iterator<Node> childIterator = this.levelPane.getChildren().iterator();
        while (childIterator.hasNext()) {
            Node node = childIterator.next();
            int x = GridPane.getColumnIndex(node);
            int y = GridPane.getRowIndex(node);
            if (x == playerCoord.getX() && y == playerCoord.getY()) {
                childIterator.remove();
            }
        }
        // Add player label to player coord
        Label playerLabel = new Label("@");
        GridPane.setConstraints(playerLabel, playerCoord.getX(), playerCoord.getY());
        this.levelPane.getChildren().add(playerLabel);   
    }
}
