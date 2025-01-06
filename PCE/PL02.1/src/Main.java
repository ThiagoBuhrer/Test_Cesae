import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void Read1() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            String line;

        /*
        While the line read from br (BufferedReader) is not null, continue executing the code inside the loop.
        The line is assigned the value returned by readLine(), and if it's not null, the loop continues.
        In Java, null represents the absence of a value or an object reference.
         */

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("Erro no ficheiro");
        }
        System.out.println();
    }


    public static void Read2() {

        //OBS: an alternative way to do this one would be simply using the Files.readString() class.

        ArrayList<String> lines = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            for (String content : lines) {
                System.out.println();
                System.out.println(content);
            }
        }catch (IOException e) {
            System.out.println("Erro no ficheiro");
        }
    }

    public static void Write1() {

        Scanner input = new Scanner(System.in);

        /*
        Nesta função Write1, permito o usuário escrever duas linhas no ficheiro.
        Ao final do primeiro input, eu coloco bw.newLine() para fazer uma quebra de linha e indicar que o próximo input será inserido na próxima linha.
        Também coloquei o value de append como "true". Isso indica que o texto inserido será concatenado ao final do texto existente no ficheiro.
        Note que é necessário inserir bw.close() ao final para concluir a edição de texto.
         */

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt", true));
            System.out.println("Escreva uma linha de texto: ");
            bw.write(input.nextLine());
            bw.newLine();
            System.out.println("Escreva outra linha de texto: ");
            bw.write(input.nextLine());
            bw.close();
        }catch (IOException e) {
            System.out.println("Erro no ficheiro");
        }
    }

    public static void Write2() {

        // Objetivo é preencher um array de strings e escrever cada linha num ficheiro.
        // Eu escolhi utilizar o input do usuário.

        Scanner input = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<>();

        System.out.println("Escreva uma linha de texto: ");
        text.add(input.nextLine());
        System.out.println("Escreva uma segunda linha de texto: ");
        text.add(input.nextLine());
        System.out.println("Escreva uma terceira linha de texto: ");
        text.add(input.nextLine());

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt", true));
            for (int i = 0; i < text.size(); i++) {
                bw.write(text.get(i));
                bw.newLine(); //adiciona quebra de linha a cada iteração para não concatenar
            }
            bw.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Choose an option:");
            System.out.println("1 - Ler um ficheiro para uma string");
            System.out.println("2 - Ler ficheiro para um array de strings");
            System.out.println("3 - Escrever no ficheiro");
            System.out.println("4 - Preencher array de strings e escrever no ficheiro");
            System.out.println("0 - Sair");

            switch (option = input.nextInt()) {

                case 1:
                    Read1();
                    break;
                case 2:
                    Read2();
                    break;
                case 3:
                    Write1();
                    break;
                case 4:
                    Write2();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while (option != 0);
    }
}