package Xadrez;

import pecas.xadrez.Rei;
import pecas.xadrez.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	// Atributos
	private Tabuleiro tabuleiro;
	
	// Construtor
	public PartidaXadrez() {
		this.tabuleiro = new Tabuleiro(8, 8); // Essa classe (PartidaXadrez) que deve saber a dimensão do tabuleiro
		iniciar();
	}
	
	// Métodos personalizados
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}

	private void iniciar() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCA), new Posicao(2, 1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETA), new Posicao(0, 4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCA), new Posicao(7, 4));
	}
	
}
