package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	int tauxRemuneration;

	public CompteTaux(int numCompte, int soldeCompte, int tauxRemuneration) {
		super(numCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
}
	public String toString() {
		return super.toString() + " et son taux de rémuneration est de : " + tauxRemuneration + " ";
		
	}

	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
