import java.util.Scanner;

public class Main {

    Static Scanner in = new Scanner(System.in);
    Static int[] numeros = new int [];


    public static void OrdenarCrescente() {



    }

    public static void OrdenarDecrescente() {



    }

    public static void Imprimir() {



    }

    public static void Concatenar() {



    }

    public static void Adicionar() {



    }

    public static void Substituir() {



    }

    public static void Remover() {



    }


    public static void main(String[] args) {

        int option;

        //Neste block armazeno os valores escolhidos pelo usuário dentro do Array.

        for (i = 0; i < num1; i++) {
            for (j = 0; j < num2; j++) {
                System.out.print("Enter a value for line " + (i + 1) + " and column " + (j + 1) +" : ");
                multidimensional[i][j] = in.nextInt();
                sumTotal += multidimensional[i][j];
            }
        }

        do {

            System.out.println(" Bem-vindo! ");
            System.out.println(" Escolha uma opção ");
            System.out.println(" 1 - Ordenar crescente ");
            System.out.println(" 2 - Ordenar descrescente ");
            System.out.println(" 3 - Imprimir ");
            System.out.println(" 4 - Concatenar ");
            System.out.println(" 5 - Substituir posição ");
            System.out.println(" 6 - Adicionar posição ");
            System.out.println(" 7 - Remover posição ");
            System.out.println(" 0 - Sair ");
            option = in.nextInt();

            if (option == 0) break;
            else if (option == 1) OrdenarCrescente();
            else if (option == 2) OrdenarDecrescente();
            else if (option == 3) Imprimir();
            else if (option == 4) Concatenar();
            else if (option == 5) Adicionar();
            else if (option == 6) Substituir();
            else if (option == 7) Remover();

        }while (option != 0);





    }
}