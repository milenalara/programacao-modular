// 06 – Mensalmente, a organização de moradores do bairro faz um sorteio cujos bilhetes contêm números de 6 dígitos. O sorteio é baseado nos dois primeiros números da loteria federal, sendo que o número vencedor no sorteio da organização é formado 
// pelos três primeiros dígitos do segundo prêmio e
// os três últimos dígitos do primeiro prêmio da loteria federal. 
// Por exemplo, se o primeiro prêmio fosse 34.582 e o segundo 54.098, o número vencedor seria 540.582. Escreva um programa que leia os prêmios da loteria federal e retorna o número vencedor da organização.

import java.util.Scanner;

public class Exercicio06 {
    Scanner sc = new Scanner(System.in);
    private int primeiroPremio;
    private int segundoPremio;
    private int numeroVencedor;

    private void informaNumeros() throws Exception {
        int primeiro, segundo;

        System.out.println("Informe o primeiro prêmio");
        primeiro = sc.nextInt();
        if (primeiro > 99999 || primeiro < 10000) {
            throw new Exception("O número precisa ter 5 dígitos");
        } else {
            this.primeiroPremio = primeiro;
        }

        System.out.println("Informe o segundo prêmio");
        segundo = sc.nextInt();
        if (segundo > 99999 || segundo < 10000) {
            throw new Exception("O número precisa ter 5 dígitos");
        } else {
            this.segundoPremio = segundo;
        }
    }

    public void exibeNumeroVencedor() throws Exception {
        informaNumeros();

        int primeirosDigitos = (this.segundoPremio / 100) * 1000;
        int ultimosDigitos = this.primeiroPremio % 1000;
        this.numeroVencedor = primeirosDigitos + ultimosDigitos;
        System.out.println("O número vencedor é " + this.numeroVencedor);
    }
}
