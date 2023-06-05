package it.edu.iisgubbio.geometria.Triangolo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Triangolo extends Application {

	//LABEL
	Label lLato1 = new Label("lato1");
	Label lLato2 = new Label("lato2");
	Label lLato3 = new Label("lato3");
	Label lRisulta = new Label("");

	//textfield
	TextField tLato1 = new TextField("");
	TextField tLato2 = new TextField("");
	TextField tLato3 = new TextField("");

	//BUTTON
	Button bTipo =new Button ("Tipo triangolo");

	public void start(Stage finestra) {

		bTipo.setOnAction(e -> tipo());

		//Griglia
		GridPane griglia = new GridPane();

		griglia.add(lLato1, 0, 0);
		griglia.add(lLato2, 0, 1);
		griglia.add(lLato3, 0, 2);

		griglia.add(lRisulta, 0, 4,1,4);

		griglia.add(tLato1, 1, 0);
		griglia.add(tLato2, 1, 1);
		griglia.add(tLato3, 1, 2);

		griglia.add(bTipo, 0, 3,3,1);
		bTipo.setMaxWidth(200);

		Scene scena = new Scene(griglia, 400, 450);

		finestra.setTitle("Triangolo");
		finestra.setScene(scena);
		finestra.show();



	}
	private void tipo() {

		String elabora="s";
		double lato1,lato2,lato3;
		lato1 = Double.parseDouble(tLato1.getText());
		lato2 = Double.parseDouble(tLato2.getText());
		lato3 = Double.parseDouble(tLato3.getText());

		if(lato3>=(lato1+lato2)) {
			elabora="n";
			lRisulta.setText("non è un triangolo");
		}
		if (elabora=="s") {
			if((lato1==lato2) && (lato2==lato3)) {
				lRisulta.setText("è equilatero");
			} 
			else {
				if((lato1==lato2) || (lato1==lato3)) {
					lRisulta.setText("è isoscele");
				}
				else {
					lRisulta.setText("è scaleno");
				}
			}
		}


	}

	public static void main(String[] args) {
		launch(args);
	}
}