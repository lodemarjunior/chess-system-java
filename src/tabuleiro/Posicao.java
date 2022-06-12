package tabuleiro;

public class Posicao {
	
	// Atributos
	private int linha, coluna;
	
	// Construtor
	public Posicao() {
	}
	
	public Posicao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	// Métodos especiais
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
	
	// Métodos personalizados
	public void setarValores(int linha, int coluna) {
		setLinha(linha);
		setColuna(coluna);
	}
	
	@Override
	public String toString() {
		return linha+", "+coluna;
	}
}