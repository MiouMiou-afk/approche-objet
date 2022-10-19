package fr.diginamic.chainess;

public class TestStringBuilder {

	public static void main(String[] args) { 
		
		long debut = System.currentTimeMillis();
		// Code à chronométrer
		 StringBuilder builder = new StringBuilder();
		 for (int i = 0; i < 100000; i++) {
			 builder.append(i);
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

		
		long deb = System.currentTimeMillis();
		// Code à chronométrer
		 String string = new String();
		 for (int i = 0; i < 100000; i++) {
			 string+=i;
		}
		
		long f = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (f- deb));
	}
	
	//La classe StringBuilder est bien plus permformant que la classe  String

}
