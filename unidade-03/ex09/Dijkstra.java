// 9 - Caminho Mais Curto em Grafo Ponderado: Ao modificar seu algoritmo BFS, você precisa encontrar o caminho mais curto entre dois pontos em um grafo ponderado, considerando as distâncias. Esse ajuste é crucial para garantir que os usuários recebam as rotas mais eficientes. 

import java.util.*;

public class Dijkstra {
    
    static class Aresta {
        int destino;
        int peso;

        public Aresta(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    static class NoPrioridade implements Comparable<NoPrioridade> {
        int vertice;
        int distancia;

        public NoPrioridade(int vertice, int distancia) {
            this.vertice = vertice;
            this.distancia = distancia;
        }

        @Override
        public int compareTo(NoPrioridade outro) {
            return Integer.compare(this.distancia, outro.distancia);
        }
    }

    public static void dijkstra(int origem, List<List<Aresta>> grafo, int numVertices) {
        int[] distancias = new int[numVertices];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origem] = 0;

        PriorityQueue<NoPrioridade> pq = new PriorityQueue<>();
        pq.add(new NoPrioridade(origem, 0));

        while (!pq.isEmpty()) {
            int u = pq.poll().vertice;

            for (Aresta aresta : grafo.get(u)) {
                int v = aresta.destino;
                int peso = aresta.peso;

                if (distancias[u] + peso < distancias[v]) {
                    distancias[v] = distancias[u] + peso;
                    pq.add(new NoPrioridade(v, distancias[v]));
                }
            }
        }

        System.out.println("Distâncias a partir do vértice " + origem + ":");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vértice " + i + ": " + (distancias[i] == Integer.MAX_VALUE ? "Inalcançável" : distancias[i]));
        }
    }

    public static void main(String[] args) {
        int numVertices = 5;
        List<List<Aresta>> grafo = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            grafo.add(new ArrayList<>());
        }
        grafo.get(0).add(new Aresta(1, 10));
        grafo.get(0).add(new Aresta(2, 3));
        grafo.get(1).add(new Aresta(2, 1));
        grafo.get(1).add(new Aresta(3, 2));
        grafo.get(2).add(new Aresta(1, 4));
        grafo.get(2).add(new Aresta(3, 8));
        grafo.get(2).add(new Aresta(4, 2));
        grafo.get(3).add(new Aresta(4, 7));

        dijkstra(0, grafo, numVertices);
    }
}