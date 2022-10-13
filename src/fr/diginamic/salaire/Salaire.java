package fr.diginamic.salaire;

public class Salaire extends Intervenant {

	int salaire;
	

	public Salaire(String firstName, String lastName, int salaire) {
		super(firstName, lastName);
		this.salaire = salaire;
	}

	@Override
	public int getSalaire() {
		return this.salaire;
	}
	
	public void afficheDonnees() {
		System.out.println("Le Salarié : "+ this.getFirstName()+" "+this.getLastName()+" salaire "+this.getSalaire()+" status CDI/CDD");
	}
	


}
