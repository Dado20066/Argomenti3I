package it.edu.iisgubbio.Casuale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Casuale extends Application {

	//label
	Label lPari = new Label("Pari");
	Label lDispari = new Label("Dispari");	

	Label lNumeropari = new Label("");
	Label lNumerodispari = new Label("");	

	Label lSomma = new Label("Somma");
	Label lSomma1 = new Label("Somma");	

	Label lNumerosomma = new Label("");
	Label lNumerosomma1 = new Label("");

	//button
	Button bCalcola =new Button ("Calcola");



	public void start(Stage finestra) {

		bCalcola.setOnAction(e -> Premimi());

		//Griglia
		GridPane griglia = new GridPane();

		griglia.add(lPari, 0, 0);
		griglia.add(lDispari, 1, 0);

		griglia.add(lNumeropari, 0, 1);
		griglia.add(lNumerodispari, 1, 1);

		griglia.add(lSomma, 0, 2);
		griglia.add(lSomma1, 1, 2);

		griglia.add(lNumerosomma, 0, 3);
		griglia.add(lNumerosomma1, 1, 3);

		griglia.add(bCalcola, 0, 4);


		Scene scena = new Scene(griglia);

		finestra.setTitle("Numeri Casuali");
		finestra.setScene(scena);
		finestra.show();


	}

	private void Premimi() {

		String listapari = "";
		String listadispari = "";
		int sommapari = 0;
		int sommadispari = 0;

		for (int i=1; i<=10; i++) {
			int numerocasuale = (int)(Math.random()*100);
			if (numerocasuale%2==0) {
				sommapari+=numerocasuale;
				listapari+=numerocasuale +", ";
				
			}
			else {
				sommadispari+=numerocasuale;
				listadispari+=numerocasuale +", ";
			}
			
		}
		
		lNumerodispari.setText(listadispari);
		lNumeropari.setText(listapari);
		lNumerosomma.setText(""+sommapari);
		lNumerosomma1.setText(""+sommadispari);
	}

	
	public static void main(String[] args) {

		launch(args);
	}
}




