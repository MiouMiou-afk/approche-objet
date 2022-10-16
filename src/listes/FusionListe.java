package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {
	public static void main(String args[]) {

		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");

		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

//TODO Développements à réaliser ci-dessous

		ArrayList<String> liste3 = new ArrayList<String>(liste1);
		System.out.println(liste3.size());
		liste3.addAll(liste2);
		System.out.println(liste2.size());
		System.out.println(liste1.size());

		for (Iterator iterator = liste3.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		System.out.println(liste3.size());

	}
}
