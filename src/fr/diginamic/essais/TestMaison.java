package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison = new Maison(null);
		maison.ajouterPiece(new SalleDeBain(18,1, "SALLE DE BAIN")); 
		maison.ajouterPiece(new Salon(45, 0, "SALON"));
		maison.ajouterPiece(new WC(9, 1, "WC"));
		maison.ajouterPiece(new Cuisine(45, 0, "CUISINE"));
		maison.ajouterPiece(new Chambre(25, 1, "CHAMBRE"));
		maison.ajouterPiece(new Chambre(25, 1, "CHAMBRE"));
		
 
	}

}
