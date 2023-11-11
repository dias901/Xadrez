package Chess;

import Boardgame.Board;
import Boardgame.Posi��o;
import chessPe�as.Bispo;
import chessPe�as.Horse;
import chessPe�as.King;
import chessPe�as.Pe�o;
import chessPe�as.Queen;
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
		board.placePe�a(new King(board, Color.WHITE), new Posi��o(7,4));
		board.placePe�a(new Queen(board, Color.WHITE), new Posi��o(7,3));
		board.placePe�a(new Rock(board, Color.WHITE), new Posi��o(7,0));
		board.placePe�a(new Bispo(board, Color.WHITE), new Posi��o(7,2));
		board.placePe�a(new Horse(board, Color.WHITE), new Posi��o(7,1));
		board.placePe�a(new Rock(board, Color.WHITE), new Posi��o(7,7));
		board.placePe�a(new Bispo(board, Color.WHITE), new Posi��o(7,5));
		board.placePe�a(new Horse(board, Color.WHITE), new Posi��o(7,6));
		
		for(int i=0;i<8;i++) {
		board.placePe�a(new Pe�o(board, Color.WHITE), new Posi��o(6,i));
		}
		
		board.placePe�a(new King(board, Color.WHITE), new Posi��o(0,4));
		board.placePe�a(new Queen(board, Color.WHITE), new Posi��o(0,3));
		board.placePe�a(new Bispo(board, Color.WHITE), new Posi��o(0,2));
		board.placePe�a(new Horse(board, Color.WHITE), new Posi��o(0,1));
		board.placePe�a(new Rock(board, Color.WHITE), new Posi��o(0,0));
		board.placePe�a(new Bispo(board, Color.WHITE), new Posi��o(0,5));
		board.placePe�a(new Horse(board, Color.WHITE), new Posi��o(0,6));
		board.placePe�a(new Rock(board, Color.WHITE), new Posi��o(0,7));
		
		for(int i=0;i<8;i++) {
		board.placePe�a(new Pe�o(board, Color.WHITE), new Posi��o(1,i));
		}
	}
}
