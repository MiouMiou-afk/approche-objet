package tri;

public class Ville {

	String nom;
	Integer nbHabitant;

	public Ville(String nom, Integer nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nom + "=>" + this.nbHabitant;
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

	// permet d'utiliser Collections.sort(liste) pour trier une listfe d'objet
	// Il faut imperativement implementer CompareTo dans la classe ou l'on souhaite
	// trier un tableau d'objet

}
