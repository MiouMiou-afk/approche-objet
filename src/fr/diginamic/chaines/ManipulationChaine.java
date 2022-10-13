package fr.diginamic.chaines;
 

public class ManipulationChaine {

	public static void main(String[] args) {
	 
		String chaine= "Durand;Marcel;2523.5";
		
		//Utilisez la méthode charAt(int index)pour afficher le premier caractère de la chaine de caractères.
		char premierCaractere= chaine.charAt(0);
		System.out.println("Premier caractère : "+ premierCaractere);
		
		//Utilisez la méthode length()pour afficher la longueur de la chaine de caractères
		int longueurChaine = chaine.length();
		System.out.println("Longueur de la chaine : "+ longueurChaine);
		
		//Utilisez la méthode indexOf(char c)pour afficher l’index du premier «;» contenu dans la chaine de caractères.
		int indexOfSemicolon = chaine.indexOf(";");
		System.out.println("Index du premier point-virgule : "+ indexOfSemicolon);
		
		//Combinez  la méthode substring et indexOfpour extraire lenom  de  famille  de  la personne.
		String boutChaine = chaine.substring((indexOfSemicolon));
		System.out.println(boutChaine);
		String lastName = chaine.replaceAll(boutChaine, "");
		System.out.println("Nom de famille : " + lastName);

		
		
		
	}
}
