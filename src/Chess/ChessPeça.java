package Chess;

import Boardgame.Board;
import Boardgame.Pe�a;

public class ChessPe�a extends Pe�a{

	private Color color;

	public ChessPe�a(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
