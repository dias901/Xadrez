package chessPe�as;

import Boardgame.Board;
import Chess.ChessPe�a;
import Chess.Color;

public class Horse extends ChessPe�a{

	public Horse(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "H";
	}
	
}
