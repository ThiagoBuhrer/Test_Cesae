import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //OBS: int[11] não indica o index. Indica o tamanho do array.

        Scanner in = new Scanner(System.in);
        int[] num = new int[11];

        //OBS: a syntax ".length" di z respeito ao index, não ao tamanho do array.
        //Ou seja, ela não lê o valor "11" do int[11], ela lê os indexes de 0 até 10.

        for (int i = 1; i < num.length; i++) {
            System.out.println("Enter number " + i + ": ");
            num[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("Reversed list is: \n");
        for (int i = 10; i >= 1; i--) {
            System.out.println("-->  "+ num[i]);
        }
    }
}