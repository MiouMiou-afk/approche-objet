package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum Saison { PRINTEMPS, ETE, AUTOMNE, HIVER} ; 
		Saison[] saisons = Saison.values();
//		System.out.println(saisons);
//		String nomString =Saison.ETE.name();
//		System.out.println(nomString);
		String string = "ETE";
		for (Saison saison : saisons) {
			if(saison.compareTo(string)) {
				System.out.println(saison.getNom());

			}
			}
		
		 String libelle = "Hiver";
		 for (Saison saison : saisons) {
				if(saison.compareTo(libelle)) {
					System.out.println(saison.getNom());

				}
				}
		
		
	}

}
