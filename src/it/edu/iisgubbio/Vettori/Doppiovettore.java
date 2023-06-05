package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Doppiovettore extends Application {   
	Button bElementi[][];
	String valore1 = "1";
	String valore2 = "";
	int contatore =0;
	int coppieuguali =0;
	Button bottone1 = new Button();
	Label lRis =new Label ("");

	public void start(Stage primaryStage) {
		bElementi  = new Button[4][5];
		int riga, colonna;

		GridPane griglia = new GridPane();


		Scene scena = new Scene(griglia);
		primaryStage.setTitle("MEMORY");
		primaryStage.setScene(scena);
		primaryStage.show();

		for(riga=0;riga<4;riga++) {             
			for(colonna=0;colonna<5;colonna++) { 
				bElementi[riga][colonna] = new Button(""  ); 
				bElementi[riga][colonna].setPrefSize(30, 30);
				griglia.add(bElementi[riga][colonna], colonna, riga);
				bElementi[riga][colonna].setOnAction(e-> esegui(e));
			}    
		}

		griglia.add(lRis, 5, 0);

		for(int i =0 ; i<10;i++) {
			if(i==0) {
				bElementi [1][0].setId("0");
				bElementi [3][0].setId("0");
			}
			if(i==1) {
				bElementi [0][0].setId("1");
				bElementi [1][1].setId("1");
			}

			if(i==2) {
				bElementi [0][2].setId("2");
				bElementi [1][3].setId("2");
			}

			if(i==3) {
				bElementi [2][3].setId("3");
				bElementi [3][2].setId("3");
			}

			if(i==4) {
				bElementi [1][4].setId("4");
				bElementi [2][0].setId("4");
			}

			if(i==5) {
				bElementi [0][3].setId("5");
				bElementi [1][2].setId("5");
			}

			if(i==6) {
				bElementi [0][4].setId("6");
				bElementi [3][1].setId("6");
			}

			if(i==7) {
				bElementi [2][1].setId("7");
				bElementi [2][2].setId("7");
			}

			if(i==8) {
				bElementi [0][1].setId("8");
				bElementi [3][4].setId("8");
			}

			if(i==9) {
				bElementi [2][4].setId("9");
				bElementi [3][3].setId("9");
			}

		}
	}
	private void esegui(ActionEvent e) {

		Button b =(Button) e.getSource();

		if(contatore>=2) {
			contatore=0;
		}
		if(contatore==0) {
			valore1=b.getId();
			bottone1=b;
		}
		if(contatore ==1) {
			valore2=b.getId();

		}
		if(valore1.equals(valore2) && contatore==1)    {
			b.setText(valore2);
			bottone1.setText(valore1);
			coppieuguali+=1;
		}

		if(coppieuguali==10) {
			lRis.setText("VINTO");
		}
		contatore+=1;


	}
	public static void main(String[] args) {
		launch(args);
	}
}