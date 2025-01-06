import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int Lotaria(int saldo, String nome) {

        //Limite mínimo = 1000, Limite máximo = 10.000
        Scanner in = new Scanner(System.in);

        saldo -= 5;
        int premio_1 = 100;
        int premio_2 = 50;
        int premio_3 = 25;

        System.out.println("Insira um valor entre 1.000 a 100.000: ");
        int valor = in.nextInt();

        Random rnd = new Random();
        int n1 = rnd.nextInt(1000, 100001);
        int ultimosTresDigitos = n1 % 1000;
        int ultimosDoisDigitos = n1 % 100;

        System.out.println("\nNúmero gerado: " + n1 + "\n");

        if (valor == n1) {
            System.out.println("Parabéns, "+ nome +"! Você ganhou o prêmio máximo!\n");
            saldo += premio_1;
        } else if (valor % 1000 == ultimosTresDigitos) {
            System.out.println("Parabéns, "+ nome +"! Você ganhou o segundo prêmio!\n");
            saldo += premio_2;
        } else if (valor % 100 == ultimosDoisDigitos) {
            System.out.println("Parabéns, "+ nome +"! Você ganhou o terceiro prêmio!\n");
            saldo += premio_3;
        } else {
            System.out.println("Não foi desta vez, "+ nome +". Tente novamente!\n");
        }
        return (saldo);
    }

    public static int Raspadinhas1(int saldo, String nome) {

        Scanner in = new Scanner(System.in);
        saldo -= 2;

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
                premio += saldo;
                return saldo;
            }
            else if (premio <= 0) {
                System.out.println("Você não acumulou nenhum prêmio, "+ nome +". Tente novamente.\n");
                return saldo;
            }
        }
        return (saldo);
    }

    public static int Raspadinhas2(int saldo, String nome) {

        Scanner in = new Scanner(System.in);
        saldo -= 2;

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
            System.out.println("Parabéns, "+ nome +"! Você ganhou um prêmio no valor de: "+premio+"€\n");
            saldo += premio;
            return (saldo);
        }
        else {
            System.out.println("Não foi desta vez, "+ nome +". Tente novamente.\n");
            return (saldo);
        }
    }

    public static int Deposito (int saldo) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o montante: ");
        int deposito = in.nextInt();
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Depositou "+ deposito +"€ com sucesso.\n");
            return (saldo);
        }
        else {
            System.out.println("Valor inserido é inválido.\n");
            return (saldo);
        }
    }

    public static int Levantamento (int saldo) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o montante a ser levantado: ");
        int levantamento = in.nextInt();
        if (levantamento > 0 && levantamento <= saldo) {
            saldo -= levantamento;
            System.out.println("Levantou "+ levantamento +"€ com sucesso.\n");
            return (saldo);
        }
        else {
            System.out.println("Valor inserido é inválido ou não há crédito o suficiente.\n");
            return (saldo);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int option = 0;
        int saldo = 100;

        System.out.println("Bem vindo! Insira o seu nome: ");
        String nome = in.nextLine();

        do {
            System.out.println();
            System.out.println("Olá, " + nome +". Seu saldo atual é de "+saldo+"€\n");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1 - Lotaria");
            System.out.println("2 - Raspadinhas Tipo 1");
            System.out.println("3 - Raspadinhas Tipo 2");
            System.out.println("4 - Fazer depósito");
            System.out.println("5 - Fazer levantamento");
            System.out.println("0 - Sair");
            option = in.nextInt();

            if (saldo > 0) {
                if (option == 0) {
                    return;
                } else if (option == 1) {
                    saldo = Lotaria(saldo, nome);
                } else if (option == 2) {
                    saldo = Raspadinhas1(saldo, nome);
                } else if (option == 3) {
                    saldo = Raspadinhas2(saldo, nome);
                } else if (option == 4) {
                    saldo = Deposito(saldo);
                } else if (option == 5) {
                    saldo = Levantamento(saldo);
                } else {
                    System.out.println("Opção inválida");
                }
            }
            else {
                System.out.println("\nAtenção: saldo insuficiente");
            }
        } while (option != 0);
    }
}