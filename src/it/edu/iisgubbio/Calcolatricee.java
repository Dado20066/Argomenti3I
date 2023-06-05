package it.edu.iisgubbio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calcolatricee extends Application   {
	//label
	Label lNum1= new Label ("Numero 1");
	Label lNum2= new Label ("Numero 2");
	Label lRisultato= new Label ("Risutato");
	Label lRisulta= new Label ("");
	
	//text
	TextField t1 =new TextField ();
	TextField t2 =new TextField ();
	//button
	
	Button bSomma =new Button ("+");
	Button bSottrazione =new Button ("-");
	Button bMoltiplicazione =new Button ("*");
	Button bDivisone =new Button ("/");
	
	
	public void start(Stage finestra) {

		bSomma.setOnAction(e -> somma());
		bSottrazione.setOnAction(e -> sottrazione());
		bMoltiplicazione.setOnAction(e -> moltiplica());
		bDivisone.setOnAction(e -> dividi());

		GridPane griglia = new GridPane();

		// griglia 

		griglia.add(lNum1, 0, 0);
		griglia.add(lNum2, 0, 1);

		griglia.add(t1, 1, 0);
		griglia.add(t2, 1, 1);

		griglia.add(bSomma, 2,0);
		griglia.add(bSottrazione, 2,1);
		griglia.add(bMoltiplicazione, 2, 2);
		griglia.add(bDivisone, 2,3);

		griglia.add(lRisultato, 0, 3);
		griglia.add(lRisulta, 1, 3);

		Scene scena = new Scene(griglia, 400, 450);

		finestra.setTitle("Calcolatrice");
		finestra.setScene(scena);
		finestra.show();
		}

		private void dividi() {

		int dividi1, dividi2, dividi;
		dividi1 = Integer.parseInt(t1.getText());
		dividi2 = Integer.parseInt(t2.getText());
		dividi = dividi1 / dividi2;
		  lRisulta.setText(""+"" + dividi);
		}


		private void moltiplica() {

		double numero1, numero2, prodotto;
		  numero1 = Double.parseDouble(t1.getText());
		  numero2 = Double.parseDouble(t2.getText());
		  prodotto = numero1 * numero2;
		  lRisulta.setText(" "+"" + prodotto);

		}

		private void sottrazione() {

		int sottrazione1, sottrazione2, sottrazione;
		  sottrazione1 = Integer.parseInt(t1.getText());
		  sottrazione2 = Integer.parseInt(t2.getText());
		  sottrazione = sottrazione1 - sottrazione2;
		  lRisulta.setText(" "+"" + sottrazione);

		}

		private void somma() {

		int somma1, somma2, somma;
		  somma1 = Integer.parseInt(t1.getText());
		  somma2 = Integer.parseInt(t2.getText());
		  somma = somma1 + somma2;
		  lRisulta.setText(" " + "" + somma);

		}

		public static void main(String[] args) {
		launch(args);
		}
		}
