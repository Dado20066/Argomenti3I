package it.edu.iisgubbio.geometria.Numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cifre extends Application{

	TextField tInput = new TextField();
	Button bConverti= new Button();
	Label lOutput= new Label();

	public void start(Stage primaryStage) throws Exception {	

		Button bAnagramma= new Button("Anagramma");


		GridPane griglia= new GridPane();
		griglia.add(lOutput, 0, 2);
		griglia.add(tInput, 0, 0);
		griglia.add(bAnagramma, 0, 1);

		bAnagramma.setOnAction(e -> converti());

		Scene scena= new Scene(griglia);
		primaryStage.setTitle("Converti");
		primaryStage.setScene(scena);
		primaryStage.show();

	}

	private void converti() {

		char frase[] = tInput.getText().trim().toCharArray();
		String risposta = "";
		if(frase.length==1) {
			switch (frase[0]) {
			case '1':
				risposta += "uno";
				break;
			case '2':
				risposta += "due";
				break;
			case '3':
				risposta += "tre";
				break;
			case '4':
				risposta += "quattro";
				break;
			case '5':
				risposta += "cinque";
				break;
			case '6':
				risposta += "sei";
				break;
			case '7':
				risposta += "sette";
				break;
			case '8':
				risposta += "otto";
				break;
			case '9':
				risposta += "nove";
				break;
			case '0':
				risposta += "zero";
				break;

			}
		}else {
			if(frase.length==2) {
				switch (frase[0]) {
				case '1':
					risposta += "dieci";
					break;
				case '2':
					risposta += "venti";
					break;
				case '3':
					risposta += "trenta";
					break;
				case '4':
					risposta += "quaranta";
					break;
				case '5':
					risposta += "cinquanta";
					break;
				case '6':
					risposta += "sessanta";
					break;
				case '7':
					risposta += "settanta";
					break;
				case '8':
					risposta += "ottanta";
					break;
				case '9':
					risposta += "novanta";
					break;


				}
				switch (frase[1]) {
				case '1':
					risposta += "uno";
					break;
				case '2':
					risposta += "due";
					break;
				case '3':
					risposta += "tre";
					break;
				case '4':
					risposta += "quattro";
					break;
				case '5':
					risposta += "cinque";
					break;
				case '6':
					risposta += "sei";
					break;
				case '7':
					risposta += "sette";
					break;
				case '8':
					risposta += "otto";
					break;
				case '9':
					risposta += "nove";
					break;
				case '0':
					risposta += "zero";
					break;

				}
			}else {
				switch (frase[0]) {
				case '1':
					risposta += "cento";
					break;
				case '2':
					risposta += "duecento";
					break;
				case '3':
					risposta += "trecento";
					break;
				case '4':
					risposta += "quattrocento";
					break;
				case '5':
					risposta += "cinquecento";
					break;
				case '6':
					risposta += "seicento";
					break;
				case '7':
					risposta += "settecento";
					break;
				case '8':
					risposta += "ottocento";
					break;
				case '9':
					risposta += "novecento";
					break;


				}
				switch (frase[1]) {
				case '1':
					risposta += "dieci";
					break;
				case '2':
					risposta += "venti";
					break;
				case '3':
					risposta += "trenta";
					break;
				case '4':
					risposta += "quaranta";
					break;
				case '5':
					risposta += "cinquanta";
					break;
				case '6':
					risposta += "sessanta";
					break;
				case '7':
					risposta += "settanta";
					break;
				case '8':
					risposta += "ottanta";
					break;
				case '9':
					risposta += "novanta";
					break;


				}
				switch (frase[2]) {
				case '1':
					risposta += "uno";
					break;
				case '2':
					risposta += "due";
					break;
				case '3':
					risposta += "tre";
					break;
				case '4':
					risposta += "quattro";
					break;
				case '5':
					risposta += "cinque";
					break;
				case '6':
					risposta += "sei";
					break;
				case '7':
					risposta += "sette";
					break;
				case '8':
					risposta += "otto";
					break;
				case '9':
					risposta += "nove";
					break;
				case '0':
					risposta += "zero";
					break;

				}
			}


		}

		lOutput.setText("" + risposta);       
	}



	public static void main(String[] args) {
		launch(args);
	}
}