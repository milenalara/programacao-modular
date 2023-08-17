// 03 – Escreva um ou mais métodos para imprimir no console retângulos usando caracteres, como, por exemplo:
// XXXXX
// X   X
// X   X
// X   X
// XXXXX

import java.util.Scanner;

public class Exercicio03 {
    private int altura, largura;
    private String primeiraUltimaLinha = "";
    private String linhasInterm = "";
    private String retangulo = "";
    Scanner sc = new Scanner(System.in);

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    Exercicio03() {
    }

    Exercicio03(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void obterMedidas() {
        System.out.println("Informe a altura do retangulo: ");
        this.altura = sc.nextInt();
        System.out.println("Informe a largura do retangulo: ");
        this.largura = sc.nextInt();
    }

    private void constroiRetangulo() throws Exception {
        if (this.altura < 2 || this.largura < 2) {
            throw new Exception("Não é possível produzir um retângulo com dimensões menores que 2x2");
        } else {
            for (int i = 0; i < largura; i++) {
                primeiraUltimaLinha += "X";
            }

            linhasInterm += "X";
            for (int i = 0; i < largura - 2; i++) {
                linhasInterm += " ";
            }
            linhasInterm += "X";

            retangulo += primeiraUltimaLinha + "\n";
            for (int i = 0; i < altura - 2; i++) {
                retangulo += linhasInterm + "\n";
            }
            retangulo += primeiraUltimaLinha;
        }
    }

    public void imprimeRetangulo() throws Exception {
        constroiRetangulo();
        System.out.println(retangulo);
    }
}
