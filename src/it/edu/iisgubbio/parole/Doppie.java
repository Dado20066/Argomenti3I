package it.edu.iisgubbio.parole;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Doppie extends Application {
	//label
	Label lFrase =new Label("frase");
	Label lDoppie =new Label ("doppie");
	Label lRisultato =new Label(" ");

	//textfield
	TextField tFrase =new TextField("");

	//button
	Button bConta =new Button("conta");


	public void start(Stage finestra) {

		GridPane griglia = new GridPane();
		griglia.add(lFrase, 0, 0);
		griglia.add(lDoppie, 0, 2);
		griglia.add(lRisultato, 1, 2);

		griglia.add(tFrase, 1, 0);

		griglia.add(bConta, 1, 1);

		bConta.setMaxWidth(400);

		bConta.setOnAction(e -> contadoppie());


		Scene scena = new Scene(griglia);
		finestra.setTitle("Conversione");
		finestra.setScene(scena);
		finestra.show();
		,

	}
	private void contadoppie() {
		char vettore[] = tFrase.getText().trim().toLowerCase().toCharArray();
		int doppie =0;
		for(int i=0; i<vettore.length-1; i++) {
			if (vettore[i]==vettore[i+1]) {
				doppie++;

			}
			lRisultato.setText(""+doppie);
		}

	}
	public static void main(String[] args) {
		launch(args);
	}

}
