package Boardgame;

public class Posi��o {

	private Integer linha;
	private Integer coluna;
	
	public Posi��o(Integer linha, Integer coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public Integer getLinha() {
		return linha;
	}

	public void setLinha(Integer linha) {
		this.linha = linha;
	}

	public Integer getColuna() {
		return coluna;
	}

	public void setColuna(Integer coluna) {
		this.coluna = coluna;
	}
	
	@Override
	public String toString() {
		return linha+","+coluna;
	}
	
}
