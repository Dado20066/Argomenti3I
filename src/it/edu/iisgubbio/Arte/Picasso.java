package it.edu.iisgubbio.Arte;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Picasso extends Application {

	Canvas quadro = new Canvas(1000, 1000);
	GraphicsContext gc = quadro.getGraphicsContext2D();
	public void start(Stage primaryStage) {




		GridPane root = new GridPane();
		quadro.addEventHandler(MouseEvent.MOUSE_MOVED, evento -> gestisciClick(evento));
		quadro.addEventHandler(MouseEvent.MOUSE_DRAGGED, x-> gestisciMovimento(x));
		root.add(quadro, 0, 0);


		Scene scene = new Scene(root);
		primaryStage.setTitle("Picasso");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void gestisciClick(MouseEvent evento){
		
		if(evento.isAltDown()) {
			gc.setFill(Color.YELLOW);
			gc.fillOval(evento.getX()-5, evento.getY()-5, 10, 10);
		}else{
			if
		(evento.isShiftDown()) {
			gc.setFill(Color.RED);
			gc.fillOval(evento.getX()-5, evento.getY()-5, 10, 10);
		}else {
			gc.setFill(Color.BLACK);
			gc.fillOval(evento.getX()-5, evento.getY()-5, 10, 10);
		}
		}
		
	}
	private void gestisciMovimento(MouseEvent x){
		

		if(x.getButton()==MouseButton.PRIMARY) {
			gc.setFill(Color.GREEN);
		}
		if(x.getButton()==MouseButton.SECONDARY) {
			gc.setFill(Color.BLUE);
		}
		
		gc.fillOval(x.getX()-5, x.getY()-5, 10, 10);
	}

	public static void main(String[] args) {
		launch(args);
	}
}