import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criar o array para armazenar as notas
        double[] notas = new double[3];
        Scanner in = new Scanner(System.in);

        // Preencher o array com as notas fornecidas pelo usuário
        System.out.println("Digite as três notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + " é: ");
            notas[i] = in.nextDouble();
        }

        // Calcular a média final usando os dados do array
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("\nA média final é: " + media);
    }
}
