import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void NameList(String[] names) {

        System.out.println();
        for (int i = 1; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void FirstLetterList(String[] first) {

        System.out.println();
        for (int i = 1; i < first.length; i++) {
            System.out.println(first[i]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        Random rnd = new Random();
        String[] names = new String[6];
        String[] first = new String[6];

        for (int i = 1; i < names.length; i++) {
            System.out.println("Insira um nome número " + i + ": ");
            names[i] = input.nextLine();
        }

        for (int i = 1; i < first.length; i++) {
            System.out.println("Insira a primeira letra do nome escolhido: ");
            first[i] = input.nextLine();
        }

        System.out.println();
        System.out.println("1 - Ver lista de nomes");
        System.out.println("2 - Ver lista de letras");
        System.out.println("3 - Sair");
        int option = menu.nextInt();

        switch (option) {

            case 1:
                //Mostra lista de nomes escolhidos
                NameList(names);
                break;
            case 2:
                //Mostra lista de primeiros caracteres inseridos em cada nome
                FirstLetterList(first);
                break;
            case 3:
                return;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
