import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<String> nota1 = new ArrayList<>();
    static ArrayList<String> nota2 = new ArrayList<>();
    static ArrayList<String> exame = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static BufferedWriter bw;
    static BufferedReader br;

    static String temp = "";
    static int n = nomes.size();
    static double soma;
    static double media_1;
    static double media_2;
    static double media_exame;
    static double melhor_nota;
    static double pior_nota;
    static double percentage_positivas_1;
    static double percentage_positivas_2;
    static double percentage_positivas_exame;
    static double percentage_positivas_final;
    static int n_muito_bom;

    public static void DadosAluno() {

        /*Insere nome do aluno na array list nomes, nota do trabalho 1 na array list nota1, nota do trabalho 2 na array list nota 2, e nota do exame na array list exame.
         */

        try {
            bw = new BufferedWriter(new FileWriter("dados_turma.txt", true));
            System.out.println("Insira nome do aluno: ");
            temp = input.nextLine();
            bw.write(temp);
            bw.newLine();
            nomes.add(temp);
            System.out.println("Escreva a nota do aluno no trabalho 1: ");
            temp = input.nextLine();
            bw.write(temp);
            bw.newLine();
            nota1.add(temp);
            System.out.println("Escreva a nota do aluno no trabalho 2: ");
            temp = input.nextLine();
            bw.write(temp);
            bw.newLine();
            nota2.add(temp);
            System.out.println("Escreva a nota do aluno no exame: ");
            temp = input.nextLine();
            bw.write(temp);
            bw.newLine();
            exame.add(temp);
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro no ficheiro" + e.getMessage());
        }
    }


    public static void EditarNota() {

        //Editar aluno ou nota.

        int option = 0;

        System.out.println("Escolha um aluno: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Aluno "+ (i + 1) +" é: "+ nomes.get(i));
        }
        option = input.nextInt();

        do {


        }while (option != 0);


    }


    public static void DadosTurma() {


    }

    public static void Escrever() {


    }

    public static void Ler() {


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir nome e notas do aluno");
            System.out.println("2 - Editar nome ou nota do aluno");
            System.out.println("3 - Exibir dados da turma");
            System.out.println("4 - Escrever dados em um ficheiro");
            System.out.println("5 - Ler dados de um ficheiro");
            System.out.println("0 - Sair");

            switch (option = input.nextInt()) {

                    case 1:
                        DadosAluno();
                        break;
                    case 2:
                        EditarNota();
                        break;
                    case 3:
                        DadosTurma();
                        break;
                    case 4:
                        Escrever();
                        break;
                    case 5:
                        Ler();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
            } while (option != 0);
        }
    }

