package chessParts;

public class SquareId {

	private char columnId;
	private int rowId;

	public SquareId(char columnId, int rowId) {
		this.columnId = columnId;
		this.rowId = rowId;
	}

	public SquareId(int squareNum) {// a1 =0, b1 = 1, ..., a2=8, b2 = 9...
		this.columnId = (char) (squareNum % 8 + 97);
		this.rowId = squareNum / 8 + 1;
	}

	public char getColumnId() {
		return columnId;
	}

	public int getRowId() {
		return rowId;
	}

	public void setColumnId(char columnId) {
		this.columnId = columnId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	@Override
	public String toString() {
		return columnId + "" + rowId;
	}

}
