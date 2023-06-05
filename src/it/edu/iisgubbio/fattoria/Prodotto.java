package it.edu.iisgubbio.fattoria;

public class Prodotto {
	protected String nome;
	protected double prezzoKG;

	public Prodotto (String nome,double prezzoKG) {
		this.nome=nome;
		this.prezzoKG=prezzoKG;
	}
	
	public Prodotto () {
	
	}
	public String toString() {
		return nome +" "+ prezzoKG;
	}
	
	public double calcolaPrezzo(double peso) {
		return peso*prezzoKG;
	}
}
