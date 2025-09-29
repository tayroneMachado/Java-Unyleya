// 8 - Contagem de Palavras: Você precisa criar uma análise de palavras usadas em um artigo para entender quais termos aparecem com maior frequência. Escreva um programa que conte a frequência de cada palavra em uma frase, utilizando um HashMap, para identificar as palavras mais comuns.

import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    public static void main(String[] args) {
        String frase = "a casa é azul e a casa é grande";
        Map<String, Integer> contagem = new HashMap<>();

        String[] palavras = frase.toLowerCase().split(" ");
        
        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("Frequência de palavras na frase:");
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " vez(es)");
        }
    }
}