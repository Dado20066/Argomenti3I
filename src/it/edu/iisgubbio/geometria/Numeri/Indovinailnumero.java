package it.edu.iisgubbio.geometria.Numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Indovinailnumero extends Application  {

	//LABEL
	Label lNumero = new Label("Numero:");
	Label lRisulta = new Label("");

	//Int
	int numeroTentativi;

	//textfield
	TextField tNumero = new TextField("");


	//BUTTON
	Button bProva =new Button ("Prova");

	public void start(Stage finestra) {

		bProva.setOnAction(e -> prova());

		//Griglia
		GridPane griglia = new GridPane();

		griglia.add(lNumero, 0, 0);
		griglia.add(lRisulta, 1, 1);
		griglia.add(tNumero, 1, 0);
		griglia.add(bProva, 2, 0);

		Scene scena = new Scene(griglia, 400, 450);

		finestra.setTitle("Indovina il numero");
		finestra.setScene(scena);
		finestra.show();

	}

	int numerocasuale =	(int)(Math.random()*100)+1;

	private void prova() {

		
		int numero;
		numero =Integer.parseInt(tNumero.getText());
		if (numero == numerocasuale) {
			lRisulta.setText("Hai indivinato il numero in "+numeroTentativi+ " tentativi");	
		} 
		else {
			if (numero<numerocasuale) {
				lRisulta.setText("Il numero che hai inserito è minore");
				numeroTentativi+=1;
			} 
			else {
				if (numero>numerocasuale) {
					lRisulta.setText("Il numero che hai inserito è maggiore");
					numeroTentativi+=1;

				}
			}
		}


	}


	public static void main(String[] args) {
		launch(args);
	}
}
