package it.edu.iisgubbio.Orologio;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Contoallarovescia extends Application {

    int numero=10;
    
    // label

    Label lNum = new Label(" ");


    public void start(Stage finestra ) {


        GridPane griglia = new GridPane();

        // griglia

        griglia.add(lNum, 2, 0);


        Scene scena = new Scene(griglia,250,200 );

        finestra.setTitle("Conto alla rovescia");
        finestra.setScene(scena);
        finestra.show();
        
        KeyFrame fotogramma = new KeyFrame(
                Duration.seconds(1),
                e->scadutoTimer()
                );
        
        Timeline timer = new Timeline(fotogramma);
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();


    }
    
    private void scadutoTimer() {
        
        
        numero--;
        lNum.setText(" "+numero);
        
        
    }
        
    
        

    public static void main(String[] args) {
        launch(args);
    }
}