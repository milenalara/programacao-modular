// 03 – Escreva um ou mais métodos para imprimir no console retângulos usando caracteres, como, por exemplo:
// XXXXX
// X   X
// X   X
// X   X
// XXXXX

public class Exercicio03 {
    private int altura, largura;

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
}
