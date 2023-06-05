package it.edu.iisgubbio.persone;

public class Voto {
	String materia;
	double punteggio;

	public Voto(String materia, double punteggio) {
		this.materia = materia;
		this.punteggio = punteggio;
	}
	public Voto() {
		materia="Sconosciuta";
		punteggio=0;
	}
}