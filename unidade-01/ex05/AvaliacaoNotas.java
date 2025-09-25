// Exercício 5: Avaliação de Notas dos Alunos
// Você é responsável por calcular o desempenho dos alunos em uma avaliação. Crie uma matriz (array) com as notas dos alunos em uma prova e encontre a maior nota da turma, exibindo-a ao final.

public class AvaliacaoNotas {
    public static void main(String[] args) {
        double[] notas = {7.5, 9.0, 8.2, 6.8, 9.5};
        double maiorNota = 0.0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("A maior nota da turma é: " + maiorNota);
    }
}