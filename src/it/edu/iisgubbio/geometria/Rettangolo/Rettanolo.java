package it.edu.iisgubbio.geometria.Rettangolo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rettanolo extends Application {
	//label 
	Label lBase= new Label ("Base");
	Label lAltezza= new Label ("Altezza");
	Label lRisultato= new Label ("Risutato");
	Label lRisulta= new Label ("");
	
	//text
	TextField tBase =new TextField ();
	TextField tAltezza =new TextField ();
	
	//button
	Button bArea =new Button ("Area");
	Button bPerimetro =new Button ("Perimetro");
	
		public void start(Stage finestra) {
		
			GridPane griglia = new GridPane();
			
			griglia.add(lBase, 0,0);
			griglia.add(lAltezza, 0, 1);
	
			griglia.add(tBase, 1, 0);
			griglia.add(tAltezza, 1, 1);
			griglia.add(lRisulta, 1, 3);
			
			griglia.add(bArea, 2,0);
			griglia.add(bPerimetro, 2,1);
	
	
			bArea.setOnAction(e -> Area());
			bPerimetro.setOnAction(e -> Perimetro());
	
	
			 
		    
			Scene scena = new Scene(griglia);
	
			finestra.setTitle("Rettangolo");
			finestra.setScene(scena);
			finestra.show();
			}
	

			private void Area() {
				
			String t1,t2;
			
			int dividi1, dividi2, dividi;
			t1 = tBase.getText();
			t2 = tAltezza.getText();
			dividi1 = Integer.parseInt(t1);
			dividi2 = Integer.parseInt(t2);
			dividi = dividi1 * dividi2;
			  lRisulta.setText("" + dividi);
			}
			
			private void Perimetro() {
				
				String t1,t2;
				
				int dividi1, dividi2, dividi;
				t1 = tBase.getText();
				t2 = tAltezza.getText();
				dividi1 = Integer.parseInt(t1);
				dividi2 = Integer.parseInt(t2);
				dividi = (dividi1 + dividi2)*2;
				  lRisulta.setText("" + dividi);
				}
			
			public static void main(String[] args) {
			    launch(args);
			  }
}