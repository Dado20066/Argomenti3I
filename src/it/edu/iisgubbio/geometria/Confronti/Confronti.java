package it.edu.iisgubbio.geometria.Confronti;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Confronti extends Application {

	// label

	Label lBase = new Label("base");
	Label lAltezza = new Label("altezza");
	Label lTriangolo = new Label("trangolo");
	Label lRettngolo = new Label("Rettngolo ");
	Label lConfronta = new Label("");

	// TextField

	TextField tBasetria = new TextField(" ");
	TextField tBaseRet = new TextField(" ");
	TextField tAltezzatria = new TextField(" ");
	TextField tAltezzaret = new TextField(" ");

	// Button

	Button bConfronta = new Button("confronta");


	public void start(Stage finestra) {

		bConfronta.setOnAction(e -> confronta ());

		GridPane griglia = new GridPane();

		// griglia

		griglia.add(lBase, 0, 2);
		griglia.add(lAltezza, 0, 3);
		griglia.add(lTriangolo, 1, 1);
		griglia.add(lRettngolo, 2, 1);

		griglia.add(tBasetria, 1, 2);
		griglia.add(tAltezzatria, 1, 3);
		griglia.add(tBaseRet, 2, 2);
		griglia.add(tAltezzaret, 2, 3);

		griglia.add(bConfronta, 1,4,2,1);
		bConfronta.setMaxWidth(2000);

		griglia.add(lConfronta, 1,5 );

		Scene scena = new Scene(griglia, 400, 450);

		finestra.setTitle("Sauta");
		finestra.setScene(scena);
		finestra.show();
	}







	private void confronta() {
		double baseT, altezzaT, areaTriangolo;
		String t1, t2;
		t1 = tBasetria.getText();
		t2 = tAltezzatria.getText();

		baseT = Double.parseDouble(t1);
		altezzaT = Double.parseDouble(t2);
		areaTriangolo =(baseT*altezzaT)/2;

		double baseR, altezzaR, areaRettangolo;
		String t3, t4;
		t3 = tBaseRet.getText();
		t4 = tAltezzaret.getText();

		baseT = Double.parseDouble(t1);
		altezzaT = Double.parseDouble(t2);
		areaRettangolo =(baseT*altezzaT);

		if(areaTriangolo>=areaRettangolo) {
			lConfronta.setText("area del triangolo ("+areaTriangolo+") è maggiore del rettangolo "+areaRettangolo);
		}
		else {
			lConfronta.setText("area del rettangolo ("+areaRettangolo+") è maggiore del triangolo "+areaTriangolo);
		}
	}












	public static void main(String[] args) {
		launch(args);
	}
}
