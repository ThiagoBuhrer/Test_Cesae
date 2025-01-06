import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Embora sejam dez alunos, fiz um string 11 porque por lógica humana
        não existe aluno "zero". Portanto o int i começa em 1, para que o index[0]
        fique vazio e o primeiro nome seja inserido no index[1].
         */

        Scanner in = new Scanner(System.in);
        String[] name = new String[11];

        for (int i = 1; i < name.length; i++) {
            System.out.println("Insira o nome do aluno número "+ i +": ");
            name[i] = in.nextLine();
        }

        int index;
        do {
            System.out.println("Insira o número do aluno: ");
            index = in.nextInt();
            System.out.println("O aluno"+ index +" é: "+ name[index]);
        } while (index != 0);
    }
}