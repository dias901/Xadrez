package Chess;

import Boardgame.Board;
import Boardgame.Posição;
import chessPeças.King;
import chessPeças.Rock;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		inicialSetup();
	}
	
	public ChessPeça[][] getPeças(){
		ChessPeça[][] mat = new ChessPeça[board.getLinha()][board.getColuna()];
		for(int i=0; i<board.getLinha();i++) {
			for(int j=0;j<board.getColuna();j++) {
				mat[i][j] = (ChessPeça) board.peça(i,j);
			}
		}
		return mat;
	}
	
	private void inicialSetup() {
		board.placePeça(new Rock(board, Color.WHITE), new Posição(2,2));
		board.placePeça(new King(board, Color.WHITE), new Posição(2,1));
	}
}
