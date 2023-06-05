package it.edu.iisgubbio.geometria.Numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Giocosomme extends Application {

	//label
	Label lPiu =new Label ("+");
	Label lUguale =new Label ("=");
	Label lPunti =new Label ("punti ");


	// TextField
	TextField tNumero1 = new TextField(" ");
	TextField tNumero2 = new TextField(" ");
	TextField tRisultato = new TextField(" ");

	public void start(Stage finestra) {
		tRisultato.setOnAction(e -> Calcola());

		// griglia
		GridPane griglia = new GridPane();
		griglia.add(tNumero1, 0, 0);
		griglia.add(lPiu, 1, 0);
		griglia.add(tNumero2, 2, 0);
		griglia.add(lUguale, 3, 0);
		griglia.add(tRisultato, 4, 0);
		griglia.add(lPunti, 0, 1);

		Scene scena = new Scene(griglia, 400, 450);
		finestra.setTitle("Gioco delle somme");
		finestra.setScene(scena);
		finestra.show();

	}
	int numerocasuale =	(int)(Math.random()*100)+10;


	private void Calcola() {
		int somma1, somma2, somma;
		  somma1 = Integer.parseInt(tNumero1.getText());
		  somma2 = Integer.parseInt(tNumero2.getText());
		  somma = somma1 + somma2;
		 tRisultato.setText(" " + "" + somma);


	} 



	public static void main(String[] args) {
		launch(args);
	}
}
