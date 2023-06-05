package it.edu.iisgubbio.numeri.Frazioni;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Frazioni extends Application {

	//label
	Label l = new Label("--------------------------------");


	// TextField
	TextField tNumero1 = new TextField(" ");
	TextField tNumero2 = new TextField(" ");

	//button
	Button bDividi =new Button ("SEMPLIFICA");

	public void start(Stage finestra) {

		bDividi.setOnAction(e -> semplifica());

		// griglia
		GridPane griglia = new GridPane();
		griglia.add (l, 0, 1);
		griglia.add(tNumero1, 0, 0);
		griglia.add(tNumero2, 0, 2);
		griglia.add(bDividi, 1, 0);


		Scene scena = new Scene(griglia, 400, 450);
		scena.getStylesheets ().add("it/edu/iisgubbio/numeri/Frazioni/Frazioni.css");
		tNumero1.setId("Identificativo");
		tNumero2.setId("Identificativo");
		l.setId("Identificativo");
		bDividi.setId("Identificativo");
		finestra.setTitle("Divisori");
		finestra.setScene(scena);
		finestra.show();

	}


	private void semplifica() {
		int n=0;
		int num=Integer.parseInt(tNumero1.getText());
		int den=Integer.parseInt(tNumero2.getText());
		for (n=den; n>0; n--) {
			if (num%n==0) {
				if (den%n==0) {
					num=num/n;
					den=den/n;
					tNumero1.setText(""+num);
					tNumero2.setText(""+den);
				}

			}
		}

	}



	public static void main(String[] args) {
		launch(args);
	}
}
