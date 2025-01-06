import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Advinhacao_1() {

        Scanner in = new Scanner(System.in);

        int count = 0;
        int number = 0;

        Random rnd = new Random();
        int random_num = rnd.nextInt(1, 51);

        while (number != random_num) {
            System.out.println("Insira um novo número de 1 a 50 até acertar o valor sorteado: ");
            number = in.nextInt();
            count++;
            if (number < random_num) {
                System.out.println("\nDica: o número sorteado é maior!\n");
            } else if (number > random_num) {
                System.out.println("Dica: o número sorteado é menor!\n");
            }
        }
        System.out.println("Parabéns! Você acertou após " + count + " tentativas!\n");
    }

    public static void Advinhacao_2() {

        Scanner in = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println();
            System.out.println("Selecione o nível de dificuldade:");
            System.out.println("1 - Fácil");
            System.out.println("2 - Médio");
            System.out.println("3 - Difícil");
            System.out.println("0 - Sair");
            option = in.nextInt();

            switch (option) {

                case 0:
                    break;
                case 1:
                    Facil();
                    break;
                case 2:
                    Medio();
                    break;
                case 3:
                    Dificil();
                    break;
                default:
                    System.out.println("Opção Inserida é inválida!");
            }
        } while (option != 0);
    }

    public static void Facil() {

        Scanner in = new Scanner(System.in);

        int count = 0;
        int number = 0;

        Random rnd = new Random();
        int random_num = rnd.nextInt(1, 21);

        while (number != random_num) {
            System.out.println("Insira um novo número de 1 a 20 até acertar o valor sorteado: ");
            number = in.nextInt();
            count++;
            if (number < random_num) {
                System.out.println("\n1Dica: o número sorteado é maior!\n");
            } else if (number > random_num) {
                System.out.println("Dica: o número sorteado é menor!\n");
            }
        }
        System.out.println("Parabéns! Você acertou após " + count + " tentativas!\n");
    }

    public static void Medio() {

        Scanner in = new Scanner(System.in);

        int count = 0;
        int number = 0;

        Random rnd = new Random();
        int random_num = rnd.nextInt(1, 21);

        while (count < 3) {
            count++;
            System.out.println("\nEscolha um número de 1 a 20 até acertar o valor sorteado.");System.out.println("Lembre-se de que tem apenas três tentativas para acertar.");
            System.out.println("Essa é a tentiva de número "+count+".");
            System.out.println("Insira o número escolhido: ");
            number = in.nextInt();
            if (number < random_num) {
                System.out.println("\nDica: o número sorteado é maior!\n");
            } else if (number > random_num) {
                System.out.println("\nDica: o número sorteado é menor!\n");
            } else {
                System.out.println("\nParabéns! Você acertou após " + count + " tentativas!\n");
                return;
            }
        }
        System.out.println("\nNúmero máximo de tentativas alcançado. Você falhou.\n");
    }

    public static void Dificil() {

        Scanner in = new Scanner(System.in);

        int count = 0;
        int number = 0;

        Random rnd = new Random();
        int random_num = rnd.nextInt(1, 21);

            /*OBS: A primeira condição if exclui possibilidades da segunda condição else if.
            É por isso que não colocamos -2 e +2 na possibilidade de ser "nem perto nem longe".
            Só o +5 e -5 basta, porque a possibilidade de ser <= 2 ou >= -2 já é verificada no
            primeiro if. Por isso a ordem das condições é importantíssima.
             */

           do {
            number = in.nextInt();

            if (number == random_num) {
                System.out.println("\nParabéns! Você acertou!\n");
                return;
            } else if (number >= (random_num - 2) && number <= (random_num + 2)) {
                System.out.println("\nDica: o número sorteado é próximo disto!\n");
            } else if (number >= (random_num - 5) && number <= (random_num + 5)) {
                System.out.println("\nDica: o número sorteado não está nem perto e nem longe!\n");
            } else {
                System.out.println("\nDica: o número sorteado está longe disto!\n");
            }
        }while (number != random_num);
        System.out.println("\nNúmero máximo de tentativas alcançado. Você falhou.\n");
    }


    public static void Fosforos() {

        Scanner in = new Scanner(System.in);

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println();
            System.out.println("Selecione um dos seguintes jogos:");
            System.out.println("1 - Jogo de Advinhação Tipo 1");
            System.out.println("2 - Jogo de Advinhação Tipo 2");
            System.out.println("3 - Jogo dos 21 Fósforos");
            System.out.println("0 - Sair");
            option = in.nextInt();

            switch (option) {

                case 0:
                    break;
                case 1:
                    Advinhacao_1();
                    break;
                case 2:
                    Advinhacao_2();
                    break;
                case 3:
                    Fosforos();
                    break;
                default:
                    System.out.println("Opção Inserida é inválida!");
            }
        } while (option != 0);
    }
}








