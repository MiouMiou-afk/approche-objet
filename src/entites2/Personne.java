package entites2;

import entities.AdressePostale;

public class Personne {

	public String name;
	public String firstName;
	public AdressePostale adresse ;
	
	public Personne(String name, String firstName, AdressePostale adresse ) {
		this.name = name;
		this.firstName = firstName;
		this.adresse = adresse;
	}
	
	
}
