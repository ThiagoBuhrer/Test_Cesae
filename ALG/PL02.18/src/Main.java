import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media;
        double soma = 0;
        double current_number;
        double x = 0;


        System.out.println("Quantos valores quer inserir? R: ");
        int quantidade = input.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Insira o " + (i + 1) + " número: ");
            current_number = input.nextDouble();
            if (current_number > 4) {
                soma += current_number;
                x++;
            }
        }
        if (x > 0) {
            media = soma / x;
            System.out.println("A média é: " + media);
        }
        else {
            ()
        }


    }
}