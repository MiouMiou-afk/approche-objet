package fr.diginamic.salaire;

public abstract class Intervenant {
	
	public String firstName;
	public String lastName;
	public String status;
	int salaire;
	
	
	public Intervenant(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	 
	}

	public abstract void afficheDonnees();

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}


	public int getSalaire() {
		return salaire;
		
	}
	
	 
	
}
