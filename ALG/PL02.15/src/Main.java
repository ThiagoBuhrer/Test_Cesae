import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        int numbers = 0;
        int media;

        for (i = 1; i <= 5; i++) {
            System.out.println("Insert number: ");
            numbers = numbers + in.nextInt();
        }
        media = numbers / (i - 1);
        System.out.println("Média aritmética é: "+ media);
    }
}