// Exercício 10: Desafio Final - Sistema de Gerenciamento de Estoque para uma Loja
// Desenvolva um sistema completo de gerenciamento de estoque para uma loja. Permita que o usuário adicione, remova e atualize itens no estoque, usando classes para representar os produtos e listas para organizar os itens cadastrados. Esse sistema ajudará na administração dos produtos disponíveis para venda.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Quantidade: " + quantidade + " | Preço: R$" + preco;
    }
}

public class GerenciadorEstoque {
    public static void main(String[] args) {
        List<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Gerenciamento de Estoque ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Listar Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeAdd = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int qtdAdd = scanner.nextInt();
                    System.out.print("Preço: ");
                    double precoAdd = scanner.nextDouble();
                    estoque.add(new Produto(nomeAdd, qtdAdd, precoAdd));
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do produto a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    Produto produtoParaRemover = null;
                    for (Produto p : estoque) {
                        if (p.getNome().equalsIgnoreCase(nomeRemover)) {
                            produtoParaRemover = p;
                            break;
                        }
                    }
                    if (produtoParaRemover != null) {
                        estoque.remove(produtoParaRemover);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Nome do produto para atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    Produto produtoParaAtualizar = null;
                    for (Produto p : estoque) {
                        if (p.getNome().equalsIgnoreCase(nomeAtualizar)) {
                            produtoParaAtualizar = p;
                            break;
                        }
                    }
                    if (produtoParaAtualizar != null) {
                        System.out.print("Nova quantidade: ");
                        int novaQtd = scanner.nextInt();
                        produtoParaAtualizar.setQuantidade(novaQtd);
                        System.out.println("Quantidade atualizada com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio.");
                    } else {
                        System.out.println("\n--- Estoque Atual ---");
                        for (Produto p : estoque) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}
