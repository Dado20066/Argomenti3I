package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MescolaVettori extends Application {

	Button bPari = new Button ("Pari");
	Button bBubble = new Button ("Bubble");
	Button bB3 = new Button ("");
	Button bB4 = new Button ("");

	Label lInput = new Label ("input");
	Label lOutput= new Label ("output");

	TextField tInput = new TextField ();
	TextField tOutput = new TextField ();

	public void start(Stage primaryStage) throws Exception {

		GridPane griglia = new GridPane ();

		griglia.add(bPari,0,1);
		griglia.add(bBubble,1,1);
		griglia.add(bB3,2,1);
		griglia.add(bB4,3,1);

		griglia.add(lInput,0,0);
		griglia.add(lOutput,0,2);

		griglia.add(tInput,1,0,4,1);
		griglia.add(tOutput,1,2,4,1);


		Scene scene = new Scene(griglia);

		primaryStage.setTitle("Ricerche Vettori");
		primaryStage.setScene(scene);
		primaryStage.show();

		bPari.setOnAction(e -> pari() );
		bBubble.setOnAction(e -> bubble() );
		bB3.setOnAction(e -> B3() );
		bB4.setOnAction(e -> B4() );

	}
	int[] daTestoAVettore(String t) {

		String n = tInput.getText();
		String numeri[] = n.split(" ");

		int listaNumeri[] = new int[numeri.length];

		for (int i = 0; i < numeri.length; i = i + 1) {
			listaNumeri[i] = Integer.parseInt(numeri[i]);
		}
		return listaNumeri;
	}

	private void pari() {
		//leggo i dati
		String input=tInput.getText();
		int numeri []= daTestoAVettore(input);
		//elaborazione
		for (int i=0; i<numeri.length; i++) {
			if (numeri[i]%2!=0) {
				numeri[i]=0;
			} 		
		}
		//preparo l'output
		String pari="";
		for (int i=0; i<numeri.length; i++) {
			pari = pari+" "+numeri[i];
		}
		tOutput.setText(pari);
	}



	private void B4() {

	}
	private void B3() {

	}
	private void bubble() {
		//leggo i dati
		String input=tInput.getText();
		int numeri []= daTestoAVettore(input);
		//elaborazione
		int appoggio;
		for(int superficie=0;superficie<=(numeri.length-1)-1;superficie=superficie+1){
			for(int posizione=(numeri.length-1)-1;posizione>=superficie;posizione--){
				if(numeri[posizione]>numeri[posizione+1]){
					appoggio=numeri[posizione];
					numeri[posizione]=numeri[posizione+1];
					numeri[posizione+1]=appoggio;
				}
			}
		}
}
	


public static void main(String[] args) {
	launch(args);
}
}