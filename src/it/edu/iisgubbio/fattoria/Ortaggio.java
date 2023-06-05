package it.edu.iisgubbio.fattoria;

public class Ortaggio extends Prodotto {
	protected boolean biologico;

	@Override
	public String toString() {
		return "Ortaggio [biologico=" + biologico + ", nome=" + nome + ", prezzoKG=" + prezzoKG + "]";
	}
	public Ortaggio(String nome, double prezzoKG, boolean biologico) {
		super(nome,prezzoKG);
		this.biologico=biologico;
	}
	
}
