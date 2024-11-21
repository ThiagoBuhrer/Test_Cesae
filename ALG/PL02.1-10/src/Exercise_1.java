import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Programa que lê o seu nome e diz olá!
        System.out.println("Qual é o seu nome?");
        String nome = in.nextLine();
        System.out.println("Olá, "+nome+". Como vai?");
    }
}
