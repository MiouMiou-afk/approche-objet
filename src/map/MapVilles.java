package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import tri.ComparatorHabitant;
import tri.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Carcassonne", 47800);
		Ville v3 = new Ville("Narbonne", 53400);
		Ville v4 = new Ville("Lyon", 484000);
		Ville v5 = new Ville("Foix", 9700);
		Ville v6 = new Ville("Marseille", 850700);
		Ville v7 = new Ville("Pau", 77200);
		Ville v8 = new Ville("Tarbes", 46600);

		HashMap<String, Ville> mapVilles = new HashMap<>();

		mapVilles.put(v1.getNom(), v1);
		mapVilles.put(v2.getNom(), v2);
		mapVilles.put(v3.getNom(), v3);
		mapVilles.put(v4.getNom(), v4);
		mapVilles.put(v5.getNom(), v5);
		mapVilles.put(v6.getNom(), v6);
		mapVilles.put(v7.getNom(), v7);
		mapVilles.put(v8.getNom(), v8);

		int nbMinHab = Integer.MAX_VALUE;
		String indexSup = "";
		
		for (String cle : mapVilles.keySet()) {
			
			if (mapVilles.get(cle).getNbHabitant() < nbMinHab) {
				
				nbMinHab = mapVilles.get(cle).getNbHabitant();
				indexSup = cle;
			}
			
			System.out.println("Ville : " + cle + " => value : " + mapVilles.get(cle));
		}
		
		System.out.println("La plus petite ville est : " + mapVilles.get(indexSup));
		
		mapVilles.remove(indexSup);
		System.out.println(mapVilles.entrySet());

	}

}
