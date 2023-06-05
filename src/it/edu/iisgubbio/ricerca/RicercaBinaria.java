package it.edu.iisgubbio.ricerca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RicercaBinaria extends Application {

	Label lNumero =new Label("numeri");
	Label lCerca =new Label("cerca");
	Label lRisultato = new Label ("");

	TextField tNumero = new TextField("");
	TextField tCerca = new TextField("");

	Button bCerca = new Button("carca");


	public void start(Stage finestra) throws Exception {

		GridPane griglia =new GridPane();

		griglia.add(lNumero, 0, 0);
		griglia.add(lCerca, 0, 1);
		griglia.add(lRisultato, 1, 2, 2, 1);

		griglia.add(tNumero, 1, 0, 2, 1);
		griglia.add(tCerca, 1, 1);

		griglia.add(bCerca, 2, 1);

		bCerca.setOnAction(e -> cerca());

		Scene scena = new Scene(griglia);
		finestra.setTitle("ricercabinaria");
		finestra.setScene(scena);
		finestra.show();

	}
	private void cerca() {
		String pezzi[] = tNumero.getText().split(" ");
		int numeri[] = new int [pezzi.length];
		for(int i=0; i<pezzi.length; i++) {
			numeri[i] = Integer.parseInt(pezzi [i]);
		}

		//ricercabinaria
		int numeroCercato =Integer.parseInt(tCerca.getText());
		boolean trovato = false;
		int inf = 0; //primo elemento da prendere in considerazione
		int sup = numeri.length-1;  //indice dell'ultimo elemento 
		int metà;
		while (inf<=sup) {
			metà = (inf+sup) /2;
			if(numeroCercato == numeri [metà]) {
				trovato = true;
			} else {
				if(numeroCercato < numeri[metà]) {
					sup = metà-1;
				}else {
					inf =metà+1;
				}
			}		
		}
		if(trovato) {
			lRisultato.setText("Il numero è Presente");
		}else {
			lRisultato.setText("Il numero non è presente");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
