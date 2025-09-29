// 7 - DFS em Grafos: Continuando no seu aplicativo de navegação, escreva um método para realizar a Busca em Profundidade (DFS) em um grafo. Esse método deve exibir todos os vértices visitados, permitindo que os usuários visualizem as possíveis rotas de maneira mais detalhada. 

import java.util.LinkedList;

public class BuscaDFS {
    
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

        void dfs(int s) {
            boolean[] visitado = new boolean[V];
            System.out.println("Percorrendo o grafo a partir do vértice " + s + " (DFS):");
            dfsRecursivo(s, visitado);
            System.out.println();
        }

        private void dfsRecursivo(int v, boolean[] visitado) {
            visitado[v] = true;
            System.out.print(v + " ");

            for (int vizinho : adj[v]) {
                if (!visitado[vizinho]) {
                    dfsRecursivo(vizinho, visitado);
                }
            }
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
        
        g.dfs(0);
    }
}