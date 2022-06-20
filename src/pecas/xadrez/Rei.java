package pecas.xadrez;

import Xadrez.Cor;
import Xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Rei extends PecaXadrez {
	
	// Construtor
	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		// TODO Auto-generated constructor stub
	}
	
	// Métodos persoanlizados
	@Override
	public String toString() {
		return "K";
	}
}
