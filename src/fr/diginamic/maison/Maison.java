package fr.diginamic.maison;

public class Maison{
 
	private Piece[] Tabpiece = new Piece[1];
	private Piece piece;
	
	public  Maison(Piece   piece) {
		this.Tabpiece[0]= piece;
		this.piece = piece;
		
	}
	
	public void ajouterPiece(Piece piece) {

		if (piece == null) {
			System.out.println("Veuillez renseigner une piece");
		} else {
			if ((piece.getNumEtage() >= 0 && piece.getSuperficie() > 0)) {
				Piece[] newPiece = new Piece[this.Tabpiece.length + 1];
				for (int i = 0; i < this.Tabpiece.length; i++) {
					newPiece[i] = this.Tabpiece[i];
				}
				newPiece[newPiece.length - 1] = piece;

				this.Tabpiece = newPiece;
				System.out.println("La " + piece.getName() + " a bien été ajouté dans la maison");
			} else {
				System.out.println("on peut pas mettre une surface egale a zero ou une piece null ");
				System.out.println(
						"Il y a une erreur lors de l'ajout veuillez verifier les informations suivantes : Etage => "
								+ piece.getNumEtage() + " Superficie => " + piece.getSuperficie());
			}
		}
		
	}

	public Piece[] getTabpiece() {
		return Tabpiece;
	}

	public void setTabpiece(Piece[] tabpiece) {
		this.Tabpiece = tabpiece;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	

}
