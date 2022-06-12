package tabuleiro;

public class Peca {
	
	// Atributos
	protected Posicao posicao; // Protegida porque essa posi��o ainda n�o � a posi��o do xadrez, � uma posi��o simples de MATRIZ, fazendo n�o ser vis�vel na camada de xadrez
	private Tabuleiro tabuleiro;
	
	// Construtor
	public Peca() {
	}
	
	public Peca(Tabuleiro tabuleiro) { // Somente o tabuleiro na hora de criar a pe�a (Construtor), pois a posi��o da uma pe�a rec�m criada vai ser nula, informando que essa pe�a n�o foi colocada no tabuleiro ainda
		this.tabuleiro = tabuleiro;
		this.posicao = null; // O JAVA automaticamente joga NULL para o atributo posicao, por�m foi inserido no construtor para ficar mais did�tico
	}
	
	// M�todos especiais
	protected Tabuleiro getTabuleiro() { // Protegida porque essa posi��o ainda n�o � a posi��o do xadrez, � uma posi��o simples de MATRIZ, fazendo n�o ser vis�vel na camada de xadrez
		return tabuleiro;
	}
	
	// O m�todo setTabuleiro foi removido para n�o deixar que o tabuleiro seja alterado, fazendo ele ser alterado somente pelo m�todo movimentosPossiveis()
	
	// M�todos personalizados
	
	
	
}
