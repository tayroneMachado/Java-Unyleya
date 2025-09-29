// 7 - Ordem de Chegada: Imagine que você está organizando o fluxo de clientes em uma loja durante uma promoção. Crie um programa que simule a ordem de chegada e exiba a ordem de saída, respeitando a fila de atendimento.

import java.util.LinkedList;
import java.util.Queue;

public class OrdemDeChegada {
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();
        
        System.out.println("--- Chegada dos clientes ---");
        clientes.add("Cliente A");
        clientes.add("Cliente B");
        clientes.add("Cliente C");
        System.out.println("Ordem de chegada: " + clientes);
        
        System.out.println("\n--- Atendimento e saída ---");
        while (!clientes.isEmpty()) {
            System.out.println("Atendendo e removendo: " + clientes.poll());
        }
        System.out.println("Fila de clientes após o atendimento: " + clientes);
    }
}