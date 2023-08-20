// 08 - Escreva um método que verifique se uma data é válida, a partir de um dado recebido do usuário no formato DD/MM/AAAA. Se a data for inválida, informe ao usuário onde está o erro.

import java.util.Scanner;

public class Exercicio08 {
    Scanner sc = new Scanner(System.in);
    private String data;
    private int ano;
    private int mes;
    private int dia;

    private void informaData() {
        System.out.println("Informe uma data no formato DD/MM/AAAA para verificarmos sua validade: ");
        this.data = sc.nextLine();
    }

    private void formataData(String data) {
        String[] dataSeparada = data.split("/");
        this.dia = Integer.parseInt(dataSeparada[0]);
        this.mes = Integer.parseInt(dataSeparada[1]);
        this.ano = Integer.parseInt(dataSeparada[2]);
    }

    private boolean verificaAnoBissexto(int ano) {
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    private void verificaDataValida() {
        if (mes > 12) {
            System.out.println("Data inválida. Não existe mês maior que 12");
        } else if (dia > 31) {
            System.out.println("Data inválida. Não existe dia maior que 31");
        } else if (mes == 2 && (!verificaAnoBissexto(ano) && dia > 28)) {
            System.out.println("Data inválida. " + ano + " não é um ano bissexto");
        } else if (mes == 2 && (dia > 29)) {
            System.out.println("Data inválida. O mês de fevereiro vai até o dia 29");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Data inválida. Esse mês vai até o dia 30");
        } else {
            System.out.println("Data válida");
        }
    }

    public void exibeDataValida() {
        informaData();
        formataData(data);
        verificaDataValida();
    }
}
