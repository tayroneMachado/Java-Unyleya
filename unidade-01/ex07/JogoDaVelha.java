// Exercício 7: Jogo da Velha Interativo
// Desenvolva um programa de Jogo da Velha (Tic-Tac-Toe) para uma brincadeira entre amigos. Utilize uma matriz para representar o tabuleiro e permita que dois jogadores façam jogadas alternadas, verificando quem será o vencedor!

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        Scanner scanner = new Scanner(System.in);

        while (jogoAtivo) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", digite a linha e a coluna (ex: 1 2):");
            int linha = scanner.nextInt() - 1;
            int coluna = scanner.nextInt() - 1;

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                if (verificarVitoria(tabuleiro, jogadorAtual)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (verificarEmpate(tabuleiro)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("O jogo terminou em empate!");
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }
    }

    private static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean verificarVitoria(char[][] tabuleiro, char jogador) {        
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
    }

    private static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}