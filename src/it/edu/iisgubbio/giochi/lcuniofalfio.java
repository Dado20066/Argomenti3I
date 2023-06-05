package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class lcuniofalfio extends Application{

	TextField fMesi;
	Label lNumeroConigli;


	public void start(Stage primaryStage){

		Label lMesi = new Label("Mesi");
		fMesi = new TextField ();
		lNumeroConigli = new Label();
		Button bIterativo = new Button ("Fibonacci Iterativo");
		Button bRicorsivo = new Button("Fibonacci Ricorsivo");

		GridPane griglia = new GridPane();
		griglia.add(lMesi, 0, 0);
		griglia.add(fMesi, 1, 0);
		griglia.add(bIterativo, 1, 1);
		griglia.add(bRicorsivo, 1, 2);
		griglia.add(lNumeroConigli, 1, 3);


		griglia.setId("griglia");

		Scene scene = new Scene(griglia);

		primaryStage.setTitle("Conigli in cattività");
		primaryStage.setScene(scene);
		primaryStage.show();

		bIterativo.setOnAction(e -> riproduzioneIterativa());
		bRicorsivo.setOnAction(r -> riproduzioneRicorsivo());
	}

	public int fibonacciRicorsivo(int r) {

		if (r<2) {
			if (r==0) {
				return 0;
			} else {
				return 1;
			}
		}else {
			return fibonacciRicorsivo(r - 1) + fibonacciRicorsivo(r - 2);
		}
	}

	public int fibonacciIterativo(int n) {
		int antenato, precendente, fibonacci = 0;

		if (n<2) {
			if (n==0) {
				return 0;
			} else {
				return 1;
			}
		}else {
			antenato = 0;
			precendente = 1;

			for(int c = 2;c<= n;c++) {
				fibonacci = antenato +precendente;
				antenato = precendente;
				precendente = fibonacci;
			}
			return fibonacci;
		}


	}

	private void riproduzioneIterativa() {
		int mese = Integer.parseInt(fMesi.getText());
		int coppieConigli = fibonacciIterativo(mese);

		lNumeroConigli.setText(coppieConigli + "");

	}

	private void riproduzioneRicorsivo() {
		int mese = Integer.parseInt(fMesi.getText());
		int coppieConigli = fibonacciRicorsivo(mese);

		lNumeroConigli.setText(coppieConigli + "");

	}

	public static void main(String[] args) {
		launch(args);
	}

}