package chessPešas;

import Boardgame.Board;
import Chess.ChessPeša;
import Chess.Color;

public class King extends ChessPeša{

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "K";
	}
	
}
