import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product code: ");
        int productCode = scanner.nextInt();

        if (productCode == 001) {
            System.out.println("Parafuso");
        }
        else if (productCode == 002) {
            System.out.println("Porca");
        }
        else if (productCode == 003) {
            System.out.println("Prego");
        }
        else {
            System.out.println("Product not found.");
        }

        /*

        ALTERNATIVA USANDO SWITCH:

        switch (productCode) {
            case 001:
                System.out.println("Parafuso");
                break;
            case 002:
                System.out.println("Porca");
                break;
            case 003:
                System.out.println("Prego");
                break;
        }

        OBS: se eu tivesse utilizado Strings ao invés de Integers, teria que
        colocar, por exemplo: Case "001" entre double quotes!

        */

    }
}