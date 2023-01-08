package com.example.medical1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class UnitController {
    @FXML
    private ImageView img;
    @FXML
    private Label name;
    @FXML
    private Label days;
    @FXML
    private Label price;

    public void setData(Unit unit){
        Image image = new Image(getClass().getResourceAsStream(unit.getImgSrc()));
        img.setImage(image);
        name.setText(unit.getName());
        days.setText(unit.getDays()+"Năm");
        price.setText(unit.getPrice()+"VND");
    }
}
