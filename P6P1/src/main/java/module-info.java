module com.example.p6p1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.p6p1 to javafx.fxml;
    exports com.example.p6p1;
}