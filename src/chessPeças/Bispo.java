package chessPe�as;

import Boardgame.Board;
import Chess.ChessPe�a;
import Chess.Color;

public class Bispo extends ChessPe�a{

	public Bispo(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "B";
	}
	
}
