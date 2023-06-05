package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Vettori3 extends Application{

	Button pCalcola = new Button(); 
	TextField caselle [] = new TextField [20];

	public void start(Stage finestra) {

		GridPane principale = new GridPane();

		for (int i=0 ; i<caselle.length ; i=i+1) {
			caselle[i] = new TextField();
			principale.add(caselle[i],0,i);
		}

		pCalcola.setText("SCORRI");
		pCalcola.setOnAction(e -> calcola());

		principale.add(pCalcola,0,caselle.length);

		principale.setId("griglia");
		Scene scena = new Scene(principale);

		finestra.setTitle("Caselle");
		finestra.setScene(scena);
		finestra.show();
	}

	public void calcola(){
		for(int x=0;x<caselle.length-1;x=x+1) {
			String testo=caselle[x+1].getText();
			caselle[x].setText(testo);
		}
		caselle[caselle.length-1].setText("");
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}