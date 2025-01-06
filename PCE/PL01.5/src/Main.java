import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] num = new int[11];
        Random random = new Random();

        for (int i = 1; i < num.length; i++) {
            num[i] = random.nextInt(0, 100);
        }

        /*
        A comparação a ser feita é simplesmente o array x si mesmo.


        A B C D E F G H I J --> [i]

        X

        A B C D E F G H I J --> [j]


         */

        System.out.println();
        System.out.println("A sequência em ordem crescente é: ");
        for (int i = 0; i < (num.length - 1); i++) {
            for (int j = (i + 1); j < num.length; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}