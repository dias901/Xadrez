package Chess;

import Boardgame.Board;
import Boardgame.Posi��o;
import chessPe�as.King;
import chessPe�as.Rock;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		inicialSetup();
	}
	
	public ChessPe�a[][] getPe�as(){
		ChessPe�a[][] mat = new ChessPe�a[board.getLinha()][board.getColuna()];
		for(int i=0; i<board.getLinha();i++) {
			for(int j=0;j<board.getColuna();j++) {
				mat[i][j] = (ChessPe�a) board.pe�a(i,j);
			}
		}
		return mat;
	}
	
	private void inicialSetup() {
		board.placePe�a(new Rock(board, Color.WHITE), new Posi��o(2,2));
		board.placePe�a(new King(board, Color.WHITE), new Posi��o(2,1));
	}
}
