import java.util.Scanner;

public class Exercise_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Programa que calcula a área de um triângulo
        System.out.println("Insira valor em cm da base do triângulo: ");
        double base = input.nextDouble();

        System.out.println("Insira valor em cm da altura do triângulo: ");
        double altura = input.nextDouble();

        double area = base * altura / 2;
        System.out.println("A área do triângulo é de: "+area+" cm.");
    }
}
