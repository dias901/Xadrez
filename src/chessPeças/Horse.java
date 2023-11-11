package chessPešas;

import Boardgame.Board;
import Chess.ChessPeša;
import Chess.Color;

public class Horse extends ChessPeša{

	public Horse(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "H";
	}
	
}
