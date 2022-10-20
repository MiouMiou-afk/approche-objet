package listes;

/**
 * 
 * @author MyriamAgag
 * 
 * Représente le concepte de ville avec un nom et un nbr d'habitant
 *
 */

public class Ville {

	/**
	 * Nom de la ville 
	 */
	String nom;
	/**
	 * Nombre d'habitant
	 */
	Integer nbHabitant;
	
	Continent continent;

	/**
	 * 
	 * @param nom nom de la ville
	 * @param nbHabitant nombre d'habitant
	 */
	public Ville(String nom, Integer nbHabitant, Continent continent) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent =continent;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (obj instanceof Ville && this == obj) {
			return true;
		}

		Ville ville = (Ville) obj;

		if (nbHabitant != ville.nbHabitant) {
			return false;
		}
		if (nom != null && !nom.equalsIgnoreCase(ville.nom)) {
			return false;
		} 
		if (continent != ville.continent) {
			return false;
		}else {
			return true;

		}
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + ", continent=" + continent + "]\n";
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
