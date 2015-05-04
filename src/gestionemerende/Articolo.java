package gestionemerende;

public class Articolo {
	private double apportoCalorico;
	private String codice;
	private double costoUnitario;
	private String descrizione;
	
	public Articolo(double apportoCalorico, String codice,
		double costoUnitario, String descrizione) {
		super();
		
		if(codice == null || descrizione == null )
			throw new IllegalArgumentException("Codice cannot be null");
		if(codice.length() <= 0 || descrizione.length() <= 0)
			throw new IllegalArgumentException("The length of Codice must be positive");
		if(apportoCalorico <= 0 || costoUnitario <= 0)
			throw new IllegalArgumentException("The length of Codice must be positive");
				
		this.apportoCalorico = apportoCalorico;
		this.codice = codice;
		this.costoUnitario = costoUnitario;
		this.descrizione = descrizione;
	}

	public double getApportoCalorico() {
		return apportoCalorico;
	}

	public String getCodice() {
		return codice;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	

}
