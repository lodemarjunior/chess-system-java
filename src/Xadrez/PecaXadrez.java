package Xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {
	
	// Atributos
	private Cor cor;
	
	// Construtor
	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	// Métodos especiais
	public Cor getCor() {
		return cor;
	}

	// Somente o método get pois não pode deixar a cor ser modificada
	
	
	
	
}
