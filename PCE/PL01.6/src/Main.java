import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String[] names = new String[6];

        for (int i = 1; i < names.length; i++) {
            System.out.println("Insira um nome número "+ i +": ");
            names[i] = in.nextLine();
        }
        System.out.println("\nO nome sorteado é: " + names[rnd.nextInt(names.length)]);
    }
}