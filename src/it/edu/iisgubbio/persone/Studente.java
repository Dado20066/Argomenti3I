package it.edu.iisgubbio.persone;

public class Studente extends Persona{
	String  classe;
	int annoIscrizione;
	Voto voti[];
	int postoVoto=0;

	public Studente (String nome,String cognome, int anno,String clsse, int annoIscrizione) {
		super (nome,cognome,anno);
		this.classe=classe;
		this.annoIscrizione=annoIscrizione;
		voti=new Voto [100];
	}
	public void aggiungiVoto(Voto k) {
		voti[postoVoto]=k;
		postoVoto++;
	}

	public double mediaVoti() {

		double somma=0;

		for(int i=0; i<postoVoto ; i++) {
			somma = somma + voti [i].punteggio;
		}
		double totale =0 ;
		return somma / postoVoto;
	}
	public boolean esito() {
		boolean promosso = false;
		for(int i=0; i<postoVoto ; i++) {
			if(voti[i].punteggio>=6) {
				promosso = true;
			}
		}return promosso;

	}
}