
import java.util.Scanner;

public class Exercise_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Programa que te devolve o troco
        System.out.println("Insira o valor pago: ");
        double valorPago = input.nextDouble();

        System.out.println("Insira o valor do produto: ");
        double valorProduto = input.nextDouble();

        double troco = valorPago - valorProduto;
        if(troco > 0)
        {

            System.out.println("Seu troco é de: "+troco);
        }
        else if(troco < 0)
        {
            System.out.println("Ainda falta pagar: " + Math.abs(troco));
        }
        else
        {
            System.out.println("Não há troco");
        }

    }

}
