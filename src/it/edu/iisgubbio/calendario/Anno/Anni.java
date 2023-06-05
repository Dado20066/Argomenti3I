package it.edu.iisgubbio.calendario.Anno;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Anni extends Application {



	//label
	Label lAnno = new Label("Anno");
	Label lRisulta = new Label(" ");

	//textfield
	TextField tAnno = new TextField("");

	//button
	Button bCalcola =new Button ("Calcola Anno");

	public void start(Stage finestra) {

		bCalcola.setOnAction(e -> Premimi());

		//Griglia
		GridPane griglia = new GridPane();

		griglia.add(lAnno, 0, 0);
		griglia.add(lRisulta, 1, 2);

		griglia.add(tAnno, 1, 0);

		griglia.add(bCalcola, 2, 0);


		Scene scena = new Scene(griglia);
		scena.getStylesheets ().add("it/edu/iisgubbio/calendario/Anno/Anno.css");
	


		finestra.setTitle("Anno Bisestile o Non");
		finestra.setScene(scena);
		finestra.show();

	}

	private void Premimi() {

		int anno;
        boolean condizione= false;
        anno= Integer.parseInt(tAnno.getText());
        if(anno%4==0) {
            condizione=true;
        }
        if(anno%100==0) {
            condizione=false;
        }
        if(anno%400==0){
            condizione=true;
        }
        if(condizione==true) {
            lRisulta.setText("L'anno che hai inserito "+ anno + "  è bisestile");
        } else {
            lRisulta.setText("L'anno che hai inserito "+anno+" non è bisestile");
        }
    }

	public static void main(String[] args) {

		launch(args);
	}
}
