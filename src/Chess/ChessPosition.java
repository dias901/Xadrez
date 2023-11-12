package Chess;

import Boardgame.Posi��o;
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
	
	public Posi��o toPosition() {
		return new Posi��o(8-linha,coluna-'a');
	}
	
	protected static ChessPosition fromPosition(Posi��o pos){
		return new ChessPosition((char)('a'-pos.getColuna()),8-pos.getLinha());
		//objetivo � ser o contr�rio do outro. no xadrez vc passa primeiro coluna, depois a linha
	}
	
	@Override
	public String toString() {
		return ""+coluna+linha;
		//for�a o compilador a entender que � uma concatena��o de strings
	}
}
