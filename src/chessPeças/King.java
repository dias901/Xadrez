package chessPeças;

import Boardgame.Board;
import Chess.ChessPeça;
import Chess.Color;

public class King extends ChessPeça{

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "K";
	}
	
}
