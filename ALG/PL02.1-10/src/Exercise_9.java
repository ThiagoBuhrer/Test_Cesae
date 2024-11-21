import java.util.Scanner;

public class Exercise_9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Faça um programa que receba quatro valores e retorne o menor deles
        System.out.println("Insira um número");
        int n1 = input.nextInt();

        System.out.println("Insira outro número");
        int n2 = input.nextInt();

        System.out.println("Insira outro número");
        int n3 = input.nextInt();

        System.out.println("Insira outro número");
        int n4 = input.nextInt();

        if (n1 < n2 && n1 < n3 && n1 <n4)
        {
            System.out.println("O menor número é : " + n1);
        }
        else if (n2 < n3 && n2 < n4)
        {
            System.out.println("O menor número é : " + n2);
        }
        else if (n3 < n4)
        {
            System.out.println("O menor número é : " + n3);
        }
        else
        {
            System.out.println("O menor número é : " + n4);
        }
    }
}
