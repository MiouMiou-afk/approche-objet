package tri;



public class Ville implements Comparable<Ville> {

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

	//permet d'utiliser Collections.sort(liste) pour trier une listfe d'objet
	//Il faut imperativement implementer CompareTo dans la classe ou l'on souhaite trier un tableau d'objet
	
	@Override
	public int compareTo(Ville o) {
		// retourne la list selon le nombre d'habitant
		if(this.nbHabitant>o.getNbHabitant()) {
			return 1;
		}if(this.nbHabitant<o.getNbHabitant()) {
			return -1;
		}
		return 0;
		//retourne la liste selon l'ordre alphabetique
//		return this.nom.compareTo(o.getNom());
	}
}