import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int total = 0;

        //Um programa que converta um valor binário para decimal:
        System.out.println("Enter binary value: ");
        String binary = number.nextLine();

        int x = 0;

        while (x < binary.length()) {
            total++;
            x++;
        }

        int decimal = 0;
        for (int i = 0; i < total; i++) {
            char currentChar = binary.charAt(i);
            if (currentChar == '1') {
                decimal = decimal * 2 + 1;
            } else {
                decimal = decimal * 2;
            }
        }
        System.out.println("Decimal value: " + decimal);
    }
}