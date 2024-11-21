
import java.util.Scanner;

public class Exercise_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //programa que lê dois números e apresenta a sua diferença
        System.out.println("Insira o número 1: ");
        double  number1 = input.nextDouble();

        System.out.println("Insira o número 2: ");
        double  number2 = input.nextDouble();

        double  subtraction = number1 - number2;
        System.out.println("O resultado é: "+subtraction);
    }
}
