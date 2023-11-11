package chessPešas;

import Boardgame.Board;
import Chess.ChessPeša;
import Chess.Color;

public class Bispo extends ChessPeša{

	public Bispo(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "B";
	}
	
}
