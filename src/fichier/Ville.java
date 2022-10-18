package fichier;

public class Ville {
	
	String nom;
	int codeDep;
	String nameRegion;
	int popTotal;
	
	
	public Ville(String nom, int codeDep, String nameRegion, int popTotal) {

		this.nom = nom;
		this.codeDep = codeDep;
		this.nameRegion = nameRegion;
		this.popTotal = popTotal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  nom+ " " +  codeDep + " " + nameRegion + " " +  popTotal+ "\n" ;
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
