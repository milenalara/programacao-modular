// 01 - Escreva códigos Java para preencher um vetor de 6 números inteiros a partir da entrada do usuário e, depois,inverter as posições dos números do vetor. Por exemplo, se o vetor original era 4-8-15-16-23-42, deve ficar 42-23-16-15-8-4 após a execução. Escreva um programa que verifique a correção do seu código..

import java.util.Scanner;

public class Exercicio01 {
    Scanner sc = new Scanner(System.in);

    Exercicio01() {
    }

    public void preencheVet(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor: ");
            vet[i] = sc.nextInt();
        }
    }

    public int[] inverteVet(int[] vet) {
        int[] vetInvertido = new int[vet.length];
        int j = vetInvertido.length - 1;
        for (int i = 0; i < vet.length; i++) {
            vetInvertido[j] = vet[i];
            j--;
        }
        return vetInvertido;
    }

    public void imprimeVet(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.err.println("posição [" + i + "] = " + vet[i]);
        }
        System.out.println();
    }
}
