import java.util.Scanner;

public class Exercise_6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //programa calcula o valor a ser pago por quilo
        System.out.println("Qual o preço do quilo?");
        double preco = input.nextDouble();


        System.out.println("Quantos kg comprou?");
        double quantidade = input.nextDouble();

        double precoTotal = preco * quantidade;
        System.out.println("Valor a pagar é: " + precoTotal);
    }
}
