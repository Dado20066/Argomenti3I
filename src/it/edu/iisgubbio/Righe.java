package it.edu.iisgubbio;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Righe extends Application {

  
  public void start(Stage primaryStage) {
    
    Canvas quadro = new Canvas(200, 200);
    
    GraphicsContext gc = quadro.getGraphicsContext2D();
    
    gc.setStroke(Color.RED);
    gc.setLineWidth(1);
    gc.strokeLine(0,0,199,0);
    
    GridPane root = new GridPane();
    
    root.add(quadro, 0, 0);

    Scene scene = new Scene(root);
    primaryStage.setTitle("Hello Canvas!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  

  public static void main(String[] args) {
    launch(args);
  }
}