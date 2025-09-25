// Exercício 9: Gerenciando um Cadastro de Clientes
// Em uma agência de viagens, você precisa organizar o cadastro dos clientes. Crie uma classe Pessoa com atributos como nome, idade e endereço, e desenvolva um programa que permita criar e gerenciar uma lista desses clientes.

import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Endereço: " + endereco;
    }
}

public class CadastroClientes {
    public static void main(String[] args) {
        List<Pessoa> clientes = new ArrayList<>();

        Pessoa cliente1 = new Pessoa("Ana Costa", 30, "Rua A, 123");
        Pessoa cliente2 = new Pessoa("Bruno Silva", 45, "Av. B, 456");
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        
        System.out.println("--- Clientes Cadastrados ---");
        for (Pessoa cliente : clientes) {
            System.out.println(cliente);
        }
    }
}