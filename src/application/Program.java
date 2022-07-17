package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Xadrez.ExcecaoXadrez;
import Xadrez.PartidaXadrez;
import Xadrez.PecaXadrez;
import Xadrez.PosicaoXadrez;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		List<PecaXadrez> capturado = new ArrayList<>();
		
		while (!partidaXadrez.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.imprimirPartida(partidaXadrez, capturado);
				System.out.println();
				System.out.print("Source: ");
				PosicaoXadrez origem = UI.lerPosicaoXadrez(sc);
				
				boolean[][] movimentosPossiveis = partidaXadrez.movimentosPossiveis(origem);
				UI.clearScreen();
				UI.imprimirTabuleiro(partidaXadrez.getPecas(), movimentosPossiveis);
				
				System.out.println();
				System.out.print("Target: ");
				PosicaoXadrez target = UI.lerPosicaoXadrez(sc);
				
				PecaXadrez pecaCapturada = partidaXadrez.movimentoXadrez(origem, target);
				
				if (pecaCapturada != null) {
					capturado.add(pecaCapturada);
				}
			}
			catch (ExcecaoXadrez e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.imprimirPartida(partidaXadrez, capturado);
	}
}
