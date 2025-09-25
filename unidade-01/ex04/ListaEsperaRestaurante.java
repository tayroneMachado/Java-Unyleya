// Exercício 4: Organizando uma Lista de Espera Dinâmica
// Em um restaurante, há uma lista de espera para os clientes. Implemente um programa que permita adicionar e remover clientes dessa lista dinâmica. A cada alteração, exiba a lista atualizada para que os funcionários saibam quantos clientes estão aguardando.

import java.util.ArrayList;
import java.util.List;

public class ListaEsperaRestaurante {
    public static void main(String[] args) {
        List<String> listaEspera = new ArrayList<>();

        System.out.println("--- Adicionando clientes ---");
        listaEspera.add("João");
        listaEspera.add("Ana");
        listaEspera.add("Carlos");
        System.out.println("Lista atualizada: " + listaEspera);

        System.out.println("\n--- Removendo o primeiro cliente ---");
        listaEspera.remove(0);
        System.out.println("Lista atualizada: " + listaEspera);
    }
}
