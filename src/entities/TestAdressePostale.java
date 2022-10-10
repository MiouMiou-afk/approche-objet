package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 60;
		adr1.libelleRue = "rue des Loriots";
		adr1.codePostal = 34200;
		adr1.ville = "Sète";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 22;
		adr2.libelleRue ="rue de la java";
		adr2.codePostal = 13006;
		adr2.ville = "Marseille";

	}

}
