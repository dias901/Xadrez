package Chess;

import Boardgame.Posição;
import Exception.ChessException;

public class ChessPosition {

	private char coluna;
	private int linha;
	
	public ChessPosition(char coluna, int linha) {
		if(coluna<'a' || coluna>'h' || linha<1 ||linha>8) {
			throw new ChessException("Digite um valor de a-h e 1-8");
		}
		this.linha=linha;
		this.coluna=coluna;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	public Posição toPosition() {
		return new Posição(8-linha,coluna-'a');
	}
	
	protected static ChessPosition fromPosition(Posição pos){
		return new ChessPosition((char)('a'-pos.getColuna()),8-pos.getLinha());
		//objetivo é ser o contrário do outro. no xadrez vc passa primeiro coluna, depois a linha
	}
	
	@Override
	public String toString() {
		return ""+coluna+linha;
		//força o compilador a entender que é uma concatenação de strings
	}
}
