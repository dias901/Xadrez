package Boardgame;

public class Board {

	private int linha;
	private int coluna;
	private Pe�a[][] pe�as;
	
	public Board(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pe�as = new Pe�a[linha][coluna];
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
	
	public Pe�a pe�a(int linha, int coluna) {
		return pe�as[linha][coluna];
	}
	
	public Pe�a pe�a(Posi��o posi�ao) {
		return pe�as[posi�ao.getLinha()][posi�ao.getColuna()];
	}
	
	public void placePe�a(Pe�a pe�a, Posi��o pos) {
		pe�as[pos.getLinha()][pos.getColuna()] = pe�a;
		pe�a.pos = pos;
	}
}
