package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte = new Compte(253, 656);
		System.out.println(compte.getNumCompte() + " " + compte.getsoldeCompte());
		System.out.println(compte.toString());
		//Il faut des getteurs dans la classe Compte pour pouvoir afficher les informations
		//ou créer une methode toString() dans la classe qui permet d'afficher les informations que l'on souhaite 
		//exo tp6

	}

}
