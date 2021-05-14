package com.tplathan.covidhack21.gui;

import com.tplathan.covidhack21.gamelogic.Direction;
import com.tplathan.covidhack21.gamelogic.Game;
import java.io.FileNotFoundException;
import javafx.stage.Stage;

public class Gui {

    private Game game;
    private LevelView levelView;
    private MenuView menuView;
    private Stage stage;

    public Gui(Game game, Stage stage) throws FileNotFoundException {
        this.game = game;
        this.stage = stage;

        this.levelView = new LevelView();
        this.menuView = new MenuView(this);

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

            // Placeholder messages
            if (this.game.isWon()) {
                this.showMenu("Voitit pelin!");
            } else if (this.game.isLost()) {
                this.showMenu("Hävisit pelin!");
            } else {
                this.drawLevel();
            }
        });

        this.stage.setScene(this.menuView.getScene());
        this.stage.show();
        this.drawLevel();
    }

    public void startNewGame() {
        this.game.initNewGame();
        this.drawLevel();
        this.stage.setScene(this.levelView.getScene());
    }

    private void showMenu(String message) {
        this.menuView.setMessage(message);
        this.stage.setScene(this.menuView.getScene());
    }

    public void drawLevel() {
        this.levelView.update(this.game.getCurrentLevel(), this.game.getPlayer());
    }
}
