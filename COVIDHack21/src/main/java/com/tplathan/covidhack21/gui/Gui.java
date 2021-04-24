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
import javafx.stage.Stage;

public class Gui {

    private Game game;
    private LevelView levelView;
    private Stage stage;

    public Gui(Game game, Stage stage) {
        this.game = game;
        this.stage = stage;

        this.levelView = new LevelView();

        this.levelView.getScene().setOnKeyPressed(evt -> {
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
            this.drawLevel();
        });

        this.stage.setScene(levelView.getScene());
        this.stage.show();
        this.drawLevel();
    }

    public void drawLevel() {
        this.levelView.update(this.game.getCurrentLevel());
    }
}
