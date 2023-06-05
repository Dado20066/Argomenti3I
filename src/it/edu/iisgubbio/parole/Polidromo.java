package it.edu.iisgubbio.parole;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Polidromo extends Application {

	//Label
	Label lRisultato = new Label("www");

	//TextField
	TextField tParola = new TextField("");

	//Button
	Button bEsegui = new Button("Esegui Polidromo");


	public void start(Stage finestra) {

		GridPane griglia =new GridPane();

		griglia.add(tParola, 0, 0);

		griglia.add(bEsegui, 0, 1);

		griglia.add(lRisultato, 0, 2);
		
		bEsegui.setMaxWidth(400);

		bEsegui.setOnAction(e -> esegui());

		Scene scena = new Scene(griglia);
		finestra.setTitle("POLIDROMO");
		finestra.setScene(scena);
		finestra.show();


	}
	private void esegui() {
		 String testo= tParola.getText();
		 char frase [] = testo.toCharArray();
		 for(int i=0; i<frase.length; i++) {
			 if()
		 }
		 lRisultato.setText(maiuscole + "");
		 
	}
	public static void main(String[] args) {
		launch(args);
	}
}
