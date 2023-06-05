package it.edu.iisgubbio.persone;

public class Persona {
	String  nome;
	String cognome;
	int anno;

	public Persona (String x,String y, int z) {
		nome=x;
		cognome=y;
		anno=z;
	}
	public String toString() {
		return nome +" "+ cognome +" Nato nell'anno "+ anno;
	}
	public int eta(int i) {
	return i - anno;
	}
	
}
