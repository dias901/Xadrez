package chessPešas;

import Boardgame.Board;
import Chess.ChessPeša;
import Chess.Color;

public class Rock extends ChessPeša{

	public Rock(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "R";
	}
	
}
