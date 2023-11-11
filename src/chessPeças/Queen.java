package chessPešas;

import Boardgame.Board;
import Chess.ChessPeša;
import Chess.Color;

public class Queen extends ChessPeša{

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString(){
		return "Q";
	}
	
}
