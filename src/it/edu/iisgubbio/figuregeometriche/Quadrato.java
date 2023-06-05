package it.edu.iisgubbio.figuregeometriche;

public class Quadrato {

	int lato;
	Quadrato(int x) {
		lato=x;	
	}
	int area() {
		int superficie=lato*lato;
		return superficie;
	}
	public int getLato() {
		return lato;
	}
	public void setLato(int lato) {
		this.lato = lato;
	}
int perimeto() {
	int perimetro=lato*4;
	return perimetro;
}

}
