package it.edu.iisgubbio.stringhe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Stringhe1 extends Application {

	Label lRisultato =new Label("");

	TextField tNumeri =new TextField("");

	Button bParole=new Button("parole");


	public void start(Stage finestra) throws Exception {

		GridPane griglia = new GridPane();
		griglia.add(lRisultato, 0, 2);
		griglia.add(tNumeri, 0, 0);
		griglia.add(bParole, 0, 1);

		Scene scene = new Scene(griglia);
		finestra.setTitle("STRINGHE");
		finestra.setScene(scene);
		finestra.show();

		bParole.setMaxWidth(200);
		
		bParole.setOnAction(e -> contaParole());
	}
	private void contaParole() {
		String parole= tNumeri.getText();
		String nomi [] = parole.split(" ");
		lRisultato.setText(""+nomi.length);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
