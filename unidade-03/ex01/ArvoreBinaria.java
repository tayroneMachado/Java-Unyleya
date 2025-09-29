// 1 - Implementação da Árvore Binária: Imagine que você está desenvolvendo um sistema de gerenciamento de bibliotecas. Crie uma classe em Java para representar uma árvore binária, onde cada nó armazenará informações sobre um livro. Implemente métodos que permitam inserir novos livros e percorrer a árvore em pré-ordem, pós-ordem e em ordem para listar todos os livros disponíveis. 

class Livro {
    int id;
    String titulo;

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo;
    }
}

class No {
    Livro livro;
    No esquerda;
    No direita;

    public No(Livro livro) {
        this.livro = livro;
        this.esquerda = null;
        this.direita = null;
    }
}

class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }
    
    public void inserir(Livro livro) {
        raiz = inserirRecursivo(raiz, livro);
    }

    private No inserirRecursivo(No atual, Livro livro) {
        if (atual == null) {
            return new No(livro);
        }
        
        if (livro.id < atual.livro.id) {
            atual.esquerda = inserirRecursivo(atual.esquerda, livro);
        } else if (livro.id > atual.livro.id) {
            atual.direita = inserirRecursivo(atual.direita, livro);
        } else {            
            return atual;
        }
        return atual;
    }
    
    public void preOrdem(No no) {
        if (no != null) {
            System.out.println(no.livro);
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }
    
    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.println(no.livro);
            emOrdem(no.direita);
        }
    }
    
    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.println(no.livro);
        }
    }
    
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        arvore.inserir(new Livro(50, "A Odisséia de Pi"));
        arvore.inserir(new Livro(30, "A Arte da Guerra"));
        arvore.inserir(new Livro(70, "O Pequeno Príncipe"));
        arvore.inserir(new Livro(20, "1984"));
        arvore.inserir(new Livro(40, "Dom Quixote"));
        
        System.out.println("--- Percorrimento em ordem ---");
        arvore.emOrdem(arvore.raiz);
        System.out.println("\n--- Percorrimento em pré-ordem ---");
        arvore.preOrdem(arvore.raiz);
        System.out.println("\n--- Percorrimento em pós-ordem ---");
        arvore.posOrdem(arvore.raiz);
    }
}