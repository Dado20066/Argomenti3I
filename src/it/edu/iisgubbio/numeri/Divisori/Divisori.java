package it.edu.iisgubbio.numeri.Divisori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Divisori extends Application {

	//label
	Label lNumero  = new Label("Numero");
	Label lRisultato = new Label("");

	// TextField
	TextField tNumero = new TextField(" ");

	//button
	Button bDividi =new Button ("DIVISORI");


	public void start(Stage finestra) {

		bDividi.setOnAction(e -> dividi());

		// griglia
		GridPane griglia = new GridPane();
		griglia.add(lNumero, 0, 0);
		griglia.add(lRisultato, 0, 2);
		griglia.add(tNumero, 1, 0);
		griglia.add(bDividi, 0, 1);

		Scene scena = new Scene(griglia, 400, 450);

		finestra.setTitle("Divisori");
		finestra.setScene(scena);
		finestra.show();

	}



	private void dividi() {
		int n, conto;
		String numeri;
		n = Integer.parseInt(tNumero.getText());
		numeri = "1";
		for(conto = 2; conto < n; conto++) {
			if(n%conto == 0) {
				numeri += ", " + conto;
			}
		}
		numeri += ", " + n;
		lRisultato.setText(numeri);
	}


	public static void main(String[] args) {
		launch(args);
	}
}
