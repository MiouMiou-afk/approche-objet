package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte = new Compte(253, 656);
		System.out.println(compte.getNumCompte() + " "+ compte.getsoldeCompte());
		System.out.println(compte);

	}

}
