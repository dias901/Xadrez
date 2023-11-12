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
	
	private void placeNewPe�a(char coluna, int linha, ChessPe�a pe�a) {
		board.placePe�a(pe�a, new ChessPosition(coluna,linha).toPosition());
	}
	
	private void inicialSetup() {
		placeNewPe�a('e',1,new King(board, Color.WHITE));
		placeNewPe�a('d',1,new Queen(board, Color.WHITE));
		placeNewPe�a('a',1,new Rock(board, Color.WHITE));
		placeNewPe�a('c',1,new Bispo(board, Color.WHITE));
		placeNewPe�a('b',1,new Horse(board, Color.WHITE));
		placeNewPe�a('h',1,new Rock(board, Color.WHITE));
		placeNewPe�a('f',1,new Bispo(board, Color.WHITE));
		placeNewPe�a('g',1,new Horse(board, Color.WHITE));
		
		for(int i=0;i<8;i++) {
		placeNewPe�a((char)(i-'a'),2,new Pe�o(board, Color.WHITE));
		}
		
		board.placePe�a(new King(board, Color.BLACK), new Posi��o(0,4));
		board.placePe�a(new Queen(board, Color.BLACK), new Posi��o(0,3));
		board.placePe�a(new Bispo(board, Color.BLACK), new Posi��o(0,2));
		board.placePe�a(new Horse(board, Color.BLACK), new Posi��o(0,1));
		board.placePe�a(new Rock(board, Color.BLACK), new Posi��o(0,0));
		board.placePe�a(new Bispo(board, Color.BLACK), new Posi��o(0,5));
		board.placePe�a(new Horse(board, Color.BLACK), new Posi��o(0,6));
		board.placePe�a(new Rock(board, Color.BLACK), new Posi��o(0,7));
		
		for(int i=0;i<8;i++) {
		board.placePe�a(new Pe�o(board, Color.BLACK), new Posi��o(1,i));
		}
	}
}
