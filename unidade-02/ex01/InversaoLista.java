// 1 - Inversão de Lista: Imagine que você está desenvolvendo um recurso em um aplicativo que exibe uma lista de tarefas do dia em ordem inversa. Escreva um programa que inverta os elementos de uma lista de tarefas (ArrayList) sem utilizar métodos prontos da linguagem, dando ao usuário a opção de ver a lista do fim para o começo. 

import java.util.ArrayList;
import java.util.List;

public class InversaoLista {
    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();
        tarefas.add("Comprar pão");
        tarefas.add("Pagar contas");
        tarefas.add("Estudar Java");
        tarefas.add("Ir à academia");

        System.out.println("Lista de tarefas original:");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }

        System.out.println("\nLista de tarefas invertida:");
        for (int i = tarefas.size() - 1; i >= 0; i--) {
            System.out.println("- " + tarefas.get(i));
        }
    }
}