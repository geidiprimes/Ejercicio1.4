package main.ejercicio1_4;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App extends Application {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtTabla;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage.setTitle("Ejemplo");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText().trim());
        StringBuilder tabla = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            tabla.append(numero).append("x").append(i).append(" = ").append(numero * i).append("\n");
        }

        txtTabla.setText(tabla.toString());
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtTabla.clear();
        txtNumero.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
