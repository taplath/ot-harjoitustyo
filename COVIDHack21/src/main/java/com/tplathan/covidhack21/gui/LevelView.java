package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.gamelogic.Coordinate;
import com.tplathan.covidhack21.gamelogic.Level;
import com.tplathan.covidhack21.gamelogic.Player;
import com.tplathan.covidhack21.gamelogic.monsters.Monster;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class LevelView {
    
    private final Scene scene;
    private final GridPane levelPane;
    private final GridPane infoPane;
    private final Label statusText;
    private final BorderPane bp;
    
    public LevelView() {
        this.levelPane = new GridPane();
        this.infoPane = new GridPane();
        this.statusText = new Label();
        
        this.bp = new BorderPane();
        this.bp.setCenter(this.levelPane);
        this.bp.setBottom(this.infoPane);
        this.bp.setTop(this.statusText);
        
        this.scene = new Scene(this.bp);
    }
    
    public Scene getScene() {
        return this.scene;
    }
    
    public void update(Level level, Player player) {
        this.levelPane.getChildren().clear();

        // Draw infopane        
        this.infoPane.getChildren().clear();
        this.infoPane.add(new Label(level.getName()), 0, 0);
        this.infoPane.add(new Label("Kriisinhallintakestopisteet: " + player.getSanity()), 0, 1);
        // Draw status text
        this.statusText.setText(level.getActiveStatusText());

        // Loop through terrain mapping
        level.getTerrain().entrySet().stream().forEach(e -> {
            Coordinate coordinate = e.getKey();
            // Default to drawing terrain marker
            char marker = e.getValue().getMarker();
            Label markerLabel = new Label(marker + "");
            // If location contains player, draw @ instead
            if (coordinate.equals(level.getPlayerCoordinate())) {
                markerLabel.setText("@");
            } // Else if location contains staircase, draw > instead
            else if (coordinate.equals(level.getStaircaseCoordinate())) {
                markerLabel.setText(">");
            }
            // If location contains monster, draw monster
            Monster monster = level.getMonsters().get(coordinate);
            if (monster != null) {
                markerLabel.setText(monster.getCharacter() + "");
            }
            
            markerLabel.setMinWidth(12);
            markerLabel.setAlignment(Pos.CENTER);
            
            this.levelPane.add(markerLabel, coordinate.getX(), coordinate.getY());
        });
    }
}
