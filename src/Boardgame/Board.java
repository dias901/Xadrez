package Boardgame;

public class Board {

	private int linha;
	private int coluna;
	private Peça[][] peças;
	
	public Board(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		peças = new Peça[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public Peça peça(int linha, int coluna) {
		return peças[linha][coluna];
	}
	
	public Peça peça(Posição posiçao) {
		return peças[posiçao.getLinha()][posiçao.getColuna()];
	}
	
	public void placePeça(Peça peça, Posição pos) {
		peças[pos.getLinha()][pos.getColuna()] = peça;
		peça.pos = pos;
	}
}
