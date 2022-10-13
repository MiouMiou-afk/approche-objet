package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class AffichageForme {
	
	public static void main(String[] args){ 
		Forme rectangle = new Rectangle(2, 3);
		System.out.println("La surface du rectangle : " + rectangle.calculerSurface());
		System.out.println("Le Perimetre du rectangle : " + rectangle.calculerPerimetre());
		
		Forme carre = new Carre(3);
		System.out.println("La surface du carre : " + carre.calculerSurface());
		System.out.println("Le Perimetre du carre : " + carre.calculerPerimetre());
		
		Forme cercle = new Cercle(4);
		System.out.println("La surface du cercle : " + cercle.calculerSurface());
		System.out.println("Le Perimetre du cercle : " + cercle.calculerPerimetre());
	}

	
	
	 

}
