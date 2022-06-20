package tabuleiro;

public class Tabuleiro {
	
	// Atributos
	private int linhas, colunas;
	private Peca[][] pecas;
		
	// Construtor
	public Tabuleiro(int linhas, int colunas) {
		if (linhas<1 || colunas<1) {
			throw new ExcecaoBorda("Erro ao criar tabuleiro. � necess�rio pelo menos uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	
	// M�todos especiais
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	// M�todos personalizados
	public Peca peca(int linha, int coluna) {
		if (!existePosicao(linha, coluna)) {
			throw new ExcecaoBorda("Posicao n�o existe no tabuleiro"); 
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExcecaoBorda("Posicao n�o existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if (temUmaPeca(posicao)) {
			throw new ExcecaoBorda("H� uma pe�a nessa posi��o " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean existePosicao(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExcecaoBorda("Posicao n�o existe no tabuleiro");
		}
		return peca(posicao) != null;
	}
}
