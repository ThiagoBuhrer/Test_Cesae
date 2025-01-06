import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int sumTotal = 0;

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
                sumTotal += multidimensional[i][j];
            }
        }

        //Neste outro bloco, exibo o conteúdo do Array 3x3 no ecrã:

        System.out.println();
        System.out.print("Os números aleatórios armazenados no array multidimensional são: ");
        for (i = 0; i < num1; i++) {
            System.out.println();
            for (j = 0; j < num2; j++) {
                System.out.print(multidimensional[i][j] + " \t");
            }
        }

        System.out.println();
        int option = 1;

        do {
            System.out.println();
            System.out.println("Select an option: ");
            System.out.println("1 - Calculate the arithmetic mean of all lines");
            System.out.println("2 - Calculate the arithmetic mean of all columns");
            System.out.println("3 - Calculate the arithmetic mean of all values");
            System.out.println("0 - Exit menu");
            option = in.nextInt();

            int sum = 0;

            switch (option) {
                case 1:

                    for (i = 0; i < num1; i++) {
                        for (j = 0; j < num2; j++) {
                            sum += multidimensional[i][j];
                        }
                        System.out.println("Linha " + (i + 1) + ": Soma: " + sum + " | Média: " + sum / num1);
                        sum = 0;
                        /* sum = 0 para libertar esse espaço ao retornar para o menu.
                        Uma alternativa seria simplesmente criar duas variáveis sum, uma para o
                        Case 1 e outra para o Case 2 */
                    }
                    break;

                case 2:

                    for (i = 0; i < num2; i++) {
                        for (j = 0; j < num1; j++) {
                            sum += multidimensional[j][i];
                        }
                        System.out.println("Coluna " + (i + 1) + ": Soma: " + sum + " | Média: " + sum / num2);
                        sum = 0;
                    }
                    break;

                case 3:

                    System.out.println();
                    System.out.println("The arithmetic mean of all value is: "+ sumTotal / (num1 * num2));

                    break;
                case 0:

                    return;

                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
    }
}
