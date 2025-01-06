import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] multidimensional = new int [3][3];

        /*
        Neste block armazeno os valores escolhidos pelo usuário dentro do Array.
        OBS: Usei (i + 1) e (j + 1) porque não existe tal coisa como "linha zero" e "coluna zero".
        Isso poderia confundir o utilizador.
        */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter a value for line " + (i + 1) + " and column " + (j + 1) +" : ");
                multidimensional[i][j] = in.nextInt();
            }
        }

        //Neste outro bloco, exibo o conteúdo do Array 3x3 no ecrã:

        System.out.println();
        System.out.print("Os números aleatórios armazenados no array multidimensional são: ");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(multidimensional[i][j] + " \t");
            }
        }
    }
}