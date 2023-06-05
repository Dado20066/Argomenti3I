package it.edu.iisgubbio.giochi.Pallina;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pallinacherimbalsa extends Application {

	int numeroPunti;

	double LARGHEZZA = 550;
	double ALTEZZA = 250;
	double RAGGIO = 10;
	Rectangle rettangoloS = new Rectangle(10,100);
	Rectangle rettangoloD = new Rectangle(10,100);
	Circle cerchio = new Circle(RAGGIO);
	boolean avantiX=true;
	boolean avantiY=true;

	public void start(Stage finestra) {
		Pane areaDiGioco = new Pane();
		areaDiGioco.setPrefSize(LARGHEZZA, ALTEZZA);

		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.003), 
				n -> aggiornaTimer()));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();


		cerchio.setCenterX(50);
		cerchio.setCenterY(-50);
		cerchio.setFill(Color.BLUE);
		areaDiGioco.getChildren().add(cerchio);
		rettangoloS.setX(0);
		rettangoloS.setY(0);
		rettangoloS.setFill(Color.RED);
		areaDiGioco.getChildren().add(rettangoloS);
		rettangoloD.setX(540);
		rettangoloD.setY(0);
		rettangoloD.setFill(Color.BLACK);
		areaDiGioco.getChildren().add(rettangoloD);

		Scene scene = new Scene(areaDiGioco);
		scene.setOnKeyPressed(e -> pigia(e));
		finestra.setTitle("Pallina che rimbalsa");
		finestra.setScene(scene);
		finestra.show();
	}

	private void pigia(KeyEvent e) {
		if (e.getText().equals("q")) {

			rettangoloS.setY(rettangoloS.getY()-5);
		}
		if (e.getText().equals("z")) {

			rettangoloS.setY(rettangoloS.getY()+5);
		}

		if (e.getText().equals("p")) {

			rettangoloD.setY(rettangoloD.getY()-5);
		}
		if (e.getText().equals(".")) {

			rettangoloD.setY(rettangoloD.getY()+5);
		}
	}

	private void aggiornaTimer() {

		double x = cerchio.getCenterX();
		double y = cerchio.getCenterY();

		if( avantiX ){
			x=x+1;
		}else{
			x=x-1;
		}

		if(avantiY){
			y=y+1;
		}else{
			y=y-1;
		}

		if(x>=LARGHEZZA+RAGGIO){
			avantiX=false;
		}

		if(y>=ALTEZZA-RAGGIO){
			avantiY=false;
		}

		if(x<=RAGGIO) {
			avantiX=true;
		}

		if(y<=RAGGIO) {
			avantiY=true;
		}

		cerchio.setCenterX(x);
		cerchio.setCenterY(y);

		Bounds b1 = cerchio.getBoundsInParent();
		Bounds b2 = rettangoloS.getBoundsInParent();
		Bounds b3 = rettangoloD.getBoundsInParent();
		if(b1.intersects(b2)) {
			avantiX=!avantiX;

		}
		if(b1.intersects(b3)) {
			avantiX=!avantiX;


		}

	}
	public static void main(String[] args) {
		launch(args);
	}
}