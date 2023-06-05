package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Codificachiave extends Application{

	//TextField
	TextField tParola = new TextField();
	TextField tChiave = new TextField("qwertyuiopasdfghjklzxcvbnm");
	//BUtton
	Button bCodifica = new Button("Codifica");
	Button bDecodifica = new Button("Decodifica");
	Button bControlliErrori = new Button("Controlli Errori");
	//Label
	Label lFinale = new Label();
	Label l1 = new Label("msg");
	Label l2 = new Label("chiave");

	public void start(Stage primaryStage) {

		GridPane griglia = new GridPane();

		griglia.add(l1, 0, 0);
		griglia.add(tParola, 1, 0);
		griglia.add(l2, 0, 1);
		griglia.add(tChiave, 1, 1);
		griglia.add(bCodifica, 1, 2);
		griglia.add(bDecodifica, 1, 3);
		griglia.add(bControlliErrori, 0, 7);
		griglia.add(lFinale, 1, 4);

		Scene scena = new Scene(griglia);
		primaryStage.setTitle("codifica");

		primaryStage.setScene(scena);

		primaryStage.show();

		bDecodifica.setMaxWidth(400);
		bCodifica.setMaxWidth(400);

		bDecodifica.setOnAction(e -> eseguidecodifica());
		bCodifica.setOnAction(e -> eseguicodifica());
		bControlliErrori.setOnAction(e -> controllierrori());
	}


	private void eseguicodifica(){

		String parola=tParola.getText();
		char charParola[]=parola.toCharArray();

		String chiave=tChiave.getText();
		char charChiave[]=chiave.trim().toCharArray();

		for(int i=0; i<parola.length();i++) {
			charParola[i]= charChiave[charParola[i]-97];
		}

		String ris = new String (charParola);
		lFinale.setText(ris);
		System.out.println(parola.length());

	}
	private void controllierrori() {
		String chiave=tChiave.getText();
		char Chiave[]=chiave.trim().toCharArray();

		if(chiave.length()>26) {		
			lFinale.setText("TROPPE LETTERE!!!");
		}
		if(chiave.length()<26) {		
			lFinale.setText("POCHE LETTERE!!!");

		}
		for(int i=0; i<Chiave.length; i++) {
			if(Chiave[i]<'a' || Chiave[i]>'z') {
				lFinale.setText("Caratteri non ammessi!!!");
			}
			for(int l=0;l<Chiave.length; l++) {
				if(Chiave[i]==Chiave[l] && i!=l) {
					lFinale.setText("Caratteri Ripetuti");
				}
			}
		}
	}

	private void eseguidecodifica() {

	}

	public static void main(String[] args) {
		launch(args);
	}

}

