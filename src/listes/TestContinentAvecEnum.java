package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
   

		ArrayList<Ville> listeVilles = new ArrayList<Ville>();
		listeVilles.add(new Ville("New York", 8380000,Continent.AMERIQUE));
		listeVilles.add(new Ville("Paris", 8380000,Continent.EUROPE));
		listeVilles.add(new Ville("Pékin", 8380000,Continent.ASIE));
		listeVilles.add(new Ville("Moscou", 8380000,Continent.EUROPE));
		listeVilles.add(new Ville("Berlin", 8380000,Continent.EUROPE));
		listeVilles.add(new Ville("Sydney", 8380000,Continent.OCEANIE));
		listeVilles.add(new Ville("Sao Paulo", 8380000,Continent.AMERIQUE));
		listeVilles.add(new Ville("Dakar", 8380000,Continent.AFRIQUE));
		
		for (int i = 0; i < listeVilles.size(); i++) {
			System.out.println(listeVilles.toString());
			
		}







	
	}

}
