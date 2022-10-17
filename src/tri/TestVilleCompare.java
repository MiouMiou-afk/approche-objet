package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestVilleCompare {
	
	

	public static void main(String[] args) {
		
		List<Ville> liste = new ArrayList<Ville>(
				Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400),
						new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Marseille", 850700),
						new Ville("Pau", 77200), new Ville("Tarbes", 46600)));

		// tri par ordre alphabetique
//		Collections.sort(liste);
//		for (Ville element : liste) {
//			System.out.println(element.getNom());
//		}
		
		
		//tri par nombre d'habitants
//		Collections.sort(liste);
//		for (Ville element : liste) {
//			System.out.println(element.getNom()+" => "+ element.getNbHabitant()+" habitants;");
//		}
		
		
		
		///tri en implementant le comparator
			System.out.println("Tri par nombre d'habitant \n ");

		Collections.sort(liste, new ComparatorHabitant());
		for (Ville element : liste) {
 			System.out.println(element.getNom()+" => "+ element.getNbHabitant()+" habitants;");
 		}
		System.out.println(" \n ");
		System.out.println("Tri par nom de ville \n ");
		Collections.sort(liste, new ComparatorNom());
		for (Ville element : liste) {
 			System.out.println(element.getNom()+" => "+ element.getNbHabitant()+" habitants;");
 			System.out.println(element.toString());

 		}
		
	}

}
