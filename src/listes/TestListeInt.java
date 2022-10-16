package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listeInt = new ArrayList<Integer>();
		listeInt.add(-1);
		listeInt.add(5);
		listeInt.add(7);
		listeInt.add(3);
		listeInt.add(-2);
		listeInt.add(4);
		listeInt.add(8);
		listeInt.add(5);

		for (Iterator iterator = listeInt.iterator(); iterator.hasNext();) {
			Integer string = (Integer) iterator.next();
			System.out.println(string);
		}

		System.out.println("Taille de la liste : " + listeInt.size());

		int maxValue = 0;

		for (Integer integer : listeInt) {
			if (integer > maxValue)
				maxValue = integer;
		}
		System.out.println("La valeur max est  " + maxValue);

		int minValue = 0;

		for (Integer integer : listeInt) {
			if (integer < minValue)
				minValue = integer;
		}
		System.out.println("La valeur min est  " + minValue);

		int position = 0;
		int posi = 0;
		for (Integer integer2 : listeInt) {
			if (integer2 < 0) {
				integer2 = Math.abs(integer2);
				posi = position;
				listeInt.set(posi, integer2);

			}
			position++;

			System.out.println(listeInt);
		}

	}

}
