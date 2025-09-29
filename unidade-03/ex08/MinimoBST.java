// 8 - Mínimo de uma BST: Imagine que você está analisando uma árvore binária de busca para identificar o produto mais barato de uma lista. Escreva um método que encontre o menor valor em uma árvore binária de busca, ajudando a determinar a melhor oferta disponível. 

public class MinimoBST {
    
    static class No {
        int valor;
        No esquerda;
        No direita;

        No(int valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }

    static class ArvoreBST {
        No raiz;

        public ArvoreBST() {
            this.raiz = null;
        }

        public void inserir(int valor) {
            raiz = inserirRecursivo(raiz, valor);
        }

        private No inserirRecursivo(No atual, int valor) {
            if (atual == null) {
                return new No(valor);
            }

            if (valor < atual.valor) {
                atual.esquerda = inserirRecursivo(atual.esquerda, valor);
            } else if (valor > atual.valor) {
                atual.direita = inserirRecursivo(atual.direita, valor);
            }
            return atual;
        }

        /**
         * Encontra o menor valor na BST.
         * @return O menor valor na árvore, ou -1 se a árvore estiver vazia.
         */
        public int encontrarMinimo() {
            if (raiz == null) {
                System.out.println("A arvore esta vazia.");
                return -1;
            }
            No atual = raiz;
            while (atual.esquerda != null) {
                atual = atual.esquerda;
            }
            return atual.valor;
        }
    }

    public static void main(String[] args) {
        ArvoreBST arvore = new ArvoreBST();
        
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        int menorValor = arvore.encontrarMinimo();
        System.out.println("O menor valor na arvore (o produto mais barato) e: " + menorValor); 
        
        ArvoreBST arvoreVazia = new ArvoreBST();
        arvoreVazia.encontrarMinimo(); 
    }
}