// 3 - Busca Linear: Você está criando um aplicativo de agenda de contatos e precisa encontrar rapidamente a posição de um número específico na lista. Escreva um método que realize uma busca linear em um array de inteiros, retornando a posição do número buscado ou -1 caso ele não esteja presente. 

public class BuscaLinear {
    /**
     * Realiza uma busca linear em um array de inteiros.
     * @param array O array onde a busca será realizada.
     * @param numeroBuscado O número a ser encontrado.
     * @return A posição do número no array, ou -1 se não for encontrado.
     */
    public int buscar(int[] array, int numeroBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BuscaLinear buscador = new BuscaLinear();
        int[] contatos = {101, 256, 301, 452, 599, 678, 712};

        int numeroParaEncontrar1 = 452;
        int posicao1 = buscador.buscar(contatos, numeroParaEncontrar1);
        System.out.println("O numero " + numeroParaEncontrar1 + " esta na posicao: " + posicao1); 

        int numeroParaEncontrar2 = 900;
        int posicao2 = buscador.buscar(contatos, numeroParaEncontrar2);
        System.out.println("O numero " + numeroParaEncontrar2 + " esta na posicao: " + posicao2); 
    }
}