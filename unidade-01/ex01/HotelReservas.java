// Exercício 1: Explorando Variáveis no Sistema de Reservas de um Hotel

// Imagine que você está desenvolvendo um sistema de reservas para um hotel. Comece declarando variáveis que armazenem o número do quarto (número inteiro), o valor da diária (número com ponto flutuante) e o nome do hóspede (string). Atribua valores de exemplo a essas variáveis e exiba-os na tela.

public class HotelReservas {
    public static void main(String[] args) {
        int numeroQuarto = 205;
        double valorDiaria = 250.75;
        String nomeHospede = "Maria da Silva";

        System.out.println("--- Sistema de Reservas ---");
        System.out.println("Nome do Hóspede: " + nomeHospede);
        System.out.println("Número do Quarto: " + numeroQuarto);
        System.out.println("Valor da Diária: R$" + valorDiaria);
    }
}