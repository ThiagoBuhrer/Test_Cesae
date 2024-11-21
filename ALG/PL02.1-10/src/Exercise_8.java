import java.util.Scanner;

public class Exercise_8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Faça um programa que receba dois valores e retorne o maior deles
        System.out.println("Insira um número");
        int n1 = input.nextInt();

        System.out.println("Insira outro número");
        int n2 = input.nextInt();

        if (n1 > n2)
        {
            System.out.println("O Primeiro número é maior: " + n1);
        }
        else if (n1 < n2)
        {
            System.out.println("O Primeiro número é maior: " + n2);
        }
        else
        {
            System.out.println("Os números são iguais");
        }
    }
}
