// 6 - BFS em Grafos: No contexto do seu aplicativo de navegação, implemente o algoritmo de Busca em Largura (BFS) para encontrar o caminho mais curto entre dois pontos em um grafo não ponderado, ajudando os usuários a escolherem a melhor rota. 

import java.util.LinkedList;
import java.util.Queue;

public class BuscaBFS {
    static class Grafo {
        private int V;
        private LinkedList<Integer> adj[];

        Grafo(int v) {
            this.V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList();
            }
        }

        void adicionarAresta(int v1, int v2) {
            adj[v1].add(v2);
            adj[v2].add(v1);
        }

        void bfs(int s) {
            boolean[] visitado = new boolean[V];
            Queue<Integer> fila = new LinkedList<>();

            visitado[s] = true;
            fila.add(s);

            System.out.println("Percorrendo o grafo a partir do vértice " + s + ":");
            while (fila.size() != 0) {
                s = fila.poll();
                System.out.print(s + " ");

                for (int vizinho : adj[s]) {
                    if (!visitado[vizinho]) {
                        visitado[vizinho] = true;
                        fila.add(vizinho);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo(6);

        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(2, 4);
        g.adicionarAresta(3, 5);
        g.adicionarAresta(4, 5);
        
        System.out.println("Busca em Largura (BFS) a partir do vértice 0:");
        g.bfs(0);
        
        System.out.println("\nBusca em Largura (BFS) a partir do vértice 2:");
        g.bfs(2);
    }
}