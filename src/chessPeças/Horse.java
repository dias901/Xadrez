package chessPeças;

import Boardgame.Board;
import Chess.ChessPeça;
import Chess.Color;

public class Horse extends ChessPeça{

	public Horse(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "H";
	}
	
}
