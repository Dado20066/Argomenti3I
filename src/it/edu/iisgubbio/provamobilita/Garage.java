package it.edu.iisgubbio.provamobilita;

import it.edu.iisgubbio.mobilita.Bicicletta;

public class Garage {
	
	public static void main(String[] args) {
		
		Bicicletta bm;
		bm =new Bicicletta(340,18);
		bm.setNumeroDiRapporti(8);
		System.out.println(bm);
	}
}
