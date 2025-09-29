// 2 - Remoção de Elementos Duplicados: Em um sistema de cadastro, é comum que contatos sejam adicionados mais de uma vez. Crie um método que remova contatos duplicados de uma lista de usuários (ArrayList), deixando apenas uma entrada por pessoa e otimizando o banco de dados. 

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoverDuplicados {
    public static void main(String[] args) {
        List<String> usuariosComDuplicados = new ArrayList<>();
        usuariosComDuplicados.add("Alice");
        usuariosComDuplicados.add("Brenda");
        usuariosComDuplicados.add("Alice");
        usuariosComDuplicados.add("Carlos");
        usuariosComDuplicados.add("Brenda");

        System.out.println("Lista original: " + usuariosComDuplicados);
        
        List<String> usuariosSemDuplicados = removerDuplicados(usuariosComDuplicados);
        
        System.out.println("Lista sem duplicados: " + usuariosSemDuplicados);
    }

    public static List<String> removerDuplicados(List<String> lista) {
        Set<String> set = new LinkedHashSet<>(lista);
        return new ArrayList<>(set);
    }
}