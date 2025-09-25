// Exercício 8: Análise de Frequência de Pedidos no Delivery
// Em uma análise dos pedidos feitos por um cliente, você precisa descobrir qual item é mais pedido. Crie um programa que solicite uma lista de números (representando o código dos pedidos) e exiba o item que mais se repete na lista.

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class AnaliseFrequencia {
    public static void main(String[] args) {
        List<Integer> pedidos = new ArrayList<>();
        pedidos.add(101);
        pedidos.add(105);
        pedidos.add(102);
        pedidos.add(101);
        pedidos.add(103);
        pedidos.add(105);
        pedidos.add(101);

        Map<Integer, Integer> frequenciaPedidos = new HashMap<>();
        for (Integer pedido : pedidos) {
            frequenciaPedidos.put(pedido, frequenciaPedidos.getOrDefault(pedido, 0) + 1);
        }

        int itemMaisRepetido = -1;
        int maiorFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry : frequenciaPedidos.entrySet()) {
            if (entry.getValue() > maiorFrequencia) {
                maiorFrequencia = entry.getValue();
                itemMaisRepetido = entry.getKey();
            }
        }

        System.out.println("O item mais pedido é o de código: " + itemMaisRepetido + " (aparece " + maiorFrequencia + " vezes).");
    }
}