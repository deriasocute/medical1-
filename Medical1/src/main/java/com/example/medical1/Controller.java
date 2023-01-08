package com.example.medical1;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private GridPane unitsGrid;

    private List<Unit> units;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        units = new ArrayList<>(getUnit());
        int column = 0;
        int row = 1;
        units.addAll(getUnit());
        try{
            for(Unit unit: units) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Unit.fxml"));
                Pane pane = fxmlLoader.load();
                UnitController unitController = fxmlLoader.getController();
                unitController.setData(unit);

                if(column == 3){
                    column = 0;
                    ++row;
                }
                unitsGrid.add(pane, column++, row);
                GridPane.setMargin(pane, new Insets(20));
            }
        }catch (Exception e) {
            e.printStackTrace();
            }
    }
    private List<Unit> getUnit(){
        List<Unit> ls = new ArrayList<>();

        Unit unit = new Unit();
        unit.setName("Máy đo huyết áp");
        unit.setImgSrc("@image/thietbi.jpg");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Máy đo trợ thính");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Máy đo đường huyết");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Giường bệnh");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Giường Đệm");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Máy hút dịch");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(6);
        unit.setPrice(100);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Máy đo trợ thính");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Máy trợ thở");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Máy xông mũi");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);

        unit = new Unit();
        unit.setName("Máy massage");
        unit.setImgSrc("@image/271226.png");
        unit.setDays(5);
        unit.setPrice(1200);
        ls.add(unit);
        return ls;
    }
}
