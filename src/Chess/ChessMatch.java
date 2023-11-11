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
	
	private void inicialSetup() {
		board.placePeça(new King(board, Color.WHITE), new Posição(7,4));
		board.placePeça(new Queen(board, Color.WHITE), new Posição(7,3));
		board.placePeça(new Rock(board, Color.WHITE), new Posição(7,0));
		board.placePeça(new Bispo(board, Color.WHITE), new Posição(7,2));
		board.placePeça(new Horse(board, Color.WHITE), new Posição(7,1));
		board.placePeça(new Rock(board, Color.WHITE), new Posição(7,7));
		board.placePeça(new Bispo(board, Color.WHITE), new Posição(7,5));
		board.placePeça(new Horse(board, Color.WHITE), new Posição(7,6));
		
		for(int i=0;i<8;i++) {
		board.placePeça(new Peão(board, Color.WHITE), new Posição(6,i));
		}
		
		board.placePeça(new King(board, Color.WHITE), new Posição(0,4));
		board.placePeça(new Queen(board, Color.WHITE), new Posição(0,3));
		board.placePeça(new Bispo(board, Color.WHITE), new Posição(0,2));
		board.placePeça(new Horse(board, Color.WHITE), new Posição(0,1));
		board.placePeça(new Rock(board, Color.WHITE), new Posição(0,0));
		board.placePeça(new Bispo(board, Color.WHITE), new Posição(0,5));
		board.placePeça(new Horse(board, Color.WHITE), new Posição(0,6));
		board.placePeça(new Rock(board, Color.WHITE), new Posição(0,7));
		
		for(int i=0;i<8;i++) {
		board.placePeça(new Peão(board, Color.WHITE), new Posição(1,i));
		}
	}
}
