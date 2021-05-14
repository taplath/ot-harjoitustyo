package com.tplathan.covidhack21.gui;

import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class MenuView {

    private Scene scene;
    private BorderPane bp;
    private Label message;
    private Button newGameButton;
    private Gui gui;
    private ImageLoader imageLoader;

    public MenuView(Gui gui) throws FileNotFoundException {
        this.gui = gui;
        this.imageLoader = new ImageLoader();
        this.message = new Label("");
        initNewGameButton();
        initBorderPane();

        this.scene = new Scene(this.bp);
    }

    public Scene getScene() {
        return this.scene;
    }

    public void setMessage(String message) {
        this.message.setText(message);
    }

    private void initNewGameButton() throws FileNotFoundException {
        this.newGameButton = new Button("", this.imageLoader.getMenuButtonImage());
        this.newGameButton.setOnAction(evt -> {
            this.gui.startNewGame();
        });
    }

    private void initBorderPane() throws FileNotFoundException {
        this.bp = new BorderPane();
        this.bp.setTop(this.message);
        this.bp.setCenter(this.imageLoader.getMenuImage());
        this.bp.setBottom(this.newGameButton);
        BorderPane.setAlignment(this.newGameButton, Pos.CENTER);
    }
}
