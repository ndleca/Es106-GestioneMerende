package gestionemerende;

import java.util.Vector;

public class Istituto
{
	private String nome;
	private Vector<Classe> classi; 
	
	
	public Istituto(String nome)
	{
		this.classi = new Vector<Classe>();
             
		if(nome == null)
			throw new IllegalArgumentException("Nome cannot be null");
		if(nome.length() <= 0)
			throw new IllegalArgumentException("The length of Nome must be positive");
		this.nome = nome;
	}
	
	public Vector<Classe> getClassi()
	{
		return classi;
	}
	
	public String getNome()
	{		
		return nome;
	}
}
