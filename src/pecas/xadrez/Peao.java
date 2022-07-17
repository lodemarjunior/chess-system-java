package pecas.xadrez;

import Xadrez.Cor;
import Xadrez.PecaXadrez;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Peao extends PecaXadrez {

	public Peao(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		
		Posicao p = new Posicao(0, 0);
		
		if (getCor()==Cor.BRANCA) {
			p.setarValores(posicao.getLinha() - 1, posicao.getColuna());
			if (getTabuleiro().existePosicao(p) && !getTabuleiro().temUmaPeca(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setarValores(posicao.getLinha() - 2, posicao.getColuna());
			Posicao p2 = new Posicao(posicao.getLinha() - 1, posicao.getColuna());
			if (getTabuleiro().existePosicao(p) && !getTabuleiro().temUmaPeca(p) && getTabuleiro().existePosicao(p2) && !getTabuleiro().temUmaPeca(p2) && getContadorMovimento()==0) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setarValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
			if (getTabuleiro().existePosicao(p) && eUmaPecaAdversaria(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setarValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
			if (getTabuleiro().existePosicao(p) && eUmaPecaAdversaria(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
		} else {
			p.setarValores(posicao.getLinha() + 1, posicao.getColuna());
			if (getTabuleiro().existePosicao(p) && !getTabuleiro().temUmaPeca(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setarValores(posicao.getLinha() + 2, posicao.getColuna());
			Posicao p2 = new Posicao(posicao.getLinha() + 1, posicao.getColuna());
			if (getTabuleiro().existePosicao(p) && !getTabuleiro().temUmaPeca(p) && getTabuleiro().existePosicao(p2) && !getTabuleiro().temUmaPeca(p2) && getContadorMovimento()==0) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setarValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
			if (getTabuleiro().existePosicao(p) && eUmaPecaAdversaria(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
			p.setarValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
			if (getTabuleiro().existePosicao(p) && eUmaPecaAdversaria(p)) {
				mat[p.getLinha()][p.getColuna()] = true;
			}
		}
		
		return mat;
	}
	
	@Override
	public String toString() {
		return "P";
	}	
}
