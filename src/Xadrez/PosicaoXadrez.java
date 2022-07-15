package Xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {
	
	// Atributos
	private char coluna;
	private int linha;
	
	// Construtor
	public PosicaoXadrez(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ExcecaoXadrez("Erro ao instanciar a posi��o de xadrez. Valores v�lidos s�o de A1 at� H8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	
	// M�todos especiais
	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	// M�todos personalizados
	protected Posicao paraPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	protected static PosicaoXadrez dePosicao(Posicao posicao) {
		return new PosicaoXadrez((char)('a' + posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
