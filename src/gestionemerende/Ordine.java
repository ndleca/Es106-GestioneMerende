package gestionemerende;

import java.time.LocalDateTime;
import java.util.Vector;

public class Ordine
{
	private Vector<Articolo> articoli = null;
	
	private String codice;
	private Classe classe;
	
	public Ordine(String codice)
	{
		if(codice == null)
			throw new IllegalArgumentException("Codice cannot be null");
		if(codice.length() <= 0)
			throw new IllegalArgumentException("The length of Codice must be positive");
		this.codice = codice;
		this.articoli = new Vector<Articolo>();
			
	}
	
	public Vector<Articolo> getArticolo()
	{
		return articoli;
	}
	
	public String getClasse()
	{
		String Classe = null;
		return Classe;
	}
	
	public double getCosto(Articolo articoli)
	{
		double costo=0;
		for(Articolo h: this.articoli){
			costo=costo + h.getCostoUnitario();
		}
		return costo;
	}
		
	public String getCodice()
	{
		return codice;
	}

	public int getNumeroArticoli()
	{
		return articoli.size();
	}
}