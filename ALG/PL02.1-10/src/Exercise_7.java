import java.util.Scanner;

public class Exercise_7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double percImpostos = 0.45;
        double percRevendedor = 0.28;

        System.out.println("Qual o carro que vai comprar?");
        String carro = input.nextLine();

        System.out.println("Qual o preço de fábrica deste carro?");
        double precoFabrica = input.nextDouble();

        double impostos;
        impostos = precoFabrica * percImpostos;
        double revendedor;
        revendedor = precoFabrica * percRevendedor;
        double precoTotal;
        precoTotal = precoFabrica + impostos + revendedor;

        System.out.println("O automóvel "+ carro +" custará um total de "+precoTotal);
    }
}
