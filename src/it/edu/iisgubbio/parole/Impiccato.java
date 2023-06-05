package it.edu.iisgubbio.parole;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Impiccato extends Application  {

	//button
	Button bIndovina =new Button ("Indovina");
	Button bLettera =new Button ("Lettera");
	//label
	Label lRisultato = new Label("");
	//TextField
	TextField tIndovina = new TextField("");
	TextField tLettera = new TextField("");

	public void start(Stage finestra) {
		//Griglia
		GridPane griglia = new GridPane();
		griglia.add(tIndovina,0, 0);
		griglia.add(tLettera, 0, 1);

		griglia.add(bIndovina, 1, 0);
		griglia.add(bLettera, 1, 1);

		griglia.add(lRisultato,0, 2);

		bLettera.setMaxWidth(400);

		Scene scena = new Scene(griglia);

		finestra.setTitle("Impiccato");
		scena.getStylesheets().add("it/edu/iisgubbio/parole/Impiccato.css");
		finestra.setScene(scena);
		finestra.show();
		
		bIndovina.setId("Bottone");
		bLettera.setId("Bottone");

		bIndovina.setOnAction(e-> indovina());
		bLettera.setOnAction(e-> lettera());
	}

	private void indovina() {

		String testo = tIndovina.getText();
		char frase[]=testo.toCharArray();
		for(int i=1;i<frase.length-1;i++) {
			frase[i]='-';
		}
		String trattini = new String(frase);
		tIndovina.setText(trattini);
	}

	private void lettera() {
           
	}


	public static void main(String[] args) {

		launch(args);
	}
}