import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o lado 1: ");
        int n1 = input.nextInt();
        System.out.println("Insira o lado 2: ");
        int n2 = input.nextInt();
        System.out.println("Insira o lado 3: ");
        int n3 = input.nextInt();

        if (n1 + n2 + n3 == 0) {
            System.out.println("Este de fato não é um triângulo");
        }
        else if (n1 > (n2 + n3) || n2 > (n1 + n3) || n3 > (n1 + n2)) {
            System.out.println("Um lado não pode ser maior do que a soma dos outros dois.");
        }
        else if (n1 == n2 && n1 == n3) {
            System.out.println("O triângulo é equilátero");
        }
        else if ((n1 == n2 || n1 == n3 || n2 == n3)) {
            System.out.println("O triângulo é isósceles");
        }
        else {
            System.out.println("O triângulo é escaleno");
        }
    }
}
