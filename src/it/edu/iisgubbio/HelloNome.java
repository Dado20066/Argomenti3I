
package it.edu.iisgubbio;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class HelloNome extends Application {
    
 
   Label messaggio = new Label("Sono impaziente..."); 
   
    TextField nome = new TextField();
 
    public void start(Stage primaryStage) {
        
       
        Label mettiNome = new Label("Nome:");
        
        Button eseguiSaluto = new Button("Premi qui");
 
        
        nome.setPromptText("Nome o nomignolo per salutarti");
        
        eseguiSaluto.setOnAction(e -> saluta() );
        
  
        GridPane griglia = new GridPane();
     
        griglia.add(mettiNome, 0, 0);
        
        griglia.add(nome, 1, 0);
        
        griglia.add(eseguiSaluto, 1, 1);
    
        griglia.add(messaggio, 1, 2);
        
     
        Scene scene = new Scene(griglia, 500, 250);
        
   
        primaryStage.setTitle("Un saluto personalizzato");
       
        primaryStage.setScene(scene);
      
        primaryStage.show();
    }

  
    public static void main(String[] args) {
        launch(args);
    }
    
        public void saluta() {
       
        String utente;
       
        utente = nome.getText();
         messaggio.setText("Chi sei?"); 
     
        
    }
    
}
