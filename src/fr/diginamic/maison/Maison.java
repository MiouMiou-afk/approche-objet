package fr.diginamic.maison;

public class Maison {

	private Piece[] Tabpiece = new Piece[1];
	private Piece piece;
	private String pieceInHouse;

	public Maison(Piece piece) {
		this.Tabpiece[0] = piece;
		this.piece = piece;

	}

	public void ajouterPiece(Piece piece) {

		if (piece == null) {
			System.out.println("La maison n'a pas de pièce");
		} else {
			if ((piece.getNumEtage() >= 0 && piece.getSuperficie() > 0)) {
				Piece[] newPiece = new Piece[this.Tabpiece.length + 1];
				for (int i = 0; i < this.Tabpiece.length; i++) {
					newPiece[i] = this.Tabpiece[i];
				}
				newPiece[newPiece.length - 1] = piece;

				this.Tabpiece = newPiece;
				System.out.println("La " + piece.getName() + " a bien été ajouté à la maison");
			} else {

				System.out.println("ERREUR lors de l'ajout :  nom : " + piece.getName() + "  étage : "
						+ piece.getNumEtage() + " superficie : " + piece.getSuperficie());
			}
		}
	}

	public void surfaceGlobalTypePiece(String TypePiece) {

		double superficieTotal = 0;
		String nameString = null;

		for (int i = 0; i < this.Tabpiece.length; i++) {
			nameString = Tabpiece[i].getName();

			if (nameString.equals(TypePiece)) {
				superficieTotal = superficieTotal + this.Tabpiece[i].getSuperficie();
			}
		}
		System.out.println(" La surface de(s) " + TypePiece + " (s)est de : " + superficieTotal);

	}

	public void nombreTypePiece(String TypePiece) {
		int nbPiece = 0;
		String nameString = null;
		for (int i = 0; i < Tabpiece.length; i++) {
			nameString = Tabpiece[i].getName();

			if (nameString.equals(TypePiece)) {
				nbPiece++;
			}
		}
		System.out.println(" Nombre de " + TypePiece + " est de :" + nbPiece);
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

	public String getPieceInHouse() {
		return pieceInHouse;
	}

	public void setPieceInHouse(String pieceInHouse) {
		this.pieceInHouse = pieceInHouse;
	}

}
