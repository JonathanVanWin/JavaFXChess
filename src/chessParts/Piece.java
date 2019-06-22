package chessParts;

import graphics.Colour;

public class Piece {
	private PieceType type;
	private Colour colour;
	private Square onSquare;

	public Piece(PieceType type, Colour colour, Square onSquare) {
		this.type = type;
		this.colour = colour;
		this.onSquare = onSquare;
	}

	private PieceType getType() {
		return type;
	}

	private Colour getColour() {
		return colour;
	}

	private Square getOnSquare() {
		return onSquare;
	}

	private void setType(PieceType type) {
		this.type = type;
	}

	private void setColour(Colour colour) {
		this.colour = colour;
	}

	private void setOnSquare(Square onSquare) {
		this.onSquare = onSquare;
	}

}
