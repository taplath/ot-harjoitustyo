package com.tplathan.covidhack21.gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageLoader {

    String menuImageLocation;

    public ImageLoader() throws FileNotFoundException {
        this.menuImageLocation = "./src/main/resources/images/menupic.png";
    }

    public ImageView getMenuImage() throws FileNotFoundException {
        Image image = new Image(new FileInputStream(this.menuImageLocation));
        ImageView imageView = new ImageView(image);
        return imageView;
    }

}
