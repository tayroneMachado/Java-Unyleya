// 10 - Ordenação de Grafos: Por fim, implemente um algoritmo que ordene os vértices de um grafo de acordo com a topologia das conexões entre eles. Essa ordenação pode ser útil em diversas aplicações, como planejamento de projetos ou organização de tarefas interdependentes. 

import java.util.LinkedList;
import java.util.Stack;

public class GrafoTopologico {
    private int V;
    private LinkedList<Integer> adj[];

    public GrafoTopologico(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void adicionarAresta(int v, int w) {
        adj[v].add(w);
    }

    public void ordenacaoTopologica() {
        Stack<Integer> pilha = new Stack<>();
        boolean visitado[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visitado[i]) {
                ordenacaoTopologicaUtil(i, visitado, pilha);
            }
        }

        System.out.println("A ordenacao topologica do grafo e:");
        while (!pilha.empty()) {
            System.out.print(pilha.pop() + " ");
        }
        System.out.println();
    }

    private void ordenacaoTopologicaUtil(int v, boolean visitado[], Stack<Integer> pilha) {
        visitado[v] = true;

        for (int i : adj[v]) {
            if (!visitado[i]) {
                ordenacaoTopologicaUtil(i, visitado, pilha);
            }
        }

        pilha.push(v);
    }

    public static void main(String args[]) {
        GrafoTopologico g = new GrafoTopologico(6);
        g.adicionarAresta(5, 2);
        g.adicionarAresta(5, 0);
        g.adicionarAresta(4, 0);
        g.adicionarAresta(4, 1);
        g.adicionarAresta(2, 3);
        g.adicionarAresta(3, 1);

        g.ordenacaoTopologica();
    }
}