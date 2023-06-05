package it.edu.iisgubbio.css;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Colori extends Application  {

	//LABEL
	Label lLarghezza = new Label("larghezza");
	Label lProfondita = new Label("profondità");
	Label lAltezza = new Label("altezza");

	//textfield
	TextField tLarghezza = new TextField("19");
	TextField tProfondita = new TextField("22");
	TextField tAltezza = new TextField("33");

	//BUTTON
	Button bPavimento =new Button ("pavimento");
	Button bPareti =new Button ("pareti");
	Button bCosto =new Button ("costo");

	public void start(Stage finestra) {
		//Griglia
		GridPane griglia = new GridPane();

		griglia.add(bPavimento, 0, 0);
		griglia.add(bPareti, 1, 0);
		griglia.add(bCosto, 2, 0);


		griglia.add(lLarghezza, 0, 1);
		griglia.add(lProfondita, 1, 1);
		griglia.add(lAltezza, 2, 1);
		
		griglia.add(tLarghezza, 0, 2);
		griglia.add(tProfondita, 1, 2);
		griglia.add(tAltezza, 2, 2);
		
		
		Scene scena = new Scene(griglia, 400, 450);

		scena.getStylesheets ().add("it/edu/iisgubbio/css/Coloricss.css");
		
		bPavimento.setId("Identificativo");
		
		
		finestra.setTitle("Allineamento");
		finestra.setScene(scena);
		finestra.show();	
	}




	public static void main(String[] args) {
		launch(args);
	}
}
