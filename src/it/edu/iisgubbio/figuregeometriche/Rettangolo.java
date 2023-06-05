package it.edu.iisgubbio.figuregeometriche;

public class Rettangolo extends Object {

	int base;
	int altezza;
	Rettangolo(int x,int y) {
		base=x;
		altezza=y;
	}
	String toStrin() {
		return "Rettangolo"+base+"per"+altezza;
	}
	int area () {
		int superficie=base*altezza;
		return superficie;
	}
	int perimetro() {
		return base*2+altezza*2;
	}
}
