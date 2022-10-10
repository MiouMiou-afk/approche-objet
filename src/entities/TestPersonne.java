package entities;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne pers1 = new Personne();
		pers1.name = "Toto";
		pers1.firstName = "Laurent";
		pers1.adresse.numeroRue = 25;
		pers1.adresse.libelleRue = "Rue des chats";
		pers1.adresse.codePostal= 13005;
		pers1.adresse.ville ="Marseille";
		
		Personne pers2 = new Personne();
		pers2.name = "Toto";
		pers2.firstName = "Laurent";
		pers2.adresse.numeroRue = 25;
		pers2.adresse.libelleRue = "Rue des chats";
		pers2.adresse.codePostal= 13005;
		pers2.adresse.ville ="Marseille";
      
		
		System.out.println(pers2);
	}

}
