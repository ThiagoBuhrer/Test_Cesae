import java.util.Random;
import java.util.Scanner;

public class Main {

    //Limite mínimo = 1000, Limite máximo = 10.000
    public static void Lotaria() {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor entre 1.000 a 100.000: ");
        int valor = in.nextInt();

        Random rnd = new Random();
        int n1 = rnd.nextInt(1000, 100001);
        int ultimosTresDigitos = n1 % 1000;
        int ultimosDoisDigitos = n1 % 100;

        System.out.println("\nNúmero gerado: " + n1 + "\n");

        if (valor == n1) {
            System.out.println("Parabéns, você ganhou o prêmio máximo!\n");
        } else if (valor % 1000 == ultimosTresDigitos) {
            System.out.println("Parabéns, você ganhou o segundo prêmio!\n");
        } else if (valor % 100 == ultimosDoisDigitos) {
            System.out.println("Parabéns, você ganhou o terceiro prêmio!\n");
        } else {
            System.out.println("Não foi desta vez. Tente novamente!\n");
        }

    }

    public static void Raspadinhas1() {

        Scanner in = new Scanner(System.in);

        int counter = 0;
        int premio = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Insira um valor entre 1 e 10: ");
            int valor = in.nextInt();
            counter++;
            Random rnd = new Random();
            int n1 = rnd.nextInt(1, 11);
            if (valor == n1) {
                if (counter == 1) {
                    premio += 100;
                }
                else if (counter == 2) {
                    premio += 1;
                }
                else if (counter == 3) {
                    premio += 1;
                }
                else if (counter == 4) {
                    premio += 10;
                }
                else if (counter == 5) {
                    premio += 10;
                }
            }
            if (premio > 0) {
                System.out.println("O seu prêmio é de "+premio+"€\n");
            }
            if (premio <= 0) {
                System.out.println("Você não acumulou nenhum prêmio. Tente novamente.\n");
            }
        }
    }

    public static void Raspadinhas2() {

        Scanner in = new Scanner(System.in);

        //Bloco 1: Determina número principal e valor do prêmio a ser dado
        Random rnd = new Random();
        int numero_principal = rnd.nextInt(1, 11);
        Random rnd_2 = new Random();
        int premio = rnd.nextInt(1, 11);
        System.out.println("O número principal é: "+numero_principal+"\n");

        //Bloco 2: Determina números sorteados na raspadinha
        System.out.println("Os número sorteados são: ");
        int counter;
        counter = 0;
        for (int i = 1; i <= 9; i++) {
            Random rnd_3 = new Random();
            int sorteados = rnd.nextInt(1, 11);
            System.out.print(sorteados+"\t");
            if (sorteados == numero_principal) {
            counter++;
            }
        }

        //Bloco 3: Comunica recebimento e valor do prêmio
        System.out.println();

        if (counter >= 3) {
            System.out.println("Parabéns! Você ganhou um prêmio no valor de: "+premio+"€\n");
        }
        else {
            System.out.println("Não foi desta vez. Tente novamente.\n");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("Bem-vindo!");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1 - Lotaria");
            System.out.println("2 - Raspadinhas Tipo 1");
            System.out.println("3 - Raspadinhas Tipo 2");
            System.out.println("0 - Sair");
            option = in.nextInt();

            if (option == 0) {
                return;
            }

            else if (option == 1) {
                Lotaria();
            }
            else if (option == 2) {
                Raspadinhas1();
            }
            else if (option == 3) {
                Raspadinhas2();
            }
            else {
                System.out.println("Opção inválida");
            }
        } while (option != 0);
    }
}