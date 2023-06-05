package it.edu.iisgubbio.numeri.Primo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Primo  extends Application {

	//label
	Label lNumero = new Label(" Numero");
	Label lRisultato = new Label("");

	// TextField
	TextField tNumero = new TextField(" ");

	//button
	Button bDividi =new Button ("DIVISORI");


	public void start(Stage finestra) {

		bDividi.setOnAction(e -> primo());

		// griglia
		GridPane griglia = new GridPane();
		griglia.add (lNumero, 0, 0);
		griglia.add(lRisultato, 0, 2);
		griglia.add(tNumero, 1, 0);
		griglia.add(bDividi, 0, 1);

		Scene scena = new Scene(griglia, 400, 450);
		scena.getStylesheets ().add("it/edu/iisgubbio/numeri/Primo/Primo.css");
		
		tNumero.setId("Identificativo");
		tNumero.setId("Identificativo");
		tNumero.setId("Identificativo");
		
		finestra.setTitle("Divisori");
		finestra.setScene(scena);
		finestra.show();
		

	}
	private void primo() {
		int n=0;
		n=Integer.parseInt(tNumero.getText());
		boolean primo=true ;
		for (int s=2; s<n; s++) {
			if (n%s==0) {
				primo=false;	

			}		

		}
		if(primo==false) {
			lRisultato.setText(" non è primo");

		}else {
			if(primo==true);
			lRisultato.setText(" è primo");
		}

	}
	public static void main(String[] args) {
		launch(args);
	}

}

