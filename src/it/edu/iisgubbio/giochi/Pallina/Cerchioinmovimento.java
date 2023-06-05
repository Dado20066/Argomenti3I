package it.edu.iisgubbio.giochi.Pallina;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Cerchioinmovimento extends Application {

	Pane areaDiGioco = new Pane();
	Circle pallina = new Circle(20);
	double pallinaX;


	public void start(Stage primaryStage) throws Exception {
		areaDiGioco.setPrefSize(10000, 80);

		pallina.setFill(Color.GREEN);
		pallinaX = 20;
		pallina.setTranslateX(pallinaX);
		pallina.setTranslateY(40);
		areaDiGioco.getChildren().add(pallina);

		Scene scena = new Scene(areaDiGioco);
		primaryStage.setScene(scena);
		primaryStage.setTitle("Cerchio che si muove");
		primaryStage.show();

		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.010),
				x -> spostaPallina())
				);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
	}

	private void spostaPallina() {
		pallinaX++;
		pallina.setTranslateX(pallinaX);
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}