package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> liste = new ArrayList<Ville>(
				Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400),
						new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Marseille", 850700),
						new Ville("Pau", 77200), new Ville("Tarbes", 46600)));

		String villeMaxHab = "";
		int nbVilleHabMax = 0;
		int nbVilleHbPetit = 100000;
		String villeMinHab = "";
		int removeIndex = 0;
		int position = 0;

		Iterator<Ville> iterator = liste.iterator();
		while (iterator.hasNext()) {

			Ville ville = iterator.next();

			if (ville.getNbHabitant() > nbVilleHabMax) {
				nbVilleHabMax = ville.getNbHabitant();
				villeMaxHab = ville.getNom();
			}

			if (ville.getNbHabitant() < nbVilleHbPetit) {
				nbVilleHbPetit = ville.getNbHabitant();
				villeMinHab = ville.getNom();
				removeIndex = position;

			}
			position++;
		}

		liste.remove(removeIndex);

		for (Ville element : liste) {
			System.out.println(element.getNom() + " =>  " + element.getNbHabitant() + " habitants");
		}
		System.out.println("La ville la plus grande est  " + villeMaxHab + " avec " + nbVilleHabMax + " habitants");
		System.out.println("La ville la plus petite est  " + villeMinHab + " avec " + nbVilleHbPetit + " habitants");

		Iterator<Ville> iterator1 = liste.iterator();
		while (iterator1.hasNext()) {

			Ville ville = iterator1.next();
			if (ville.getNbHabitant() > nbVilleHbPetit) {
				String updateNameString = ville.getNom().toUpperCase();
				ville.setNom(updateNameString);
			}
			System.out.println(ville.getNom());
		}

		Ville ville1 = new Ville("Aix", 22);
		Ville ville2 = new Ville("Aix", 22);
		System.out.println(ville1.equals(ville2)); // true
		System.out.println(ville1 == ville2);//false attention a l'utilisation de "==" marche pour les primitifs mais pas stable pour les objets
		// == compare les adresses mémoire, ici false car deux memoires differentes 

		Ville ville3 = new Ville("Aix", 22);
		Ville ville4 = new Ville("Aix", 3);
		System.out.println(ville3.equals(ville4)); // false car le deuxième paramètre est diffèrent 
		


	}

}
