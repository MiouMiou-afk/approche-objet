package entites2;

import entities.AdressePostale;

public class Personne {

	public String name;
	public String firstName;
	public AdressePostale adresse;

	public Personne(String name, String firstName, AdressePostale adresse) {
		this.name = name.toUpperCase();
		this.firstName = firstName;
		this.adresse = adresse;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public void setAdresse(AdressePostale adresse) {

		this.adresse = adresse;
	}
	
	public String getName() {

		return name;
	}

	public String getFirstName() {

		return  firstName;
	}

	public AdressePostale getAdresse() {

		return  adresse;
	}

}
