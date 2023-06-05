package it.edu.iisgubbio.fattoria;

public class Fattoria {
	public static void main(String[] args) {
		Prodotto carote;
		carote =new Prodotto("carote",2.5);
		System.out.println(carote);
		
		double costo4KgDiCarote=carote.calcolaPrezzo(4);
		System.out.println(costo4KgDiCarote);
		
		Ortaggio pomodoro=new Ortaggio("pomodoro",2.0, true);
		System.out.println(pomodoro);
		System.out.println(pomodoro.calcolaPrezzo(0.5));
	}
}
