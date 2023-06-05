package it.edu.iisgubbio.geometria.Sfera;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Sfera extends Application {

// label

Label lRaggio = new Label("raggio");
Label lRisultato = new Label("ris");

// TextField

TextField tRaggio = new TextField(" ");
TextField tRisultato = new TextField(" ");

// Button

Button bVolume = new Button("vol");
Button bSuperfice = new Button("sup");
Button bDiametro = new Button("dia");

public void start(Stage finestra) {

bVolume.setOnAction(e -> volume());
bSuperfice.setOnAction(e -> superfice());
bDiametro.setOnAction(e -> diamero());




GridPane griglia = new GridPane();

// griglia

griglia.add(lRaggio, 0, 0);
griglia.add(lRisultato, 0, 2);

griglia.add(tRaggio, 1, 0,3,1);
griglia.add(tRisultato, 1, 2,3,1);

griglia.add(bVolume, 1, 1);
griglia.add(bSuperfice, 2, 1);
griglia.add(bDiametro, 3, 1);

Scene scena = new Scene(griglia, 400, 450);

finestra.setTitle("Sauta");
finestra.setScene(scena);
finestra.show();
}


private void diamero() {

double raggio1 = Double.parseDouble(tRaggio.getText());
double diametro = raggio1*2; 
tRisultato.setText("il diametro è " + diametro);

}


private void superfice() {

double volume;
double diametro;
String numero;
tRisultato.setText("il diametro è :");
numero=tRaggio.getText();


}

private void volume() {

double raggio;
double volume;

double diametro = Double.parseDouble(tRaggio.getText());
raggio = (diametro / 2.0);
volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( raggio, 3 );
tRisultato.setText("il volumeè " + volume);
}


public static void main(String[] args) {
launch(args);
}
}