package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Provabin extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Label label = new Label("Inserisci un numero esadecimale:");
        TextField textField = new TextField();
        Label resultLabel = new Label();

        textField.setOnAction(event -> {
            String hexString = textField.getText();
            try {
                int decimal = Integer.parseInt(hexString, 16);
                resultLabel.setText("Decimale: " + decimal);
            } catch (NumberFormatException e) {
                resultLabel.setText("Errore: input non valido");
            }
        });

        root.getChildren().addAll(label, textField, resultLabel);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hex to Decimal");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}