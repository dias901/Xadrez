package chessPe�as;

import Boardgame.Board;
import Chess.ChessPe�a;
import Chess.Color;

public class King extends ChessPe�a{

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "K";
	}
	
}
