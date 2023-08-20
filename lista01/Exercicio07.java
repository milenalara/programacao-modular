// 07 - Um algoritmo para multiplicação rápida por 11 de números de 2 dígitos funciona assim: para multiplicar 81 x 11, some os dígitos do número (8 + 1 = 9) e insira o resultado entre os dígitos (891). Se a soma der maior que 9, incremente o dígito da esquerda (vai-um): 56 x 11 = 616. Escreva um programa que efetue multiplicações por 11 usando este algoritmo.

import java.util.Scanner;

public class Exercicio07 {
    private int numero;
    private int unidade;
    private int dezena;
    private int centena;
    private int resultado;

    Scanner sc = new Scanner(System.in);

    private void informaNumero() throws Exception {
        int num;

        System.out.println("Informe um número de 2 dígitos");
        num = sc.nextInt();
        if (num > 99 || num < 10) {
            throw new Exception("O número precisa ser de dois dígitos");
        } else {
            this.numero = num;
        }
    }

    private void calculaResultado() throws Exception {
        informaNumero();
        unidade = numero % 10;
        centena = numero / 10;
        dezena = unidade + centena;
        if (dezena > 9) {
            centena++;
            dezena = dezena % 10;
        }
        centena *= 100;
        dezena *= 10;

        this.resultado = centena + dezena + unidade;
    }

    public void exibeResultado() throws Exception {
        calculaResultado();

        System.out.println(this.numero + " x 11 = " + this.resultado);
    }
}
