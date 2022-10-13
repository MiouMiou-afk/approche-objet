package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre=new Theatre("Molière", 800, 780);
		theatre.inscription(45, 780);
		
		
		System.out.println(theatre.getCapaciterMax());
		
		System.out.println(theatre.getInscrit());
		
		System.out.println(theatre.getRecette());
	}

}
