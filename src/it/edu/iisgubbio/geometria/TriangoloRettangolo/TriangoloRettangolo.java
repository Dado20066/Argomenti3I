package it.edu.iisgubbio.geometria.TriangoloRettangolo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TriangoloRettangolo extends Application {
	
	//label
	Label lCmin =new Label ("C.Minore");
	Label lCmagg =new Label ("C.Maggiore");
	Label lIpotenusa =new Label ("Ipotensa");
	
	//text
	TextField tMin =new TextField ();
	TextField tMagg =new TextField ();
	TextField tIpo =new TextField ();
	
	//button
	Button bMinore =new Button ("min");
	Button bMaggiore =new Button ("magg");
	Button bIpotenusa =new Button ("ipo");
	
	public void start(Stage finestra) {
	
		GridPane griglia = new GridPane();
		
		griglia.add(lCmin, 0,0);
		griglia.add(lCmagg, 0, 1);
		griglia.add(lIpotenusa, 0, 2);

		griglia.add(tMin, 1, 0);
		griglia.add(tMagg, 1, 1);
		griglia.add(tIpo, 1, 2);
		
		griglia.add(bMinore, 2,0);
		griglia.add(bMaggiore, 2,1);
		griglia.add(bIpotenusa, 2,2);
	

		bMinore.setOnAction(e -> minore());
		bMaggiore.setOnAction(e -> maggiore());
		bIpotenusa.setOnAction(e -> ipotenusa());
	

		 
	    
		Scene scena = new Scene(griglia, 400, 450);

		finestra.setTitle("Tringolo Rettangolo");
		finestra.setScene(scena);
		finestra.show();
		}
	


private void ipotenusa() {
	double dividi1, dividi2, dividi;
	String t1, t2;
	t1 = tMagg.getText();
	t2 = tMin.getText();
	
	dividi1 = Double.parseDouble(t1);
	dividi2 = Double.parseDouble(t2);
	dividi = Math.sqrt (dividi1*dividi1 + dividi2*dividi2);
	  tIpo.setText(""+"" + dividi);
		
	}



private void maggiore() {
	double dividi1, dividi2, dividi;
	String t1, t2;
	t1 = tIpo.getText();
	t2 = tMin.getText();
	
	dividi1 = Double.parseDouble(t1);
	dividi2 = Double.parseDouble(t2);
	dividi = Math.sqrt (dividi1*dividi1 - dividi2*dividi2);
	  tMagg.setText("" + dividi);
		
		
	}



private void minore() {
	double dividi1, dividi2, dividi;
	String t1, t2;
	t1 = tIpo.getText();
	t2 = tMagg.getText();
	
	dividi1 = Double.parseDouble(t1);
	dividi2 = Double.parseDouble(t2);
	dividi = Math.sqrt (dividi1*dividi1 - dividi2*dividi2);
	  tMin.setText("" + dividi);
		
		
	}



public static void main(String[] args) {
    launch(args);
  }
}
