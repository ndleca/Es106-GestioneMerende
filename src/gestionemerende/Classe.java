package gestionemerende;

import java.util.Vector;

public class Classe 
{
	private String nome;
	private Vector<Ordine> ordini;	
	
	
	public Classe(String nome) 
	{
		this.ordini = new Vector<Ordine>();
		if(nome == null)
			throw new IllegalArgumentException("Nome cannot be null");
		if(nome.length() <= 0)
			throw new IllegalArgumentException("The length of Nome must be positive");
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public Vector<Ordine> getOrdini() {
		return ordini;
	}
	
	public void addOrdine(Ordine ordine) {
		for(Ordine o : this.ordini) {
			if(ordine.getCodice() == o.getCodice()) {
				throw new IllegalArgumentException("L'ordine giornaliero è già stato effettuato");
			}
		}
		this.ordini.addElement(ordine);
	}


	
}