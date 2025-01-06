import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 0;
        int j = 0;

        //Neste bloco, o usuário decidirá o número de linhas e colunas do Array:

        System.out.println("Enter the number of lines: ");
        int num1 = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int num2 = in.nextInt();

        int[][] multidimensional = new int [num1][num2];

        //Neste block armazeno os valores escolhidos pelo usuário dentro do Array.

        for (i = 0; i < num1; i++) {
            for (j = 0; j < num2; j++) {
                System.out.print("Enter a value for line " + (i + 1) + " and column " + (j + 1) +" : ");
                multidimensional[i][j] = in.nextInt();
            }
        }

        //Neste outro bloco, exibo o conteúdo do Array 3x3 no ecrã:

        System.out.println();
        System.out.print("Os números aleatórios armazenados no array multidimensional são: ");
        for (i = 0; i < num1; i++) {
            System.out.println();
            for (j = 0; j < num2; j++) {
                System.out.print(multidimensional[i][j] + "\t");
            }
        }
    }
}