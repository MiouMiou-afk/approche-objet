package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salaire salaire = new Salaire("Myriam","Agag",2500);
		
		System.out.println(salaire.getSalaire());
		salaire.afficheDonnees();
		
		Pigiste pigiste = new Pigiste("Anna","Souyri",20,450);
		
		System.out.println(pigiste.getSalaire());
		pigiste.afficheDonnees();

	}

}
