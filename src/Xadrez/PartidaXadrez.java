package Xadrez;

import pecas.xadrez.Rei;
import pecas.xadrez.Torre;
import tabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	// Atributos
	private Tabuleiro tabuleiro;
	
	// Construtor
	public PartidaXadrez() {
		this.tabuleiro = new Tabuleiro(8, 8); // Essa classe (PartidaXadrez) que deve saber a dimens�o do tabuleiro
		iniciar();
	}
	
	// M�todos personalizados
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).paraPosicao());
	}
	
	private void iniciar() {
		colocarNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCA));
		colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETA));
		colocarNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCA));
	}
	
}
