package utils;

import fr.diginamic.formes.Cercle;

public  class CercleFactory {

	double rayon;
	public CercleFactory(double rayon) {
		this.rayon = rayon;
		Cercle cercle = new Cercle(rayon);
	}

	public static Cercle createCercle(double rayon) {

		return new Cercle(rayon);

	}
	public  double perimetre() {
		return 0;
	}
	public  double surface();

}
