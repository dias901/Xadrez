package chessPe�as;

import Boardgame.Board;
import Chess.ChessPe�a;
import Chess.Color;

public class Queen extends ChessPe�a{

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "Q";
	}
	
}
