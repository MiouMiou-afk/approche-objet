package listes;

import java.util.ArrayList;


public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> liste = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			liste.add(i);
			System.out.println(liste.get(i));
		}
		System.out.println(liste.size());
		
	}

}
