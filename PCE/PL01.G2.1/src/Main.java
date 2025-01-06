import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] tabuada = new int [10][10];

        System.out.println("Quantas linhs quer? R: ");
        int linhas = scanner.nextInt();
        System.out.println("Quantas colunas quer? R: ");
        int colunas = scanner.nextInt();


        for (int i = 0; i < linhas; i++) {
            System.out.println();
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                tabuada[i][j] = (i + 1) * (j + 1);
                System.out.print(tabuada[i][j] + "\t");
            }
        }
    }
}