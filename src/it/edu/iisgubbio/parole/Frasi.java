package it.edu.iisgubbio.parole;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Frasi extends Application {

	Label lFrase = new Label ("frase");
	Label lRisultato = new Label ("");
	TextField tTextField = new TextField("");
	Button bVocali = new Button("vocali");
	Button bMaiuscole = new Button("maiuscole");
	Button bPunto = new Button("punti");
	Button bInterne = new Button("interne");


	public void start(Stage finestra) {

		GridPane principale = new GridPane();

		principale.add(lFrase,   					0, 0, 2, 1);
		principale.add(tTextField,   				0, 1, 2, 1);
		principale.add(bVocali,   					0, 2);
		principale.add(bMaiuscole,   				1, 2);
		principale.add(bPunto,   					0, 3);
		principale.add(bInterne, 					1, 3);
		principale.add(lRisultato,   				0, 4, 2, 1);
		bVocali.setOnAction(e -> vocali());
		bMaiuscole.setOnAction(e -> maiuscole());
		bPunto.setOnAction(e -> punto());
		bInterne.setOnAction(e -> interne());

		tTextField.setMaxSize(125, 25);
		bVocali.setMaxSize(75, 25);
		bMaiuscole.setMaxSize(75, 25);
		bPunto.setMaxSize(75, 25);
		bInterne.setMaxSize(75, 25);
		principale.setPadding(new Insets(10, 10, 10, 10));
		principale.setHgap(5); 
		principale.setVgap(10);


		Scene scena = new Scene(principale);

		finestra.setTitle("Lettere");
		finestra.setScene(scena);
		finestra.show();
	}

	private void interne() {
	String testo = tTextField.getText().trim();
	char frase []=testo.toCharArray();
	
		
	}

	private void vocali() {
		String testo=tTextField.getText().toLowerCase().trim();
		char frase[] = testo.toCharArray();
		int Voc=0;
		for(int i=0; i<frase.length ;i++) {
			if(frase[i]=='a' || frase[i]=='e' || frase[i]=='i'||frase[i]=='o'||frase[i]=='u') {
				Voc+=1;
			}
			lRisultato.setText(Voc + "");
		}
	}

	private void maiuscole() {
		String testo=tTextField.getText().trim();
		char frase[] = testo.toCharArray();
		int maiuscole=0;
		for(int i=0; i<frase.length ;i++) {
			if(frase[i]>='A' && frase[i]<='Z') {
				//if(Character.isUpperCase(frase[i]))
				//if(frase[i]>='A' || frase[i]=='B' || frase[i]=='C' || frase[i]=='D' || frase[i]=='E' || frase[i]=='F' || frase[i]=='G' || frase[i]=='H' || frase[i]=='I' || frase[i]=='J' || frase[i]=='K' || frase[i]=='L' || frase[i]=='M' || frase[i]=='N' || frase[i]=='O' || frase[i]=='P' || frase[i]=='Q' || frase[i]=='R' || frase[i]=='S' || frase[i]=='T' || frase[i]=='U' || frase[i]=='V' || frase[i]=='W' || frase[i]=='X' || frase[i]=='Y' || frase[i]=='Z') {
				maiuscole+=1;
			}

		}
		lRisultato.setText(maiuscole + "");
	}

	private void punto() {
		String testo=tTextField.getText().trim();
		char frase[] = testo.toCharArray();
		boolean vaBene = true;
		if(Character.isLowerCase(frase[0])) {
			vaBene = false;
		}
		for(int i=0; i<frase.length-1 ;i++) {
			if(frase[i] == '.') {
				if(frase[i+2]>='a' && frase[i+2]<='z') {
					vaBene = false;
				}
			}
		}
		if(vaBene) {
			lRisultato.setText("Bene");
		}else {
			lRisultato.setText("Male");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}