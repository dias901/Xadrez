package Chess;

import Boardgame.Board;
import Boardgame.Posição;
import chessPeças.Bispo;
import chessPeças.Horse;
import chessPeças.King;
import chessPeças.Peão;
import chessPeças.Queen;
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
	
	private void placeNewPeça(char coluna, int linha, ChessPeça peça) {
		board.placePeça(peça, new ChessPosition(coluna,linha).toPosition());
	}
	
	private void inicialSetup() {
		placeNewPeça('e',1,new King(board, Color.WHITE));
		placeNewPeça('d',1,new Queen(board, Color.WHITE));
		placeNewPeça('a',1,new Rock(board, Color.WHITE));
		placeNewPeça('c',1,new Bispo(board, Color.WHITE));
		placeNewPeça('b',1,new Horse(board, Color.WHITE));
		placeNewPeça('h',1,new Rock(board, Color.WHITE));
		placeNewPeça('f',1,new Bispo(board, Color.WHITE));
		placeNewPeça('g',1,new Horse(board, Color.WHITE));
		
		for(int i=0;i<8;i++) {
		placeNewPeça((char)(i-'a'),2,new Peão(board, Color.WHITE));
		}
		
		board.placePeça(new King(board, Color.BLACK), new Posição(0,4));
		board.placePeça(new Queen(board, Color.BLACK), new Posição(0,3));
		board.placePeça(new Bispo(board, Color.BLACK), new Posição(0,2));
		board.placePeça(new Horse(board, Color.BLACK), new Posição(0,1));
		board.placePeça(new Rock(board, Color.BLACK), new Posição(0,0));
		board.placePeça(new Bispo(board, Color.BLACK), new Posição(0,5));
		board.placePeça(new Horse(board, Color.BLACK), new Posição(0,6));
		board.placePeça(new Rock(board, Color.BLACK), new Posição(0,7));
		
		for(int i=0;i<8;i++) {
		board.placePeça(new Peão(board, Color.BLACK), new Posição(1,i));
		}
	}
}
