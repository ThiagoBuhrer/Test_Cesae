
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //test();
        //exercise_10();
        exercise_11();
        //exercise_12();
    }

    private static void test() {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número:");
        //String number1 = in.nextLine();
        //int n1 = Integer.parseInt(number1); --> equivalente a função atoi, faz stringo to integers.
        //Ou, simplesmente faça:
        double  number1 = in.nextDouble();

        System.out.println("Insira outro número:");
        //String number2 = in.nextLine();
        //int n2 = Integer.parseInt(number2); --> equivalente a função atoi, faz stringo to integers.
        //Ou, simplesmente faça:
        double  number2 = in.nextDouble();

        double soma = number1 + number2;
        System.out.println("A soma é: " + soma);
    }

    private static void exercise_10() {
        Scanner input = new Scanner(System.in);

        //Crie um programa que diz se um número é par ou ímpar
        System.out.println("Insira o número: ");
        int number = input.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("Seu número é par");
        }
        else if (number % 3 == 0)
        {
            System.out.println("Seu número é ímpar");
        }

    }
    public static void exercise_11() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o lado 1: ");
        int n1 = input.nextInt();
        System.out.println("Insira o lado 2: ");
        int n2 = input.nextInt();
        System.out.println("Insira o lado 3: ");
        int n3 = input.nextInt();

        if (n1 + n2 + n3 == 0) {
           System.out.println("Este de fato não é um triângulo");
        }
        else if (n1 > (n2 + n3) || n2 > (n1 + n3) || n3 > (n1 + n2)) {
            System.out.println("Um lado não pode ser maior do que a soma dos outros dois.");
        }
        else if (n1 == n2 && n1 == n3) {
            System.out.println("O triângulo é equilátero");
        }
        else if ((n1 == n2 || n1 == n3 || n2 == n3)) {
            System.out.println("O triângulo é isósceles");
        }
        else {
            System.out.println("O triângulo é escaleno");
        }
    }
}