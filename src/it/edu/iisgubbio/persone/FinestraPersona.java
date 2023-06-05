package it.edu.iisgubbio.persone;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FinestraPersona extends Application{
	
	ListView<String> lista = new ListView<>();
	
	Label nome = new Label ("nome");
	Label cognome = new Label ("cognome");
	Label annon = new Label ("annoNascita");
	Label classe = new Label ("classe");
	Label annois = new Label ("annoIscrizione");

	TextField tnome = new TextField();
	TextField tcognome = new TextField();
	TextField tanno = new TextField();
	TextField tclasse = new TextField();
	TextField tannois = new TextField();
	
	Button pers = new Button("persona");
	Button stud = new Button("studente");
	
	@Override
	public void start(Stage finestra) throws Exception {
		
		GridPane pannello = new GridPane();

		pannello.add(lista,1,6);
		
		pannello.add(nome, 1, 0);
		pannello.add(cognome, 1, 1);
		pannello.add(annon, 1, 2);
		pannello.add(classe, 1, 3);
		pannello.add(annois, 1, 4);
		
		pannello.add(tnome, 2, 0);
		pannello.add(tcognome, 2, 1);
		pannello.add(tanno, 2, 2);
		pannello.add(tclasse, 2, 3);
		pannello.add(tannois, 2, 4);
		
		pannello.add(pers, 3, 2);
		pannello.add(stud, 3, 4);
		
		//pers.setOnAction(e->persona());
		//stud.setOnAction(e->studente());

		Scene scena = new Scene(pannello);
		finestra.setScene(scena);
		finestra.setTitle("Gente");
		finestra.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}