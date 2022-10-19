package listes;

public class Ville {

	String nom;
	Integer nbHabitant;

	public Ville(String nom, Integer nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	
	@Override
	public boolean equals(Object obj){
	  
	  if(obj == null) return false;
	  
	  if(obj instanceof Ville && this == obj) return true;
	  
	  Ville ville = (Ville)obj;
	  
	  if(nbHabitant != ville.nbHabitant) return false;
	  if(nom != null && !nom.equalsIgnoreCase(ville.nom)) return false;
	  return true;
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
