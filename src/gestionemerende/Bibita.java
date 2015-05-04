package gestionemerende;

public class Bibita extends Articolo {
	private double quantita;

	public Bibita(double apportoCalorico, String codice, double costoUnitario, String descrizione, double quantita) {
		super(apportoCalorico,codice,costoUnitario, descrizione);
		if(quantita <= 0)
			throw new IllegalArgumentException("The length of Codice must be positive");
		this.quantita = quantita;
	}

	public double getQuantita() {
		return quantita;
	}
}