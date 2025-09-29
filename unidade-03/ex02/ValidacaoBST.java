// 2 - Validação de BST: Suponha que você tenha uma árvore que armazena a hierarquia de categorias de produtos em um e-commerce. Escreva um método que verifique se essa árvore binária é uma árvore binária de busca (BST), garantindo que os produtos estejam organizados corretamente para facilitar a busca e navegação.

import java.util.ArrayList;
import java.util.List;

public class ValidacaoBST {
    
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

    static class ArvoreBinaria {
        No raiz;

        public ArvoreBinaria() {
            raiz = null;
        }

        public boolean ehBST() {
            List<Integer> chavesEmOrdem = new ArrayList<>();
            preencherListaEmOrdem(raiz, chavesEmOrdem);

            for (int i = 0; i < chavesEmOrdem.size() - 1; i++) {
                if (chavesEmOrdem.get(i) >= chavesEmOrdem.get(i + 1)) {
                    return false; 
                }
            }
            return true; 
        }

        private void preencherListaEmOrdem(No no, List<Integer> lista) {
            if (no != null) {
                preencherListaEmOrdem(no.esquerda, lista);
                lista.add(no.valor);
                preencherListaEmOrdem(no.direita, lista);
            }
        }
    }

    public static void main(String[] args) {        
        ArvoreBinaria arvoreBST = new ArvoreBinaria();
        arvoreBST.raiz = new No(10);
        arvoreBST.raiz.esquerda = new No(5);
        arvoreBST.raiz.direita = new No(15);
        arvoreBST.raiz.esquerda.esquerda = new No(2);
        arvoreBST.raiz.esquerda.direita = new No(7);

        System.out.println("A primeira arvore é uma BST? " + arvoreBST.ehBST()); 

        ArvoreBinaria arvoreNaoBST = new ArvoreBinaria();
        arvoreNaoBST.raiz = new No(10);
        arvoreNaoBST.raiz.esquerda = new No(5);
        arvoreNaoBST.raiz.direita = new No(15);
        arvoreNaoBST.raiz.esquerda.esquerda = new No(2);
        arvoreNaoBST.raiz.esquerda.direita = new No(12); 

        System.out.println("A segunda arvore é uma BST? " + arvoreNaoBST.ehBST()); 
    }
}