package map;

import java.util.HashMap;
import java.util.Map;

public class mapVille {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();

		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		System.out.println("Boucle for qui affiche les clé et les valeurs de ma map:");
		for (Map.Entry mapentry : mapVilles.entrySet()) {
			System.out.println("clé: " + mapentry.getKey() + " | valeur: " + mapentry.getValue());
		}
		System.out.println("Taille de la map : " + mapVilles.size());
	}

}
