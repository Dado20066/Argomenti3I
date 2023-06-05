package it.edu.iisgubbio.parole;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Spelling extends Application{

Label lRisultato =new Label("");

TextField tParola =new TextField("");

Button bSpelling =new Button("Spelling");



	public void start(Stage finestra) {
		GridPane griglia = new GridPane();

		griglia.add(tParola,0, 0);
		
		griglia.add(bSpelling,0, 1);
		
		griglia.add(lRisultato,0, 2);
		
		bSpelling.setMaxWidth(400);
		bSpelling.setOnAction(e -> spelling() );

		Scene scena = new Scene(griglia);
		finestra.setTitle("Lettere");
		finestra.setScene(scena);
		finestra.show();
	}

	public void spelling() {

		String risultato = "";
		String s = tParola.getText() ;
		char lettere []= s.toCharArray();
		for (int i=0; i<lettere.length; i++) {

		}
		for (int i=0; i<lettere.length; i++) {
			risultato =risultato+ "-"+lettere[i];
		}
		lRisultato.setText(risultato);
	}




	public static void main(String[] args) {
		launch(args);
	}
}