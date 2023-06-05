package it.edu.iisgubbio.giochi;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Spaceinvider  extends Application {

	//immagini


	Label lEsitoGioco =new Label("Esito:");

	// campo e bersagli
	final double CAMPO_LARGHEZZA = 650;
	final double CAMPO_ALTEZZA =700;
	final double PALLINA_RAGGIO = 8;

	final double Rettangolo_Verde = 4;
	final double Rettangolo_Marrone = 4;
	final double Rettangolo_Rosso = 4;

	Pane areaDiGioco = new Pane();
	//bersagli e giocatore

	Rectangle giocatore = new Rectangle(100,10);

	Rectangle avversarioBlu = new Rectangle(50,10);
	Rectangle avversarioMarrone  = new Rectangle(50,10);
	Rectangle avversarioRosso  = new Rectangle(50,10);
	Rectangle avversarioGiallo  = new Rectangle(50,10);
	Rectangle avversarioVerde  = new Rectangle(50,10);
	Rectangle avversarioViola  = new Rectangle(50,10);



	double incrementon1f1 = 3.0;
	double incremento2f1 = 3.0;
	double incremento3f1 = 3.0;

	// pallina
	Circle cerchio = new Circle(PALLINA_RAGGIO);

	boolean avantiX=true;
	boolean avantiY=true;

	boolean avantin1f1=true;
	boolean avantin2f1=true;
	boolean avantin3f1=true;

	boolean colpitoMarrone=false;
	boolean colpitoBlu=false;
	boolean colpitoRosso=false;
	boolean colpitoGiallo=false;
	boolean colpitoVerde=false;
	boolean colpitoViola=false;

	//bersaglio nero
	int nero1X=200;
	int nero1Y=0;

	// bersaglio blu
	int nero2X=200;
	int rosso2Y=0;

	// bersaglio nero
	int nero3X=200;
	int nero3Y=0;

	//conta palline
	int contaPalline=0;

	// movimento pallina

	Timeline timelinePallina= new Timeline(new KeyFrame(
			Duration.seconds(0.02),
			n ->sparaProiettile()));

	public void start(Stage primaryStage) {

		Pane areaDiGioco = new Pane();
		areaDiGioco.getChildren().add(lEsitoGioco);
		areaDiGioco.setPrefSize(CAMPO_LARGHEZZA, CAMPO_ALTEZZA);

		timelinePallina.setCycleCount(Timeline.INDEFINITE);

		cerchio.setCenterX(370);
		cerchio.setCenterY(9590);
		cerchio.setFill(Color.WHITE);
		areaDiGioco.getChildren().add(cerchio);

		//Esito Gioco
		lEsitoGioco.setLayoutY(650);

		//il giocatore
		giocatore.setX(325);
		giocatore.setY(600);
		giocatore.setFill(Color.PURPLE);
		areaDiGioco.getChildren().add(giocatore);

		//bersaglio blu
		avversarioBlu.setFill(Color.BLUE);
		int nero2X = 100;
		avversarioBlu.setX(nero2X);
		avversarioBlu.setY(0);
		areaDiGioco.getChildren().add(avversarioBlu);

		//bersaglio marrone
		avversarioMarrone.setFill(Color.BROWN);
		avversarioMarrone.setX(0);
		avversarioMarrone.setY(0);
		areaDiGioco.getChildren().add(avversarioMarrone);

		//bersaglio rosso
		avversarioRosso.setFill(Color.RED);
		avversarioRosso.setX(200);
		avversarioRosso.setY(0);
		areaDiGioco.getChildren().add(avversarioRosso);

		//bersaglio giallo
		avversarioGiallo.setFill(Color.YELLOW);
		avversarioGiallo.setX(300);
		avversarioGiallo.setY(0);
		areaDiGioco.getChildren().add(avversarioGiallo);

		//bersaglio verde
		avversarioVerde.setFill(Color.GREEN);
		avversarioVerde.setX(400);
		avversarioVerde.setY(0);
		areaDiGioco.getChildren().add(avversarioVerde);

		//bersaglio viola
		avversarioViola.setFill(Color.VIOLET);
		avversarioViola.setX(500);
		avversarioViola.setY(0);
		areaDiGioco.getChildren().add(avversarioViola);



		Scene scena = new Scene(areaDiGioco);
		scena.getStylesheets().add("it/edu/iisgubbio/giochi/SpaceInvider.css");
		primaryStage.setScene(scena);
		primaryStage.setTitle("Space Invider");
		primaryStage.show();
		lEsitoGioco.setId("Label");
		areaDiGioco.setId("sfondo");

		scena.setOnKeyPressed(e -> movimentoRacchetta (e) );
	}

	private void movimentoRacchetta(KeyEvent e) {




		if (e.getText().equals("a")) {


			giocatore.setX(giocatore.getX() - 18);
		}

		if (e.getText().equals("d")) {

			giocatore.setX(giocatore.getX() + 18);
		}
		if (e.getText().equals("w")) {
			timelinePallina.play();
			cerchio.setCenterX(giocatore.getX() +50);
			cerchio.setCenterY(giocatore.getY() - 8);
			contaPalline=contaPalline+1;
			lEsitoGioco.setText("Palline="+contaPalline);

			if(contaPalline>=10) {
				lEsitoGioco.setText("HAI PERSO, RIPROVA");
			}else {
				lEsitoGioco.setText("Palline="+contaPalline);
			}
		}



	}
	private void sparaProiettile() {
		cerchio.setCenterY(cerchio.getCenterY()-10);
		if (cerchio.getBoundsInParent().intersects(avversarioMarrone.getBoundsInParent())) {

			colpitoMarrone=true;

			avversarioMarrone.setFill(Color.BLACK);
		}
		if(cerchio.getCenterY()<0) {

			timelinePallina.stop();
		}
		if (cerchio.getBoundsInParent().intersects(avversarioBlu.getBoundsInParent())) {
			colpitoBlu=true;
			avversarioBlu.setFill(Color.BLACK);
		}

		if (cerchio.getBoundsInParent().intersects(avversarioRosso.getBoundsInParent())) {
			colpitoRosso=true;
			avversarioRosso.setFill(Color.BLACK);
		}

		if (cerchio.getBoundsInParent().intersects(avversarioGiallo.getBoundsInParent())) {
			colpitoGiallo=true;
			avversarioGiallo.setFill(Color.BLACK);
		}

		if (cerchio.getBoundsInParent().intersects(avversarioVerde.getBoundsInParent())) {
			colpitoVerde=true;
			avversarioVerde.setFill(Color.BLACK);
		}

		if (cerchio.getBoundsInParent().intersects(avversarioViola.getBoundsInParent())) {
			colpitoViola=true;
			avversarioViola.setFill(Color.BLACK);
		}

		if(contaPalline<10 && colpitoMarrone==true && colpitoBlu==true && colpitoRosso==true && colpitoGiallo==true && colpitoVerde==true && colpitoViola==true) {
			lEsitoGioco.setText("COMPLIMENTI, HAI VINTO!!!");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}