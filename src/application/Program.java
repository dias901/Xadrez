	package application;

import Chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch css = new ChessMatch();
		UI.printBoard(css.getPeças());
	}
}
