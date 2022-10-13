package fr.diginamic.entities;

import utils.CercleFactory;

public class Cercle extends CercleFactory {
	double rayon;
	public Cercle(double rayon) {
		super(rayon);
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}


	
	@Override
	public double perimetre() {
		return  2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
}
