package it.edu.iisgubbio.giochi.Pallina;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Pallina extends Application {
	GraphicsContext contestoPerDisegnare;
	int posizioneX=50;

	public void start(Stage primaryStage) {
		Canvas tela = new Canvas(400, 400);
		contestoPerDisegnare = tela.getGraphicsContext2D();
		contestoPerDisegnare.setFill(Color.RED);
		contestoPerDisegnare.fillOval(50, 50, 20, 20);


		GridPane griglia = new GridPane();

		griglia.add(tela, 0, 0);




		Scene scene = new Scene(griglia);
		primaryStage.setTitle("Pallina che si muove");
		primaryStage.setScene(scene);
		primaryStage.show();



		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(1), 
				x -> scadutoTimer()));
		timeline.setCycleCount(100);
		timeline.play();

	}

	private void scadutoTimer() {
		contestoPerDisegnare.clearRect(posizioneX, 50, 20, 20);
		posizioneX = posizioneX+20;
		contestoPerDisegnare.setFill(Color.RED);
		contestoPerDisegnare.fillOval(posizioneX, 50, 20,20);


	}

	public static void main(String[] args) {
		launch(args);
	}
}







