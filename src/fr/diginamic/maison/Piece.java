package fr.diginamic.maison;

public class Piece {
	
	int superficie;
	int numEtage;
	String name;
	
	public Piece(int superficie, int numEtage, String name) {
		this.superficie = superficie;
		this.numEtage = numEtage;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

	
	

}
