package entities;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne pers1 = new Personne("Salma", "Hayekoum",  new AdressePostale(22, "rue de Jva", 13006, "Marseille"));
	
		
		Personne pers2 = new Personne("toto", "lolo", new AdressePostale(22, "rue de Jva", 13006, "Marseille" ));
      
		
		System.out.println(pers2);
	}

}
