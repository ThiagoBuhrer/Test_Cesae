import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int numbers = 0;
        int media;

        while (i <= 20) {
            System.out.print("Insira um valor : ");
            numbers = numbers + input.nextInt();
            i++;
        }
        media = numbers / (i - 1);
        if (media < 8 || media > 8) {
        System.out.println("A média é: "+ media);
        }
        else {
            System.out.println("A média é 10");
        }
    }
}