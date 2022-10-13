package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations addition = new Operations(5, 5, '+');
		System.out.println(addition.calcul(5, 5, '+'));
		
		Operations soustraction = new Operations(5, 5, '-');
		System.out.println(soustraction.calcul(5, 5, '-'));
		
		Operations multiplication = new Operations(5, 5, '*');
		System.out.println(multiplication.calcul(5, 5, '*'));
		
		Operations division = new Operations(5, 5, '/');
		System.out.println(division.calcul(5, 5, '/'));
	}

}
