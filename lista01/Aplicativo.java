import java.util.Scanner;

public class Aplicativo {
    private static void menuProgramas() {
        System.out.println(
                "\n========================================== MENU DE PROGRAMAS ==========================================\n");
        System.out.println(
                "1 - Preencher um vetor de 6 numeros inteiros a partir da entrada do usuario e, depois,inverter as posicoes dos numeros do vetor.");
        System.out.println(
                "2 - Leia um vetor de inteiros e crie outro vetor, contendo a soma de cada par de vizinhos do vetor original.");
        System.out.println("3 - Imprimir no console retangulos usando caracteres");
        System.out.println(
                "4 - Leia uma frase e mostre-a invertida na tela. Apos mostrar a primeira frase, o programa deve ler e imprimir outra, assim fazendo ate que o usuario digite a palavra \"fim\"");
        System.out.println("13 - O que é um método em um código de um sistema de informação?");
    }

    private static void escolherPrograma(int op) throws Exception {
        switch (op) {
            case -1:
                break;
            case 0:
                menuProgramas();
                break;
            case 1:
                exercicio01();
                break;
            case 2:
                exercicio02();
                break;
            case 3:
                exercicio03();
                break;
            case 4:
                exercicio04();
                break;
            case 5:
                exercicio05();
                break;
            case 6:
                exercicio06();
                break;
            case 7:
                exercicio07();
                break;
            case 8:
                exercicio08();
                break;
            case 9:
                exercicio09();
                break;
            case 10:
                exercicio10();
                break;
            case 11:
                exercicio11();
                break;
            case 12:
                exercicio12();
                break;
            case 13:
                exercicio13();
                break;
            default:
                break;
        }
    }

    private static void exercicio01() {
        int[] vet1 = new int[6];
        int[] vetInvertido;
        Exercicio01 exercicio1 = new Exercicio01();

        exercicio1.preencheVet(vet1);
        exercicio1.imprimeVet(vet1);

        vetInvertido = exercicio1.inverteVet(vet1);
        exercicio1.imprimeVet(vetInvertido);
    }

    private static void exercicio02() {
        // testando vetor com tamanho PAR
        int[] vet2 = new int[6];
        int[] vetSomaVizinhos;
        Exercicio02 exercicio2 = new Exercicio02();

        // preenchendo vetor original
        exercicio2.preencheVet(vet2);
        exercicio2.imprimeVet(vet2);

        vetSomaVizinhos = exercicio2.somaValoresVizinhos(vet2);
        exercicio2.imprimeVet(vetSomaVizinhos);

        // testando vetor com tamanho IMPAR
        int[] vet3 = new int[5];

        // preenchendo vetor original
        exercicio2.preencheVet(vet3);
        exercicio2.imprimeVet(vet3);

        vetSomaVizinhos = exercicio2.somaValoresVizinhos(vet3);
        exercicio2.imprimeVet(vetSomaVizinhos);

    }

    private static void exercicio03() throws Exception {
        Exercicio03 exercicio3 = new Exercicio03();

        exercicio3.obterMedidas();
        exercicio3.imprimeRetangulo();
    }

    private static void exercicio04() {
        Exercicio04 exercicio4 = new Exercicio04();
        exercicio4.exibirFraseInvertida();
    }

    private static void exercicio05() {
        Exercicio05 exercicio5 = new Exercicio05();

        exercicio5.informaDados();
        exercicio5.exibePlanoDeEstudos();
    }

    public static void exercicio06() throws Exception {
        Exercicio06 exercicio6 = new Exercicio06();

        exercicio6.exibeNumeroVencedor();
    }

    private static void exercicio07() throws Exception {
        Exercicio07 exercicio7 = new Exercicio07();

        exercicio7.exibeResultado();
    }

    private static void exercicio08() throws Exception {
        Exercicio08 exercicio8 = new Exercicio08();
        exercicio8.exibeDataValida();

    }

    private static void exercicio09() {
    }

    private static void exercicio10() {
    }

    private static void exercicio11() {
    }

    private static void exercicio12() {
    }

    public static void exercicio13() {
        System.out.println("13 – O que é um método em um código de um sistema de informação?" +
                "\n\nRESPOSTA: É uma função ou procedimento, ou seja, um trecho de código que é encapsulado e nomeado, e pode ser invocado repetidas vezes chamando seu nome. As fuções retornam valores, enquanto os procedimentos não.");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println(
                    "\n============================================== BOAS VINDAS =============================================\n");
            System.out.println("Digite o codigo do programa que deseja executar\n");
            System.out.println("OU digite 0 para ver as opcoes de programas\n");
            System.out.println("OU digite -1 para encerrar\n");
            op = sc.nextInt();

            escolherPrograma(op);

        } while (op != -1);
    }
}