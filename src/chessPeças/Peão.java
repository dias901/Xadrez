package chessPeças;

import Boardgame.Board;
import Chess.ChessPeça;
import Chess.Color;

public class Peão extends ChessPeça{

	public Peão(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "P";
	}
	
}
