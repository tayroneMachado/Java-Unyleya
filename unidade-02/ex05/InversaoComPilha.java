// 5 - Inversão com Pilha: Suponha que você está desenvolvendo uma ferramenta que permite ao usuário visualizar uma lista de produtos na ordem inversa da inserção original. Implemente um método que utilize uma pilha para inverter a ordem dos elementos de uma lista de produtos (ArrayList). 

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InversaoComPilha {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();
        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");
        produtos.add("Headset");

        System.out.println("Lista de produtos original: " + produtos);
        
        List<String> produtosInvertidos = inverterListaComPilha(produtos);
        
        System.out.println("Lista de produtos invertida: " + produtosInvertidos);
    }

    public static List<String> inverterListaComPilha(List<String> lista) {
        Stack<String> pilha = new Stack<>();
        for (String item : lista) {
            pilha.push(item);
        }

        List<String> listaInvertida = new ArrayList<>();
        while (!pilha.isEmpty()) {
            listaInvertida.add(pilha.pop());
        }
        
        return listaInvertida;
    }
}
