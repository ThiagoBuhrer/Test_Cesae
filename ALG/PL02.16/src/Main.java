import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade = 20;
        int soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Insira o " + i + " número");
            /* ou
            double numero = in.nextDouble();
            soma += numero
             */
            soma += input.nextDouble();
        }
        //double media = soma / quantidade;
        // System.out.println("A média é: " + media);
        System.out.println("A média é: " + (soma / quantidade));
    }
}