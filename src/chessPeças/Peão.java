package chessPe�as;

import Boardgame.Board;
import Chess.ChessPe�a;
import Chess.Color;

public class Pe�o extends ChessPe�a{

	public Pe�o(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "P";
	}
	
}
