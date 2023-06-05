package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Conversioni extends Application{

    ComboBox<String> cbPartenza = new ComboBox();
    TextField tNum = new TextField();
    Label lDecimale = new Label();
    Label lBinario = new Label();
    Label lEsadecimale = new Label();
    Label lDecRis = new Label();
    Label lBinRis = new Label();
    Label lEsaRis = new Label();
    Button bDec = new Button(); 
    Button bBin = new Button(); 
    Button bEsa = new Button(); 

    public void start(Stage finestra) {
        tNum.setPromptText("");
        cbPartenza.setPromptText("Conversione di partenza");
        cbPartenza.getItems().add("Decimale");
        cbPartenza.getItems().add("Binario");
        cbPartenza.getItems().add("Esadecimale");
        lDecimale.setText("Decimale: ");
        lBinario.setText("Binario: ");
        lEsadecimale.setText("Esadecimale: ");
        lDecRis.setText("");
        lBinRis.setText("");
        lEsaRis.setText("");
        bDec.setText("DECIMALE");
        bBin.setText("BINARIO");
        bEsa.setText("ESADECIMALE");
        tNum.setMaxWidth(2000);
        bDec.setOnAction(e -> convertiDec());
        bBin.setOnAction(e -> convertiBin());
        bEsa.setOnAction(e -> convertiEsa());


        GridPane principale = new GridPane();
        principale.add(cbPartenza,0,1,3,1);
        principale.add(lDecimale,0,2);
        principale.add(lBinario,0,3);
        principale.add(lEsadecimale,0,4);
        principale.add(lDecRis,1,2,2,1);
        principale.add(lBinRis,1,3,2,1);
        principale.add(lEsaRis,1,4,2,1);
        principale.add(bDec,0,5);
        principale.add(bBin,1,5);
        principale.add(bEsa,2,5);
        principale.add(tNum,0,0,3,1);
        principale.setPadding(new Insets(5, 5, 5, 5));

        principale.setId("griglia");
        Scene scena = new Scene(principale);

        finestra.setTitle("Conversioni");
        principale.getStylesheets().add("it/edu/iisgubbio/Generale.css");
        finestra.setScene(scena);
        finestra.show();

    }

    public void convertiDec() {
        if(cbPartenza.getValue()=="Binario") {
            char numeri[]=tNum.getText().trim().toCharArray();
            int somma=0;
            int indice=0;
            for(int i=numeri.length-1;i>=0;i--) {
                somma=(int) (somma+Character.getNumericValue(numeri[i])*Math.pow(2, indice));
                indice++;
            }
            lDecRis.setText(""+somma);
        }

        if(cbPartenza.getValue()=="Esadecimale") {
            char numeri[]=tNum.getText().trim().toCharArray();
            int somma=0;
            int indice=0;
            for(int i=numeri.length-1;i>=0;i--) {
                somma=(int) (somma+Character.getNumericValue(numeri[i])*Math.pow(16, indice));
                indice++;
            }
            lDecRis.setText(""+somma);
        }
    }


    public void convertiBin() {


        if(cbPartenza.getValue()=="Decimale") {
            int numInserito=Integer.parseInt(tNum.getText());
            double grandezza=Math.log10(numInserito)%Math.log10(2)-(int) (Math.log10(numInserito)%Math.log10(2));
            if(grandezza==0) {
                grandezza=(int) (Math.log10(numInserito)/Math.log10(2));
            } else {
                grandezza=(int) (Math.log10(numInserito)/Math.log10(2))+1;
            }
            char numeri[]=new char[(int)grandezza];
            for(int i=numeri.length-1;i>=0;i--) {
                numeri[i]= (char) (numInserito%2+'0');
                numInserito=numInserito/2;
            }
            lBinRis.setText(new String (numeri));
        }

        if(cbPartenza.getValue()=="Esadecimale") {
            char numeri[]=tNum.getText().trim().toCharArray();
            int somma=0;
            int indice=0;
            for(int i=numeri.length-1;i>=0;i--) {
                somma=(int) (somma+Character.getNumericValue(numeri[i])*Math.pow(16, indice));
                indice++;
            }
            double grandezza=Math.log10(somma)%Math.log10(2)-(int) (Math.log10(somma)%Math.log10(2));
            if(grandezza==0) {
                grandezza=(int) (Math.log10(somma)/Math.log10(2));
            } else {
                grandezza=(int) (Math.log10(somma)/Math.log10(2))+1;
            }
            char numeriResti[]=new char[(int)grandezza];
            for(int i=numeriResti.length-1;i>=0;i--) {
                numeriResti[i]= (char) (somma%2+'0');
                somma=somma/2;
            }
            lBinRis.setText(new String (numeriResti));
        }
    }


    public void convertiEsa() {
        if(cbPartenza.getValue()=="Binario") {
            String numeri=tNum.getText().trim();
            String risposta="";
            while(numeri.length()%4!=0) {
                numeri=0+numeri;
            }
            char valori[]=numeri.trim().toCharArray();
            for(int x=0;x<valori.length;x=x+4) {
                int somma=0;
                int indice=3;
                for(int l=x;l<x+4;l++) {
                        somma=(int) (somma+Character.getNumericValue(valori[l])*Math.pow(2, indice));
                        indice--;
                }
                switch(somma) {
                case 10:
                    risposta+="a";
                    break;
                case 11:
                    risposta+="b";
                    break;
                case 12:
                    risposta+="c";
                    break;
                case 13:
                    risposta+="d";
                    break;
                case 14:
                    risposta+="e";
                    break;
                case 15:
                    risposta+="f";
                    break;
                default:
                    risposta+=""+somma;
                }
            }
            lEsaRis.setText(risposta);
        }

        if(cbPartenza.getValue()=="Decimale") {
            int numInserito=Integer.parseInt(tNum.getText());
            String risposta="";
            for(int i=0;i>-1;i++) {
                if(numInserito==0) {
                    break;
                } else {
                    switch(numInserito%16) {
                    case 10:
                        risposta+="a";
                        break;
                    case 11:
                        risposta+="b";
                        break;
                    case 12:
                        risposta+="c";
                        break;
                    case 13:
                        risposta+="d";
                        break;
                    case 14:
                        risposta+="e";
                        break;
                    case 15:
                        risposta+="f";
                        break;
                    default:
                        risposta+=""+numInserito%16;
                    }
                    numInserito=numInserito/16;
                }
            }    
            StringBuilder risposta1 = new StringBuilder(risposta).reverse();
            lEsaRis.setText(""+risposta1.toString());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}