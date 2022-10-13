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
		Maison maison = new Maison(new SalleDeBain(18, 1, "Salle de Bain"));
		maison.ajouterPiece(new Salon(45, 0, "Salon"));
		maison.ajouterPiece(new WC(5, 1, "WC"));
		maison.ajouterPiece(new Cuisine(45, 15,"Cuisine"));
		maison.ajouterPiece(new Chambre(25, 1, "Chambre"));
		maison.ajouterPiece(new Chambre(25, 1, "Chambre"));
		maison.ajouterPiece(new Chambre(25, 1, "Chambre"));

		System.out.println(maison.getTabpiece().length);

		maison.surfaceGlobalTypePiece("Chambre");
		maison.nombreTypePiece("Chambre");
		
		maison.surfaceGlobalTypePiece("Cuisine");
		maison.nombreTypePiece("Cuisine");
		
		maison.surfaceGlobalTypePiece("Salle de Bain");
		maison.nombreTypePiece("Salle de Bain");
		
		maison.surfaceGlobalTypePiece("Salon");
		maison.nombreTypePiece("Salon");
		
		maison.surfaceGlobalTypePiece("WC");
		maison.nombreTypePiece("WC");
		
	

} 
}