package fr.diginamic.testenumeration;

public enum Saison {

	ETE("ete"), PRINTEMPS("Printemps"), AUTOMNE("Automne"), HIVER("Hiver");

	private String nom;

	private Saison(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	boolean compareTo(String string) {
		// TODO Auto-generated method stub
		if(this.nom == string) {
			return true;
		}else {
			return false;
	
		}
	}

}
