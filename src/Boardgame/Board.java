package Boardgame;

import Exception.BoardException;

public class Board {

	private int linha;
	private int coluna;
	private Pe�a[][] pe�as;
	
	public Board(int linha, int coluna) {
		if(linha<1 || coluna <1) {
			throw new BoardException("Tabuleiro n�o pode ser criado. Valor minimo: 1");
		}
		this.linha = linha;
		this.coluna = coluna;
		pe�as = new Pe�a[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	public Pe�a pe�a(int linha, int coluna) {
		if(!Posi�aoExist(linha,coluna)) {
			throw new BoardException("Posi��o fora do tabuleiro");
		}
		return pe�as[linha][coluna];
	}
	
	public void placePe�a(Pe�a pe�a, Posi��o pos) {
		if(therePe�a(pos.getLinha(),pos.getColuna())) {
			throw new BoardException("J� existe uma pe�a na posi��o: "+pos.getLinha()+","+pos.getColuna());
		}
		pe�as[pos.getLinha()][pos.getColuna()] = pe�a;
		pe�a.pos = pos;
	}
	
	public boolean Posi�aoExist(int linhas, int colunas) {
		return linhas >=0 && linhas<linha && colunas >=0 && colunas<coluna;
	}
	
	public boolean therePe�a(int linha, int coluna) {
		if(!Posi�aoExist(linha, coluna)) {
			throw new BoardException("Posi��o fora do tabuleiro");
		}
		return pe�a(linha,coluna) != null;
	}
}
