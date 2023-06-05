package it.edu.iisgubbio.figuregeometriche;

public class Geometra {

	public static void main(String[] args) {
		/*System.out.println("ciao");
		Quadrato tavolo;
		tavolo=new Quadrato(70);
		Quadrato mattonella =new Quadrato(25);
		mattonella.lato=25;
		tavolo.lato=70;
		System.out.println(tavolo.lato);
		System.out.println(mattonella.lato);
		int sTavolo = tavolo.area();
		System.out.println(sTavolo);
		System.out.println(mattonella.perimeto());*/





		Rettangolo libro = new Rettangolo(20,30);

		System.out.println(libro);
		Rettangolo tovaglia = new Rettangolo(200,300);

		int pTovaglia = tovaglia.perimetro();

		System.out.println("il perimetro della tvaglia è: "+pTovaglia+"cm");

		int aTovaglia = tovaglia.area()/100/100;

		System.out.println("l'area della tovaglia è: "+aTovaglia+"mq");

	}
}