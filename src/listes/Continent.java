package listes;

public enum Continent {
	AFRIQUE("Afrique"), AMERIQUE("Amerique"), ASIE("Asie"), EUROPE("Europe"), OCEANIE("Oceanie");

	private String nom;

	private Continent(String nom) {
		this.nom = nom;
	}

	boolean compareTo(String string) {
		// TODO Auto-generated method stub
		if (this.nom == string) {
			return true;
		} else {
			return false;

		}
	}
}
