package entities;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne pers1 = new Personne("Salma", "Hayekoum", new AdressePostale(22, "rue de Java", 13006, "Marseille"));
		//J'appelle la methode de la classe Personne qui permet de recuperer le nom et le prenom 
		String namePers = pers1.getName();
		String firstNamePers = pers1.getFirstName();
		System.out.println("le pers1 se nomme " + namePers + " " + firstNamePers);

		Personne pers2 = new Personne("toto", "lolo", new AdressePostale(22, "rue de Jva", 13006, "Marseille"));
		System.out.println("l'adresse est : " + pers2.getAdresse().getNumeroRue() + " "
				+ pers2.getAdresse().getLibelleRue() + " " + pers2.getAdresse().getCodePostal() + " " + pers2.getAdresse().getVille());
		
		//J'appelle la methode ma classe AdressePostale qui permet de modifier l'adresse 
		pers2.setAdresse(new AdressePostale(25, "rue de la paix", 34200, "Mont"));

		System.out.println("l'adresse est bien modifié : " +pers2.getAdresse().getNumeroRue()+ " "
				+ pers2.getAdresse().getLibelleRue()  + " " + pers2.getAdresse().getCodePostal()+ " " + pers2.getAdresse().getVille());

	}

}
