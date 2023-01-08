package com.example.medical1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
        ImageView imageView;
        Image image = new Image(getClass().getResourceAsStream("@image/471664.png"));

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        imageView.setImage(image);
    }
}