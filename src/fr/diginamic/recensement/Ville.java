package fr.diginamic.recensement;

public class Ville  {
	
	int codeRegion;
	String nameRegion;
	int codeDep;
	int codeCommune;
	String nom;
	int popTotal;
	
	
	
	public Ville  (int codeRegion, String nameRegion, int codeDep, int codeCommune,String nom, int popTotal ) {
		this.codeCommune =codeCommune;
		this.nom = nom;
		this.codeDep = codeDep;
		this.nameRegion = nameRegion;
		this.popTotal = popTotal;
		this.codeRegion =codeRegion;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  codeRegion+ " " +  nameRegion + " " + codeDep + " " +  codeCommune+" " + nom+" " +popTotal+" " +popTotal+"\n" ;
	}
	
	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}


	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCodeDep() {
		return codeDep;
	}
	public void setCodeDep(int codeDep) {
		this.codeDep = codeDep;
	}
	public String getNameRegion() {
		return nameRegion;
	}
	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}
	public int getPopTotal() {
		return popTotal;
	}
	public void setPopTotal(int popTotal) {
		this.popTotal = popTotal;
	}
	

}
