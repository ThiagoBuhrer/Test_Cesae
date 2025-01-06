import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //quando utilizo o for sei exatamente quantas vezes quero executar um ciclo

        for(int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        //quando utilizo o for sei exatamente quantas vezes quero executar um ciclo

        int num = 1;

        while(num != 0) {
            System.out.println("Insira um número. Para para insira zero.");
            num = in.nextInt();
            System.out.println("Não é zero.");
        }
    }
}