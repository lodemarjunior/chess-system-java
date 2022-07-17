package Xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public abstract class PecaXadrez extends Peca {
	
	// Atributos
	private Cor cor;
	private int contadorMovimento;
	
	// Construtor
	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	public PosicaoXadrez getPosicaoXadrez() {
		return PosicaoXadrez.dePosicao(posicao);
	}
	
	// M�todos especiais
	public Cor getCor() {
		return cor;
	}
	
	public int getContadorMovimento() {
		return contadorMovimento;
	}
	
	public void incrementarContadorMovimento() {
		contadorMovimento++;
	}
	
	public void decrementarContadorMovimento() {
		contadorMovimento--;
	}

	// Somente o m�todo get pois n�o pode deixar a cor ser modificada
	
	// M�todos personalizados
	protected boolean eUmaPecaAdversaria(Posicao posicao) {
		PecaXadrez p = (PecaXadrez)getTabuleiro().peca(posicao);
		return p != null && p.getCor() != cor;
	}
	
	
	
}
