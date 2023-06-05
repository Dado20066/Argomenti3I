package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Vettore extends Application {


	TextField tNumero = new TextField();
	TextField tTempo = new TextField();
	TextField tCoach = new TextField();
	TextField tRisultati = new TextField();
	int tempi[];
	int pos;



	public void start(Stage finestra) {

		GridPane griglia = new GridPane();
		griglia.add(tNumero, 0,0);
		griglia.add(tTempo, 0,1);
		griglia.add(tCoach, 0,2);
		griglia.add(tRisultati, 0,3);

		tNumero.setOnAction(e-> alloca ());
		tTempo.setOnAction(e-> inserisciTempo ());
		tCoach.setOnAction(e-> contaPessimi ());


		Scene scene = new Scene(griglia);
		finestra.setTitle("Tempi");
		finestra.setScene(scene);
		finestra.show();
	}

	private void alloca() {
		tempi = new int[Integer.parseInt(tNumero.getText())];
		pos = 0;
	}

	private void inserisciTempo() {
		if(pos < tempi.length) {
			tempi[pos++]=Integer.parseInt(tTempo.getText());
			tTempo.setText("");
		}
	}

	private void contaPessimi() {
		int indice, contatore;
		int coach = Integer.parseInt(tCoach.getText());
		for(contatore = indice = 0; indice < tempi.length; indice++) {
			if(tempi[indice] > coach) {
				contatore++;
			}
		}
		tRisultati.setText("" + contatore);
	}
	public static void main(String[] args) {
		launch(args);
	}
}