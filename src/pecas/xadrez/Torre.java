package pecas.xadrez;

import Xadrez.Cor;
import Xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Torre extends PecaXadrez {
		
	// Construtor
	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		// TODO Auto-generated constructor stub
	}
	
	// M�todos persoanlizados
	@Override
	public String toString() {
		return "R";
	}

}