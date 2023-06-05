package it.edu.iisgubbio.mobilita;

public class Bicicletta extends AMuscoli {
	private int numeriRapporti;
	private double peso;
	
	public Bicicletta (double costo,double peso) {
		
		this.costo=costo;
		this.peso=peso;
	
	}
	public String toString () {
		
		String l;
		if(peso>10) {
			l="leggera";
		}else {
			l="pesante";;
			}	
		return "La bici pesa"+ peso +"e costa"+ costo +"ha" + numeriRapporti;
	}
	
	
	public boolean leggera () {
		
		if(peso<10) {
			return true;
		}else {
			return false;
			}	
	}
	
	
	public int getNumeroDiRapporti() {
		return numeriRapporti;
	}
	
	
	public void setNumeroDiRapporti(int NumeroDiRapporti) {
		this.numeriRapporti = NumeroDiRapporti; 
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	
	public void setPeso (double Peso) {
		this.peso = Peso;
	}
}
