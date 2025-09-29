// 6 - Implementação de um Sistema de Fila de Espera: Em uma clínica, os pacientes aguardam atendimento em uma fila de espera. Crie um sistema que simule essa fila, permitindo adicionar, remover e exibir a ordem de atendimento dos pacientes. Isso ajudará na organização e no controle da ordem de atendimento. 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDeEspera {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Fila de Espera ---");
            System.out.println("1. Adicionar paciente");
            System.out.println("2. Atender próximo paciente");
            System.out.println("3. Exibir fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do paciente: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println(nome + " foi adicionado à fila.");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há pacientes na fila.");
                    } else {
                        String pacienteAtendido = fila.poll();
                        System.out.println("O paciente " + pacienteAtendido + " foi atendido.");
                    }
                    break;
                case 3:
                    System.out.println("Fila de espera: " + fila);
                    break;
                case 4:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        scanner.close();
    }
}