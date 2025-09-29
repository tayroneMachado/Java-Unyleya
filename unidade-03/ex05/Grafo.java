// 5 - Representação de Grafos: Você está desenvolvendo um sistema de roteamento para um aplicativo de navegação. Crie uma classe que represente um grafo em Java, utilizando lista de adjacências ou matriz de adjacências, para mapear as conexões entre diferentes locais. 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Grafo {
    private int V;    
    private LinkedList<Integer> adj[];

    /**
     * Construtor do grafo.
     * @param v O número de vértices.
     */
    public Grafo(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    /**
     * Adiciona uma aresta ao grafo.
     * @param v1 O vértice de origem.
     * @param v2 O vértice de destino.
     */
    public void adicionarAresta(int v1, int v2) {
        adj[v1].add(v2);
    }

    /**
     * Imprime a representação do grafo (lista de adjacências).
     */
    public void imprimirGrafo() {
        for (int i = 0; i < V; ++i) {
            System.out.print("Vértice " + i + " está conectado a:");
            for (Integer vizinho : adj[i]) {
                System.out.print(" -> " + vizinho);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo(5);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 4);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(1, 4);
        g.adicionarAresta(2, 3);
        g.adicionarAresta(3, 4);
        
        g.imprimirGrafo();
    }
}