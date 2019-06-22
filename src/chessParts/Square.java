package chessParts;

import graphics.Colour;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {
	private SquareId id;
	private Colour colour;

	public Square(SquareId id, Colour colour) {
		this.id = id;
		this.colour = colour;
	}

	public Square(int squareNum) {
		this.id = new SquareId(squareNum);
		this.colour = squareNum % 2 == 0 ? this.id.getRowId() % 2 == 0 ? Colour.WHITE : Colour.BLACK
				: this.id.getRowId() % 2 == 0 ? Colour.BLACK : Colour.WHITE;
	}

	public SquareId getChessId() {
		return id;
	}

	public Colour getColour() {
		return colour;
	}

	public void setChessId(SquareId id) {
		this.id = id;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Colour: " + colour;
	}

}
