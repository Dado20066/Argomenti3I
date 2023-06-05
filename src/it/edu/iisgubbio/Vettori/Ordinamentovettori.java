package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ordinamentovettori extends Application {

	TextField tFrase =new TextField("");

	Button bAnagramma =new Button("anagramma");

	Label lRisultato =new Label("");


	public void start(Stage finestra) {

		GridPane griglia =new GridPane();

		griglia.add(tFrase, 0, 0);

		griglia.add(bAnagramma, 0, 1);

		griglia.add(lRisultato, 0, 2);

		bAnagramma.setMaxWidth(400);

		bAnagramma.setOnAction(e -> anagramma());


		Scene scena = new Scene(griglia);
		finestra.setTitle("Anagramma");
		finestra.setScene(scena);
		finestra.show();
	}

	private void anagramma() {	        
		String scrivi = tFrase.getText() ;
		char lettere[]= scrivi.toCharArray();
		int estratto;
		char appoggio = ' ';
		for (int i=0; i<lettere.length; i++) {
			estratto=(int) (Math.random() * (scrivi.length()));
			appoggio =lettere[i];
			lettere[i] = lettere[estratto];
			lettere[estratto]=appoggio;
		}
		String testo = new String(lettere);
		lRisultato.setText(testo);
	}


	public static void main(String[] args) {
		launch(args);
	}
}