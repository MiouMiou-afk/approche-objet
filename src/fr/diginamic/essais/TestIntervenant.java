package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salaire salaire = new Salaire("Myriam", "Agag", "CDI", 2500);
		System.out.println(salaire.getSalaire());
		salaire.afficheDonnees();

		Salaire salaire2 = new Salaire("Miette", "Minette", "CDD", 2100);
		System.out.println(salaire2.getSalaire());
		salaire2.afficheDonnees();

		Pigiste pigiste = new Pigiste("Anna", "Souyri", 20, 450);
		System.out.println(pigiste.getSalaire());
		pigiste.afficheDonnees();

	}

}
