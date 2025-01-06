import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        int soma = 0;
        int media;

        while (i <= 5) {
            System.out.println("Insert number: ");
            soma = soma + in.nextInt();
            i++;
        }
        media = soma / (i - 1);
        System.out.println("Média aritmética é: "+ media);
    }
}