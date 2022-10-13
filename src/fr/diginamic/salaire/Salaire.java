package fr.diginamic.salaire;

public class Salaire extends Intervenant {

	int salaire;
	String jobString;
	

	public Salaire(String firstName, String lastName, String jobString, int salaire) {
		super(firstName, lastName);
		this.salaire = salaire;
		this.jobString = jobString;
	}

	@Override
	public int getSalaire() {
		return this.salaire;
	}
	
	public void afficheDonnees() {
		System.out.println("Le Salarié : "+ this.getFirstName()+" "+this.getLastName()+" salaire : "+this.getSalaire()+" status : " + jobString);
	}
	


}
