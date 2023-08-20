// 02 - Escreva códigos Java que leiam um vetor de inteiros e criem outro vetor, contendo a soma de cada par de vizinhos do vetor original. Por exemplo, se o vetor original era 4-8-15-16-23-42, o retorno deve ser um vetor 12-31-65 (ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último número deve ser somado consigo mesmo. Para ler o vetor, pode aproveitar o método do exercício 02. Escreva um programa que execute e teste seu código.

public class Exercicio02 extends Exercicio01 {
    public int[] somaValoresVizinhos(int[] vet) {
        int[] vetSoma;
        int i = 0;
        int j = 0;

        if (vet.length % 2 == 00) {
            vetSoma = new int[vet.length / 2];
            for (i = 0; i < vet.length; i += 2) {
                vetSoma[j] = vet[i] + vet[i + 1];
                j++;
            }
        } else {
            vetSoma = new int[(vet.length / 2) + 1];
            for (i = 0; i < vet.length - 1; i += 2) {
                vetSoma[j] = vet[i] + vet[i + 1];
                j++;
            }
            vetSoma[j] = 2 * vet[i];
        }

        return vetSoma;
    }
}
