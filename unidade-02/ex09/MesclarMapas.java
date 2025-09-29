// 9 - Mesclar Mapas: Em um sistema de inventário, você tem dois registros de produtos e deseja mesclar as informações. Implemente um método para mesclar dois mapas (HashMaps) de produtos, cuidando para tratar possíveis conflitos de chaves. 

import java.util.HashMap;
import java.util.Map;

public class MesclarMapas {
    public static void main(String[] args) {
        Map<String, Integer> estoque1 = new HashMap<>();
        estoque1.put("Arroz", 50);
        estoque1.put("Feijão", 30);

        Map<String, Integer> estoque2 = new HashMap<>();
        estoque2.put("Feijão", 20); // Conflito de chave
        estoque2.put("Macarrão", 40);

        Map<String, Integer> estoqueTotal = mesclarMapas(estoque1, estoque2);
        
        System.out.println("Estoque 1: " + estoque1);
        System.out.println("Estoque 2: " + estoque2);
        System.out.println("Estoque total (mesclado): " + estoqueTotal);
    }

    public static Map<String, Integer> mesclarMapas(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {
        Map<String, Integer> mapaMesclado = new HashMap<>(mapa1);
        
        for (Map.Entry<String, Integer> entry : mapa2.entrySet()) {
            mapaMesclado.merge(entry.getKey(), entry.getValue(), (valorAntigo, novoValor) -> valorAntigo + novoValor);
        }
        
        return mapaMesclado;
    }
}