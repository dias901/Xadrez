package chessPe�as;

import Boardgame.Board;
import Chess.ChessPe�a;
import Chess.Color;

public class Rock extends ChessPe�a{

	public Rock(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "R";
	}
	
}
