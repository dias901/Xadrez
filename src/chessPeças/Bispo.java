package chessPeças;

import Boardgame.Board;
import Chess.ChessPeça;
import Chess.Color;

public class Bispo extends ChessPeça{

	public Bispo(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "B";
	}
	
}
