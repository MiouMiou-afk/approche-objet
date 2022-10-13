package utils;

import fr.diginamic.formes.Cercle;

public class CercleFactory {

	public static Cercle createCercle(double rayon) {
		
		return new Cercle(rayon);
		
	}
}
