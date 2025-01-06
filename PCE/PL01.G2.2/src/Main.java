import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] multidimensional = new int [3][3];
        Random rand = new Random();

        //Escolhi que o limite (bound)  vai ser 500
        //Neste block armazeno os valores aleatórios dentro do Array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multidimensional[i][j] = rand.nextInt(500);
            }
        }

        //Neste outro bloco, exibo o conteúdo do array no ecrã
        System.out.println("Os números aleatórios armazenados no array multidimensional são: ");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(multidimensional[i][j] + "\t");
            }
        }
    }
}