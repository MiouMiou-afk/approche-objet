package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	int numbDay;
	int payDay;
	int salaire;
	public Pigiste( String firstName, String lastName,int payDay,int numbDay){
		super(firstName,lastName);
	 
		this.numbDay = numbDay;
		this.payDay = payDay;
		salaire = this.getSalaire();
	}
	
	@Override
	public int getSalaire() {
	 
		return numbDay*payDay;
	}
	
	public void afficheDonnees() {
		System.out.println("Le Pigiste : "+ this.getFirstName()+" "+this.getLastName()+" salaire "+this.getSalaire()+" status : Pigiste");
	}

}
