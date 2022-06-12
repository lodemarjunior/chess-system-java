package tabuleiro;

public class Peca {
	
	// Atributos
	protected Posicao posicao; // Protegida porque essa posição ainda não é a posição do xadrez, é uma posição simples de MATRIZ, fazendo não ser visível na camada de xadrez
	private Tabuleiro tabuleiro;
	
	// Construtor
	public Peca() {
	}
	
	public Peca(Tabuleiro tabuleiro) { // Somente o tabuleiro na hora de criar a peça (Construtor), pois a posição da uma peça recém criada vai ser nula, informando que essa peça não foi colocada no tabuleiro ainda
		this.tabuleiro = tabuleiro;
		this.posicao = null; // O JAVA automaticamente joga NULL para o atributo posicao, porém foi inserido no construtor para ficar mais didático
	}
	
	// Métodos especiais
	protected Tabuleiro getTabuleiro() { // Protegida porque essa posição ainda não é a posição do xadrez, é uma posição simples de MATRIZ, fazendo não ser visível na camada de xadrez
		return tabuleiro;
	}
	
	// O método setTabuleiro foi removido para não deixar que o tabuleiro seja alterado, fazendo ele ser alterado somente pelo método movimentosPossiveis()
	
	// Métodos personalizados
	
	
	
}
