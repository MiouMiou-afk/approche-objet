package fr.diginamic.banque.entites;

import java.util.Iterator;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte = new Compte(253, 656);
		System.out.println(compte.getNumCompte() + " " + compte.getsoldeCompte());
		System.out.println("avec toString : ");
		System.out.println(compte.toString());
		//tp7
		
 
		 

		Compte [ ] tabCompte = new Compte[2];
		tabCompte[0] = new Compte(253, 5963);
		tabCompte[1] =  new CompteTaux(25853, 59653, 2);
		System.out.println("tableau de compte : ");
		for(int i=0; i<tabCompte.length; i++) {
		System.out.println("compte n° "+i+" : " +tabCompte[i].toString());
		}

	}

}
