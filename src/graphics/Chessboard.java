package graphics;

import chessParts.ChessBoard;
import chessParts.Square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Chessboard extends Application {
	GridPane root = new GridPane();
	final int size = 8;
	private ChessBoard cb;
	private static Chessboard instance;

	public Chessboard() {
		instance = this;
		this.cb = new ChessBoard();
	}

	public synchronized static Chessboard getInstance() {

		if (instance == null) {
			Thread thread = new Thread("New Thread") {
				public void run() {
					Application.launch(Chessboard.class);
				}
			};
			while (instance == null)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		return instance;
	}

	public void start(Stage primaryStage) {
		for (int i = 0; i < cb.getBoard().length; i++) {
			Square square = cb.getBoard()[i];
			square.setFill(square.getColour().compareTo(Colour.BLACK) == 0 ? Color.WHITE : Color.BLACK);
			root.add(square, square.getChessId().getColumnId() - 97, square.getChessId().getRowId() - 1);
			square.widthProperty().bind(root.widthProperty().divide(size));
			square.heightProperty().bind(root.heightProperty().divide(size));
		}
		primaryStage.setScene(new Scene(root, 400, 400));

		primaryStage.show();
	}

}