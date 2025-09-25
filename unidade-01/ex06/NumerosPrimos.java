// Exercício 6: Seleção de Números Primos para Criptografia
// Em um sistema de segurança, números primos são utilizados como base para a criptografia. Escreva um programa que encontre e exiba todos os números primos entre 1 e 100, ajudando a equipe de segurança a selecionar números para esse propósito.

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 100:");
        for (int numero = 2; numero <= 100; numero++) {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}