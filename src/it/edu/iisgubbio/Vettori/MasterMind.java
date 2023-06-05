package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MasterMind extends Application {

	ListView<String> lista = new ListView<>();

	//Label
	Label lLettere = new Label("");
	//Button
	Button bProva =new Button("Prova");
	//TextField
	TextField tLettere = new TextField("");

	String combinazione;
	String esito="";
	char lettereCasuali[]=new char [4];

	public void start(Stage finestra) {
		//Griglia
		GridPane griglia = new GridPane();
		griglia.add(lista, 0,0,2,1);

		griglia.add(lLettere,0,1);

		griglia.add(tLettere, 1,1);

		griglia.add(bProva, 1,2);


		bProva.setOnAction(e -> provalettere());

		Scene scena = new Scene(griglia);

		finestra.setTitle("Lettere");
		finestra.setScene(scena);
		finestra.show();

		for(int i=0; i<4; i++) {
			int numeroCasuale =(int)(Math.random()*4);
			if(numeroCasuale==0) {
				lettereCasuali[i]='a';
			}
			if(numeroCasuale==1) {
				lettereCasuali[i]='b';
			}
			if(numeroCasuale==2) {
				lettereCasuali[i]='c';
			}
			if(numeroCasuale==3) {
				lettereCasuali[i]='d';
			}
		}
		combinazione=new String (lettereCasuali);
		System.out.println(combinazione);

	}

	private void provalettere() {
		String testo= tLettere.getText();
		char testoar[]=testo.toCharArray();
		String lettereX="";
		esito="";
		int contaX=0;
		for(int i=0; i<testoar.length;i++) {
			if(testoar[i]==lettereCasuali[i]) {
				esito+="x";
				lettereX=String.valueOf(testoar[i]);
				contaX+=1;		
			} /*else {
				for (int j=0; j<lettereCasuali.length;j++) {
					if(testoar[i]==lettereCasuali[j] && i!=j) {
						esito+="O";		
					}
				}
			}*/
		}
		for(int i=0; i<testoar.length;i++) {
			String lettera=String.valueOf(testoar[i]); 
			if(lettereX.indexOf(lettera)==-1) {
				for (int j=0; j<lettereCasuali.length;j++) {
					if(testoar[i]==lettereCasuali[j] && i!=j) {
						esito+="O";		
					}
				}
			}
		}
		String paroladaindovinare=lettereCasuali.toString();
		String risultato= " ";
		if(contaX==4) {
			risultato=testo+"! vinto"; 
		} else {
			risultato=testo+"!"+esito;
		}
		lista.getItems().add(risultato);
	}


	public static void main(String[] args) {
		launch(args);
	}  
}