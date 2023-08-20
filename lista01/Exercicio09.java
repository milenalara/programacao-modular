// 09 - Sabendo que 1o de janeiro de 2024 será uma segunda feira, escreva um método que receba uma data e diga em qual dia da semana esta data acontecerá em 2024. Escreva um programa principal para testar seu método.

import java.util.Scanner;

public class Exercicio09 extends Exercicio08 {
    Scanner sc = new Scanner(System.in);
    private String data;
    private int mes;
    private int dia;
    private int countDias = 0;

    private void informaData() {
        System.out.println("Informe uma data no ano de 2024 no formato DD/MM: ");
        this.data = sc.nextLine();
    }

    private void formataData() {
        String[] dataSeparada = data.split("/");
        this.dia = Integer.parseInt(dataSeparada[0]);
        this.mes = Integer.parseInt(dataSeparada[1]);
    }

    private void contaDias() {
        if (mes == 1) {
            countDias += dia;
        } else if (mes == 2) {
            countDias += 31 + dia;
        } else if (mes == 3) {
            countDias += 29 + 31 + dia;
        } else if (mes == 4) {
            countDias += 29 + (31 * 2) + dia;
        } else if (mes == 5) {
            countDias += 29 + 30 + (31 * 2) + dia;
        } else if (mes == 6) {
            countDias += 29 + 30 + (31 * 3) + dia;
        } else if (mes == 7) {
            countDias += 29 + (30 * 2) + (31 * 3) + dia;
        } else if (mes == 8) {
            countDias += 29 + (30 * 2) + (31 * 4) + dia;
        } else if (mes == 9) {
            countDias += 29 + (30 * 2) + (31 * 5) + dia;
        } else if (mes == 10) {
            countDias += 29 + (30 * 3) + (31 * 5) + dia;
        } else if (mes == 11) {
            countDias += 29 + (30 * 3) + (31 * 6) + dia;
        } else if (mes == 12) {
            countDias += 29 + (30 * 4) + (31 * 6) + dia;
        }
    }

    private String calculaDiaSemana() {
        int resto = countDias % 7;
        String dia = "";

        switch (resto) {
            case 0:
                dia = "segunda-feira";
                break;
            case 1:
                dia = "terça-feira";
                break;
            case 2:
                dia = "quarta-feira";
                break;
            case 3:
                dia = "quinta-feira";
                break;
            case 4:
                dia = "sexta-feira";
                break;
            case 5:
                dia = "sábado";
                break;
            case 6:
                dia = "domingo";
                break;
            default:
                break;
        }

        return dia;
    }

    public void exibeDiaDaSemana() {
        informaData();
        formataData();
        contaDias();
        System.out.println(this.data + " será " + calculaDiaSemana() + ".");
    }

}
