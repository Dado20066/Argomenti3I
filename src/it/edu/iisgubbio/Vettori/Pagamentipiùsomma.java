package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Pagamentipiùsomma extends Application {

    Label lNumPagamenti = new Label ("numPagamenti");
    Label lPagamento = new Label ("pagamento");
    Label lRisultato = new Label ("");

    TextField tNumPagamenti = new TextField("");
    TextField tPagamento = new TextField("");

    Button bSomma = new Button ("somma");
    Button bVia = new Button ("via");
    Button bAggiungo = new Button ("aggiungo");

    public void start(Stage finestra) {

        GridPane griglia = new GridPane();
        griglia.add(lNumPagamenti, 0,0);
        griglia.add(tNumPagamenti, 1,0);
        griglia.add(bVia, 2,0);

        griglia.add(lPagamento, 0,1);
        griglia.add(tPagamento, 1,1);
        griglia.add(bSomma, 2,1);

        griglia.add(lRisultato, 1,2);
        griglia.add(bAggiungo, 0,2);


        Scene scene = new Scene(griglia);
        finestra.setTitle("Pagamenti");
        finestra.setScene(scene);
        finestra.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}