module com.example.medical1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.medical1 to javafx.fxml;
    exports com.example.medical1;
}