package fr.diginamic.formes;


public abstract class Forme {
	
	public abstract double calculerSurface();
	public abstract double calculerPerimetre(); 
	
	public static void afficher(Forme forme) {
		System.out.println("Perimetre : "+forme.calculerPerimetre());
		System.out.println("Surface : "+forme.calculerSurface());
	
	}

	
}
