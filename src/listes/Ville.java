package listes;



public class Ville {

	String nom;
	Integer nbHabitant;

	public Ville(String nom, Integer nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(Integer nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
}
