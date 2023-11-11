package chessPeças;

import Boardgame.Board;
import Chess.ChessPeça;
import Chess.Color;

public class Queen extends ChessPeça{

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "Q";
	}
	
}
