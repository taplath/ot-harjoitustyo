package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.gamelogic.Coordinate;
import com.tplathan.covidhack21.gamelogic.Direction;
import com.tplathan.covidhack21.gamelogic.Game;
import com.tplathan.covidhack21.gamelogic.Level;
import java.util.Iterator;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Gui {
    
    private Game game;
    private GridPane levelPane;
    private GridPane infoPane;
    private Label statusText;
    private Scene scene;
    private BorderPane bp;
    
    public Gui(Game game) {
        this.game = game;
        this.levelPane = new GridPane();
        this.infoPane = new GridPane();
        this.statusText = new Label();
        
        this.bp = new BorderPane();
        this.bp.setCenter(this.levelPane);
        this.bp.setBottom(this.infoPane);
        this.bp.setTop(this.statusText);
        
        this.scene = new Scene(this.bp, 1024, 768);
        
        this.scene.setOnKeyPressed(evt -> {
            switch (evt.getCode()) {
                case UP:
                    game.movePlayer(Direction.UP);
                    break;
                case DOWN:
                    game.movePlayer(Direction.DOWN);
                    break;
                case LEFT:
                    game.movePlayer(Direction.LEFT);
                    break;
                case RIGHT:
                    game.movePlayer(Direction.RIGHT);
                    break;
            }
            drawLevel();
        });
    }
    
    public Scene getScene() {
        return this.scene;
    }
    
public void drawLevel() {
        this.levelPane.getChildren().clear();
        Level level = this.game.getCurrentLevel();
        
        //Draw infopane
        
        this.infoPane.getChildren().clear();
        this.infoPane.add(new Label(level.getName()),0,0);
       
        // Draw terrain
        level.getTerrain().entrySet().stream().forEach(e -> {
            Coordinate coordinate = e.getKey();
            char marker = e.getValue().getMarker();
            Label terrainLabel = new Label(marker + "");
            terrainLabel.setMinWidth(12);
            terrainLabel.setAlignment(Pos.CENTER);
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
        playerLabel.setMinWidth(12);
        playerLabel.setAlignment(Pos.CENTER);
        GridPane.setConstraints(playerLabel, playerCoord.getX(), playerCoord.getY());
        this.levelPane.getChildren().add(playerLabel);  
       
        // Draw Staircase
        // TODO: Repetition refactoring
        Coordinate staircaseCoord = level.getStaircaseCoordinate();
        // Remove terrain label from staircase coord
        Iterator<Node> childIterator2 = this.levelPane.getChildren().iterator();
        while (childIterator2.hasNext()) {
            Node node = childIterator2.next();
            int x = GridPane.getColumnIndex(node);
            int y = GridPane.getRowIndex(node);
            if (x == staircaseCoord.getX() && y == staircaseCoord.getY()) {
                childIterator2.remove();
            }
        }
        // Add staircase label to staircase coord
        Label staircaseLabel = new Label(">");
        staircaseLabel.setMinWidth(12);
        staircaseLabel.setAlignment(Pos.CENTER);
        GridPane.setConstraints(staircaseLabel, staircaseCoord.getX(), staircaseCoord.getY());
        this.levelPane.getChildren().add(staircaseLabel);  
    }
}
