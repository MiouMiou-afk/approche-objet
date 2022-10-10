package entities;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne pers1 = new Personne("Salma", "Hayekoum", new AdressePostale(22, "rue de Java", 13006, "Marseille"));
		String namePers = pers1.getName();
		String firstNamePers = pers1.getFirstName();
		System.out.println("le pers1 se nomme " + namePers + " " + firstNamePers);

		Personne pers2 = new Personne("toto", "lolo", new AdressePostale(22, "rue de Jva", 13006, "Marseille"));
		pers2.setAdresse(new AdressePostale(25, "rue de la paix", 34200, "Mont"));

		System.out.println("l'adresse est bien modifié : " + pers2.getAdresse().numeroRue +" " +  pers2.getAdresse().libelleRue+" " +  pers2.getAdresse().codePostal+" " +  pers2.getAdresse().ville);

	}

}
