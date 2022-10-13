package fr.diginamic.formes;

public class Rectangle extends Forme{
	
	
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerPerimetre() {
		return longueur * 4;
	}

	@Override
	public double calculerSurface() {
		return longueur * largeur;
		
	}

	

}
