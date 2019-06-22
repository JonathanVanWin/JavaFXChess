package chessParts;

public class ChessBoard {

	private Square[] squares;

	public ChessBoard(Square[] squares) {
		this.squares = squares;
	}

	public ChessBoard() {
		this.squares = new Square[64];
		for (int i = 0; i < this.squares.length; i++) {
			this.squares[i] = new Square(i);
			System.out.println(this.squares[i]);
		}
	}

	public Square[] getBoard() {
		return squares;
	}

	public void setBoard(Square[] squares) {
		this.squares = squares;
	}
	
	

}
