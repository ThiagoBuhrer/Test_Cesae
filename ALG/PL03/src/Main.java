import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void Calculadora() {
        int option = 1;

        while (option != 0) {
            System.out.println("Aplicação 1: Calculadora");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Voltar ao menu anterior");
            option = in.nextInt();

            switch (option) {
                case 1:
                    Somar();
                    break;
                case 2:
                    Subtrair();
                case 3:
                    Multiplicar();
                    break;
                case 4:
                    Dividir();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }

    private static double InserirNumero() {
        System.out.println("Digite um número: ");
        return in.nextDouble();
    }

    private static void Somar() {

        double  number1 = InserirNumero();
        double  number2 = InserirNumero();

        double  soma = number1 + number2;
        System.out.println("A soma é: "+ soma);
    }

    private static void Subtrair() {

        double  number1 = InserirNumero();
        double  number2 = InserirNumero();

        double  subtraction = number1 - number2;
        System.out.println("O resultado é: "+ subtraction);

    }

    private static void Multiplicar() {

        double  number1 = InserirNumero();
        double  number2 = InserirNumero();

        double  multiplication = number1 * number2;
        System.out.println("O resultado é: "+ multiplication);
    }

    private static void Dividir() {

        double  number1 = InserirNumero();
        double  number2 = InserirNumero();

        double  division = number1 / number2;
        System.out.println("O resultado é: "+ division);

    }

    public static void ListaNumeros() {

        System.out.println("Insira o primeiro valor: ");
        int  number1 = in.nextInt();

        System.out.println("Insira o segundo valor: ");
        int  number2 = in.nextInt();

        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }

    }

    public static void Calendario() {


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("Bem-vindo!");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Lista de Númeors");
            System.out.println("3 - Calendário");
            System.out.println("0 - Sair");
            option = in.nextInt();

            if (option == 0) {
                return;
            }

            else if (option == 1) {
                Calculadora();
            }
            else if (option == 2) {
                ListaNumeros();
            }
            else if (option == 3) {
                Calendario();
            }
            else {
                System.out.println("Opção inválida");
            }
        } while (option != 0);
    }
}