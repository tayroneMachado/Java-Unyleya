// 10 - Implementação de Algoritmo de Ordenação: Imagine que você está desenvolvendo um sistema de classificação que exibe os produtos mais populares em uma loja online. Escolha um algoritmo de ordenação (ex: Bubble Sort, Quick Sort, Merge Sort) e implemente-o para ordenar uma lista de produtos com base nas vendas, de forma decrescente, para que os mais vendidos apareçam primeiro. 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class ProdutoVenda implements Comparable<ProdutoVenda> {
    String nome;
    int vendas;

    public ProdutoVenda(String nome, int vendas) {
        this.nome = nome;
        this.vendas = vendas;
    }

    @Override
    public int compareTo(ProdutoVenda outro) {
        return Integer.compare(outro.vendas, this.vendas); // Ordem decrescente
    }

    @Override
    public String toString() {
        return nome + " (Vendas: " + vendas + ")";
    }
}

public class OrdenacaoProdutos {
    public static void main(String[] args) {
        List<ProdutoVenda> produtos = new ArrayList<>();
        produtos.add(new ProdutoVenda("Celular", 150));
        produtos.add(new ProdutoVenda("Notebook", 80));
        produtos.add(new ProdutoVenda("Tablet", 200));
        produtos.add(new ProdutoVenda("Smartwatch", 120));

        System.out.println("Lista de produtos original:");
        System.out.println(produtos);
        
        Collections.sort(produtos);

        System.out.println("\nLista de produtos ordenada por vendas (decrescente):");
        System.out.println(produtos);
    }
}