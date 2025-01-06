import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maior;
        double menor;
        double current_number;
        double soma = 0;
        double media;
        double x = 0;

        System.out.println("Quantos valores quer inserir? R: ");
        int quantidade = input.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Insira o " + (i + 1) + " número: ");
            current_number = input.nextDouble();


    }
}