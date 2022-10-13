package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(4);
		Cercle cercle2 = new Cercle(7);
		
		double perimetre1 = cercle1.perimetre();
		System.out.println("le permiétre du cercle 1 est : " +perimetre1);
		
		double perimetre2 = cercle2.perimetre();
		System.out.println("le permiétre du cercle 2 est : " +perimetre2);
		
		double surface1 = cercle1.surface();
		System.out.println("La surface du cercle 1 est : "+surface1);
		
		double surface2 = cercle2.surface();
		System.out.println("La surface du cercle 2 est : "+surface2);
	}
	

}
