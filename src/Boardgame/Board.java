package Boardgame;

import Exception.BoardException;

public class Board {

	private int linha;
	private int coluna;
	private Peça[][] peças;
	
	public Board(int linha, int coluna) {
		if(linha<1 || coluna <1) {
			throw new BoardException("Tabuleiro não pode ser criado. Valor minimo: 1");
		}
		this.linha = linha;
		this.coluna = coluna;
		peças = new Peça[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	public Peça peça(int linha, int coluna) {
		if(!PosiçaoExist(linha,coluna)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return peças[linha][coluna];
	}
	
	public void placePeça(Peça peça, Posição pos) {
		if(therePeça(pos.getLinha(),pos.getColuna())) {
			throw new BoardException("Já existe uma peça na posição: "+pos.getLinha()+","+pos.getColuna());
		}
		peças[pos.getLinha()][pos.getColuna()] = peça;
		peça.pos = pos;
	}
	
	public boolean PosiçaoExist(int linhas, int colunas) {
		return linhas >=0 && linhas<linha && colunas >=0 && colunas<coluna;
	}
	
	public boolean therePeça(int linha, int coluna) {
		if(!PosiçaoExist(linha, coluna)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return peça(linha,coluna) != null;
	}
}
