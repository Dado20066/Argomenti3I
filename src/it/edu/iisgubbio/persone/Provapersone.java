package it.edu.iisgubbio.persone;

public class Provapersone {

	public static void main (String[] args) {
		System.out.println("CIAO, BENVENUTI NEL REGISTRO ELETTRONICO");
		Persona mario;
		Studente anna;
		mario= new Persona("Mario","Rossi",2005);
		anna= new Studente("Anna","Bianchi",2009,"1I",+2022);
		Voto nuovoVoto= new Voto("Matematica",8);
		anna.aggiungiVoto(nuovoVoto);
		anna.aggiungiVoto(new Voto("italiano",9));
		double mediaAnna = anna.mediaVoti();
		boolean promossaAnna = anna.esito();	
		System.out.println(mario.eta(2023));
		System.out.println(anna.eta(2023));
		System.out.println(mediaAnna);
		System.out.println(promossaAnna);
	}

}
