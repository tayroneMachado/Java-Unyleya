// 3 - Mesclar Listas: Suponha que você está gerenciando duas listas de convidados para um evento e deseja criar uma nova lista com os nomes intercalados das listas originais. Implemente uma função que receba duas listas de convidados e retorne uma nova lista com os elementos intercalados. 

import java.util.ArrayList;
import java.util.List;

public class MesclarListas {
    public static void main(String[] args) {
        List<String> convidados1 = new ArrayList<>();
        convidados1.add("Ana");
        convidados1.add("Pedro");
        convidados1.add("Lucas");

        List<String> convidados2 = new ArrayList<>();
        convidados2.add("Maria");
        convidados2.add("João");
        convidados2.add("Julia");

        List<String> convidadosMesclados = mesclarListasIntercalado(convidados1, convidados2);
        
        System.out.println("Lista 1: " + convidados1);
        System.out.println("Lista 2: " + convidados2);
        System.out.println("Lista mesclada: " + convidadosMesclados);
    }

    public static List<String> mesclarListasIntercalado(List<String> lista1, List<String> lista2) {
        List<String> listaMesclada = new ArrayList<>();
        int tamanhoMaximo = Math.max(lista1.size(), lista2.size());
        
        for (int i = 0; i < tamanhoMaximo; i++) {
            if (i < lista1.size()) {
                listaMesclada.add(lista1.get(i));
            }
            if (i < lista2.size()) {
                listaMesclada.add(lista2.get(i));
            }
        }
        return listaMesclada;
    }
}