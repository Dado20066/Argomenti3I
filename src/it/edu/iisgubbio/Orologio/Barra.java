package it.edu.iisgubbio.Orologio;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Barra extends Application {
	

  int contaSecondi = 0;
	
  TextField tSimbolo = new TextField("");
  TextField tContatore = new TextField("");
  TextField tMillisecondi = new TextField("");
  Label lSimbolo = new Label("simbolo: ");
  Label lContatore = new Label("contatore: ");
  Label lMillisecondi = new Label("millisecondi: ");
  Label lTutti = new Label("");
  Button bVia = new Button ("via");

  
  public void start(Stage finestra) {
	  
	  
    GridPane principale = new GridPane();
    
    principale.add(lSimbolo,   				0, 0);
    principale.add(lContatore, 				0, 1);
    principale.add(lMillisecondi, 			0, 2);
    principale.add(lTutti, 					0, 3, 3, 1);
    principale.add(tSimbolo,   				1, 0);
    principale.add(tContatore, 				1, 1);
    principale.add(tMillisecondi, 			1, 2);
    principale.add(bVia, 					2, 0, 1, 3);
    
    
    lTutti.setMaxWidth(1000);
    bVia.setMaxWidth(75);
    bVia.setMaxHeight(1000);
    
    
    Scene scena = new Scene(principale);

    finestra.setTitle("BARRA");
    finestra.setScene(scena);
    finestra.show();
    bVia.setOnAction(e -> segni() );
  }
  
  
  public void segni() {
	  int contatore, millisecondi;
	  contatore=Integer.parseInt(tContatore.getText());
	  millisecondi=Integer.parseInt(tMillisecondi.getText());
			  KeyFrame fotogramma = new KeyFrame(
		      Duration.millis(millisecondi), 
		      x -> aggiornaTimer());

	  Timeline timeline = new Timeline(fotogramma);
	  timeline.setCycleCount(contatore);
  	  timeline.play();
  }
  		
	  private void aggiornaTimer(){
		   String simbolo, barra;
		   simbolo = tSimbolo.getText();
		   barra = lTutti.getText();
		   barra = barra+simbolo;
		   lTutti.setText(barra);
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}