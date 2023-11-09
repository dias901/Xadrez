package Chess;

import Boardgame.Board;
import Boardgame.Peça;

public class ChessPeça extends Peça{

	private Color color;

	public ChessPeça(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
