// 04 - Elabore um programa que leia uma frase e mostre-a invertida na tela. Após mostrar a primeira frase, o programa deve ler e imprimir outra, assim fazendo até que o usuário digite a palavra “fim”.

import java.util.Scanner;

public class Exercicio04 {
    Scanner sc = new Scanner(System.in);

    private String leFrase() {
        System.out.println("Informe a frase a ser invertida: ");
        return sc.nextLine();
    }

    private String inverteFrase(String frase) {
        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }
        return invertida;
    }

    public void exibirFraseInvertida() {
        String frase;
        do {
            frase = leFrase();
            System.out.println(inverteFrase(frase));
        } while (!frase.equals("fim"));
    }

}
