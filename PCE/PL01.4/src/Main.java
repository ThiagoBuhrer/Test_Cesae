import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //51 indica o tamanho do Array, não o index máximo (último index).
        //Um array de tamanho 51 tem indexes que vão até 50
        //Embora seja pedido 50, queremos por um número a mais porque não existe por lógico um número "zero".

        int[] num = new int[51];
        Random random = new Random();

        for (int i = 1; i < num.length; i++) {
            num[i] = random.nextInt(0, 100);
            System.out.println(num[i]);
        }

        int soma = 0;
        System.out.println();
        for (int i = 1; i < num.length; i++) {
            soma += num[i];
        }

        int media;
        media = soma / 50;
        System.out.println("A média dos valores é: "+ media);
        System.out.println("\nOs valores abaixo da média resultante são: ");
        for (int i = 1; i < num.length; i++) {
            if (num[i] < media) {
                System.out.println("-->  "+ num[i]);
            }
        }
    }
}