package chessPeças;

import Boardgame.Board;
import Chess.ChessPeça;
import Chess.Color;

public class Rock extends ChessPeça{

	public Rock(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "R";
	}
	
}
