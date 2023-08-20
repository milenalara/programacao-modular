// 05 – Um estudante muito organizado está matriculado em N disciplinas, e dispõe de um total semanal de H horas e M minutos para estudar. Sua intenção
// é dividir o tempo disponível igualmente para as N disciplinas,
// e distribuir o tempo de descanso que sobrar nas pausas entre as disciplinas.
// Crie um ou mais métodos para informar ao estudante como ele deve organizar seu plano de estudos.

import java.util.Scanner;

public class Exercicio05 {
    private int qtDisciplinas;
    private int horasDisponiveis;
    private int minutosDisponiveis;
    private int tempoDisponivelEmMinutos;
    private int minutosPausa;
    private int minutosPorDia;
    private int minutosPorDiaPorDisciplina;
    private int tempoTotalPausa;

    Scanner sc = new Scanner(System.in);

    Exercicio05(int horasDisponiveis, int minutosDisponiveis, int qtDisciplinas, int minutosPausa) {
        this.horasDisponiveis = horasDisponiveis;
        this.minutosDisponiveis = minutosDisponiveis;
        this.qtDisciplinas = qtDisciplinas;
        this.minutosPausa = minutosPausa;
    }
    
    Exercicio05() {
        this.qtDisciplinas = 0;
        this.horasDisponiveis = 0;
        this.minutosDisponiveis = 0;
        this.tempoDisponivelEmMinutos = 0;
        this.minutosPausa = 0;
        this.minutosPorDia = 0;
        this.tempoTotalPausa = 0;
    }

    public void informaDados() {
        System.out.println("Informe o nº de disciplinas que vai cursar:");
        this.qtDisciplinas = sc.nextInt();
        System.out.println("Informe a quantidade de horas disponíveis para estudo (somente horas, sem minutos):");
        this.horasDisponiveis = sc.nextInt();
        System.out.println("Informe a quantidade de minutos disponíveis para estudos: ");
        this.minutosDisponiveis = sc.nextInt();
        System.err.println("Informe quantos minutos deseja para uma pausa: ");
        this.minutosPausa = sc.nextInt();
    }

    private void calculaPlanoDeEstudos() {
        tempoDisponivelEmMinutos = horasDisponiveis * 60 + minutosDisponiveis;

        tempoTotalPausa = minutosPausa * (qtDisciplinas - 1) * 5;

        minutosPorDia = tempoDisponivelEmMinutos / 5;
        tempoTotalPausa += tempoDisponivelEmMinutos % 5;

        minutosPorDiaPorDisciplina = minutosPorDia / qtDisciplinas;
        tempoTotalPausa += minutosPorDiaPorDisciplina % qtDisciplinas;

        minutosPausa = tempoTotalPausa / (qtDisciplinas - 1) / 5;
    }

    public void exibePlanoDeEstudos() {
        calculaPlanoDeEstudos();
        System.out.println("Você deverá estudar " + minutosPorDiaPorDisciplina
                + " minutos por dia para cada disciplina, fazendo uma pausa de " + minutosPausa
                + " minutos entre elas.");
    }
}