package gestionemerende;

public class Panino extends Articolo {
	private boolean contieneCarneSuina;
	private boolean vegetariano;
	
	public Panino(double apportoCalorico, String codice, double costoUnitario, String descrizione, boolean contieneCarneSuina, boolean vegetariano) {
		super(apportoCalorico, codice, costoUnitario, descrizione);
		if(contieneCarneSuina && vegetariano){
			throw new IllegalArgumentException("The length of Codice must be positive");
		}
		this.contieneCarneSuina = contieneCarneSuina;
		this.vegetariano = vegetariano;
	}

	public boolean isContieneCarneSuina() {
		return contieneCarneSuina;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

}
