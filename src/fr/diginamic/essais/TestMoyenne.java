package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;


public class TestMoyenne {

	
		public static void main(String[] args){
			// TODO Auto-generated method stub
			CalculMoyenne moyennne =new CalculMoyenne(10);

			moyennne.addTab(89);
			moyennne.addTab(24);
			moyennne.addTab(26);
			moyennne.addTab(32);
			moyennne.printTab();
			System.out.println("La moyenne de ses valeurs est : " + moyennne.getMoyenne());		
		}

	}

