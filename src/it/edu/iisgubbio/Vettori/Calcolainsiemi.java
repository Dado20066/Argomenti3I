package it.edu.iisgubbio.Vettori;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calcolainsiemi extends Application{

	TextField numero = new TextField("");
	TextField sNumero = new TextField("");

	Button bVai = new Button ("U");
	Button Vai = new Button ("Ω");
	Button bMeno = new Button ("-");

	Label lRis = new Label ();

	String vetA[];
	String vetB[];
	String vetRisultato[];

	@Override
	public void start(Stage finestra) throws Exception {

		GridPane griglia = new GridPane();

		griglia.add(numero, 0, 0,3,1);
		griglia.add(sNumero, 0,1,3,1);
		griglia.add(bVai, 0, 2);
		griglia.add(Vai, 1,2);
		griglia.add(bMeno, 2, 2);
		griglia.add(lRis, 0, 3);

		Scene scena = new Scene(griglia);
		finestra.setTitle("codifica");
		finestra.setScene(scena);
		finestra.show();	

		bVai.setOnAction(e -> unione());
		Vai.setOnAction(e->converti());
		bMeno.setOnAction(e->differenza());
	}

	private void differenza() {

		String[] numero1 = numero.getText().split(" ");
		String[] numero2 = sNumero.getText().split(" ");
		String risultato="";
		Boolean trovato =false;

		for(int i =0;i<numero1.length; i++) {
			trovato=false;
			int n1=Integer.parseInt(numero1[i]);

			for(int j =0;j<numero2.length; j++) {
				int n2=Integer.parseInt(numero2[j]);
				if (n1==n2) {
					trovato=true;

				}
			}

			if(trovato==false) {
				risultato+=n1+" ";
			}
		}
		lRis.setText(risultato); 

	}

	private void converti() {
		String[] numero1 = numero.getText().split(" ");
		String[] numero2 = sNumero.getText().split(" ");
		String risultato="";

		for(int i =0;i<numero1.length; i++) {

			int n1=Integer.parseInt(numero1[i]);

			for(int j =0;j<numero2.length; j++) {
				int n2=Integer.parseInt(numero2[j]);
				if (n1==n2) {
					risultato+=n1+" ";

				}
			}
		}

		lRis.setText(risultato); 

	}

	private void unione() {
		String[] numeri1 = numero.getText().split(" ");
		String[] numeri2 = sNumero.getText().split(" ");
		String[] numeri3 = new String[numeri1.length+numeri2.length];

		for(int g=0;g<numeri1.length;g++) {
			numeri3[g]=numeri1[g];
		}
		for(int g=0;g<numeri2.length;g++) {
			numeri3[g+numeri1.length]=numeri2[g];
		}


		for(int h=0; h<numeri3.length;h++) {
			for(int j=h+1;j<numeri3.length;j++) {

				
				if(numeri3[h].equals(numeri3[j])) {
					numeri3[h]="-1";
				}
			}
		}
		
		String testo = "";
		for(int g=0;g<numeri3.length;g++) {
			if(numeri3[g]!="-1") {
				testo+=" "+numeri3[g];
			}
		}
		lRis.setText(testo);

	}

	public static void main(String[] args) {
		launch(args);
	}

}