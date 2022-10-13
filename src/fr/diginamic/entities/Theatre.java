
package fr.diginamic.entities;

public class Theatre {
	private String nom;
	private int capaciterMax;
	private int inscrits;
	private double recette;
	
	
	public Theatre(String nom,int capaciterMax,int inscrits) {
		// TODO Auto-generated constructor stub
		this.capaciterMax = capaciterMax;
		this.nom = nom;
		this.inscrits = inscrits;
	}
	
	public void inscription(float prix,int inscrits) {
		if(inscrits >= this.capaciterMax) {
			System.out.println("Capacité max atteinte !");
		}else {
			this.inscrits=inscrits;
			this.recette=inscrits*prix;
		}
	}
	
	
	 
	public String getNom() {
		return nom;
	}
 
	public void setNom(String nom) {
		this.nom = nom;
	}
	 
	public int getCapaciterMax() {
		return capaciterMax;
	}
	 
	public void setCapaciterMax(int capaciterMax) {
		this.capaciterMax = capaciterMax;
	}
 
	public int getInscrit() {
		return inscrits;
	}
	 
	public void setInscrit(int inscrits) {
		this.inscrits = inscrits;
	}
 
	public double getRecette() {
		return recette;
	}
	 
	public void setRecettee(double recette) {
		this.recette = recette;
	}
}
