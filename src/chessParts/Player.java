package chessParts;

import graphics.Colour;

public class Player {

	private Piece[] myPieces;
	private PlayerType type;

	public Player(Piece[] myPieces, PlayerType type) {
		this.myPieces = myPieces;
		this.type = type;
	}

	public Player(PlayerType type) {
		this.myPieces = new Piece[16];
		Colour c = type.compareTo(PlayerType.FIRST) == 0 ? Colour.WHITE : Colour.BLACK;
		for (int i = 0; i < this.myPieces.length; i++) {
			if (i < 8)
				this.myPieces[i] = new Piece(PieceType.PAWN, c, null);
			else if (i < 10)
				this.myPieces[i] = new Piece(PieceType.ROOK, c, null);
		}
		this.type = type;
	}

}
