package it.edu.iisgubbio.Cicli;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tabellina extends Application {
	
	//LABEL
		Label lTipo1 = new Label("input uno:");
		Label lRisposta = new Label("se serve qui comparira la risposta");

		//textfield
		TextField tInput1 = new TextField("");

		//BUTTON
		Button bPremimi =new Button ("PREMIMI");

		public void start(Stage finestra) {

			bPremimi.setOnAction(e -> Premimi());

			//Griglia
			GridPane griglia = new GridPane();

			griglia.add(lTipo1, 0, 0);
			griglia.add(lRisposta, 0, 1, 2, 1);

			griglia.add(tInput1, 1, 0);

			griglia.add(bPremimi, 2, 0, 1, 2);
			bPremimi.setMaxHeight(200);

			Scene scena = new Scene(griglia);
			scena.getStylesheets ().add("it/edu/iisgubbio/Cicli/Tabelline.css");
			finestra.setTitle("Da completare");
			finestra.setScene(scena);
			finestra.show();

		}
		private void Premimi() {

			int n;
			n= Integer.parseInt(tInput1.getText());
			String testo ="";
			for(int s=1; s<=10;s++) {
				if (s>1) {
					testo+="-";
				}
				testo+=(n*s);

			}
			lRisposta.setText(testo);
		}




		public static void main(String[] args) {

			launch(args);
		}
	}
