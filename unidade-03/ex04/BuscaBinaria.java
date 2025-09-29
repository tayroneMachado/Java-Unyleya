// 4 - Busca Binária: Imagine que você está desenvolvendo um sistema de pesquisa de dados em uma lista de números ordenados. Implemente um algoritmo de busca binária que encontre a posição de um elemento específico em um array ordenado de inteiros, retornando sua posição ou -1 se não for encontrado. 

public class BuscaBinaria {
    /**
     * Realiza uma busca binária em um array de inteiros ordenado.
     * @param array O array ordenado onde a busca será realizada.
     * @param numeroBuscado O número a ser encontrado.
     * @return A posição do número no array, ou -1 se não for encontrado.
     */
    public int buscar(int[] array, int numeroBuscado) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == numeroBuscado) {
                return meio;
            }

            if (array[meio] < numeroBuscado) {
                inicio = meio + 1;
            }            
            else {
                fim = meio - 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        BuscaBinaria buscador = new BuscaBinaria();
        int[] listaOrdenada = {1, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        int numeroParaEncontrar1 = 23;
        int posicao1 = buscador.buscar(listaOrdenada, numeroParaEncontrar1);
        System.out.println("O número " + numeroParaEncontrar1 + " está na posição: " + posicao1); 

        int numeroParaEncontrar2 = 7;
        int posicao2 = buscador.buscar(listaOrdenada, numeroParaEncontrar2);
        System.out.println("O número " + numeroParaEncontrar2 + " está na posição: " + posicao2); 
    }
}