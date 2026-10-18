module main.ejercicio1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens main.ejercicio1_4 to javafx.fxml;
    exports main.ejercicio1_4;
}
