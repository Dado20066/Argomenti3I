package it.edu.iisgubbio.negozi.Panini;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Panini extends Application{

	Label lNumeroPanini=new Label("Numero Panini");
	Label lCostoPanini=new Label("Costo Panini");
	Label lSconto=new Label("Sconto");
	Label lTotaleRisultato=new Label();
	
	Button bTotale=new Button("Totale");
	
	TextField tNumeroPanini=new TextField();
	TextField tCostoPanini=new TextField();
	
	CheckBox Sconto=new CheckBox("Applica 10%");
	
	public void start(Stage primaryStage) throws Exception {
		
		bTotale.setOnAction(e -> eseguiTotale());
		
		GridPane griglia=new GridPane();
		griglia.add(lNumeroPanini, 0, 0);
		griglia.add(lCostoPanini, 0, 1);
		griglia.add(lSconto, 0, 2);
		griglia.add(bTotale , 0, 3);
		griglia.add(tNumeroPanini, 1, 0);
		griglia.add(tCostoPanini, 1, 1);
		griglia.add(Sconto , 1, 2);
		griglia.add(lTotaleRisultato ,1,3);
		
		Scene scene = new Scene(griglia, 500,300);
		
		primaryStage.setScene(scene);
	    primaryStage.setTitle("Panini");
	    primaryStage.show();
	    
	    
	    }
		      
		private void eseguiTotale(){
			double numeropanini,costopanini;
			double sconto,risultato;
			String text1,text2;
			text1=tNumeroPanini.getText();
			numeropanini=Double.parseDouble(text1);
			text2=tCostoPanini.getText();
			costopanini=Double.parseDouble(text2);
			risultato=numeropanini*costopanini;
			if (Sconto.isSelected()) {
				sconto = risultato *10 / 100;
				risultato-= sconto;
				}
			lTotaleRisultato.setText(""+risultato);
		}
		
 	public static void main(String[] args) {
	launch(args);
}

}
