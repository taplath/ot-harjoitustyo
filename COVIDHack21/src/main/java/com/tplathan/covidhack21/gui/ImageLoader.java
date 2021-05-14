package com.tplathan.covidhack21.gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageLoader {

    String menuImageLocation;
    String newGameButtonImageLocation;
    ImageView imageView;

    public ImageLoader() throws FileNotFoundException {
        this.menuImageLocation = "./src/main/resources/images/menupic.png";
        this.newGameButtonImageLocation = "./src/main/resources/images/newgame.png";
    }

    public ImageView getMenuImage() throws FileNotFoundException {
        Image image = new Image(new FileInputStream(this.menuImageLocation));
        return this.imageView = new ImageView(image);
    }

    public ImageView getMenuButtonImage() throws FileNotFoundException {
        Image image = new Image(new FileInputStream(this.newGameButtonImageLocation));
        return this.imageView = new ImageView(image);
    }
}
