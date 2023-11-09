package Boardgame;

public class Peça {

	protected Posição pos;
	private Board board;
	
	public Peça(Board board) {
		this.board=board;
	}

	protected Board getBoard() {
		return board;
	}
	
}