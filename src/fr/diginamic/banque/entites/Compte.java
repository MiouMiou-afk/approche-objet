package fr.diginamic.banque.entites;

public class Compte {
	
	private int numCompte;
	private double soldeCompte;
	
	public Compte(int numCompte,int soldeCompte ) {
		// TODO Auto-generated constructor stub
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	public String toString() {
		   return "Compte numero : " + this.numCompte +
			  
			  " | montant : " + this.soldeCompte;
		}
	
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public double getsoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
}
