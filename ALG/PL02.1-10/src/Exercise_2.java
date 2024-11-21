import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //programa que lê dois números inteiros e apresenta sua soma
        System.out.println("Insira o número 1: ");
        double  number1 = input.nextDouble();

        System.out.println("Insira o número 2: ");
        double  number2 = input.nextDouble();

        double  soma = number1 + number2;
        System.out.println("A soma é: "+soma);
    }
}
