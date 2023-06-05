package it.edu.iisgubbio.Grafica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Tela extends Application {

	private Canvas quadro;

	GraphicsContext gc;

	Button bDisegna = new Button("disegna");

	public void start(Stage primaryStage) {

		quadro = new Canvas(300, 260);
		gc = quadro.getGraphicsContext2D();


		gc.setFill(Color. BLACK);
		gc.setLineWidth(1);
		gc.fillOval(50, 50, 200, 200);
		gc.setFill(Color. YELLOW);
		gc.fillOval(100, 100, 20, 20);
		gc.fillOval(180, 100, 20, 20);


		GridPane root = new GridPane();
		// inseriamo il nostro canvas nella finestra
		root.add(quadro, 0, 0);
		root.add(bDisegna, 0, 4);

		Scene scene = new Scene(root);
		primaryStage.setTitle("Hello Canvas!");
		primaryStage.setScene(scene);
		primaryStage.show();

		bDisegna.setOnAction(e -> clickEffetto());
	}


	public void clickEffetto(){
		gc.applyEffect(new GaussianBlur(20));

	}


	public static void main(String[] args) {
		launch(args);
	}
}