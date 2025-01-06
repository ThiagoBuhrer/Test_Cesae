import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*Crie uma aplicação que leia o conteúdo de dois ficheiros (a.txt e b.txt) e troque os seus conteúdos (o primeiro ficheiro deve ficar com o conteúdo do segundo e vice-versa. */

        BufferedReader reader;
        BufferedWriter writer;
        String temp = "";
        String line;

        try {
            //armazenar conteúdo de a.txt numa string temporária
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));

            while ((line = br.readLine()) != null) {
                temp += line + "\n"; // += vai concatenar as diferentes linhas e o "\n" vai saltar para a próxima linhas.
            }
            br.close();

            //escrever conteúdo do b.txt dentro do a.txt que agora está vazio

            reader = new BufferedReader(new FileReader("b.txt"));
            writer = new BufferedWriter(new FileWriter("a.txt"));

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();

            //escrever conteúdo do temp dentro do b.txt que agora está vazio

            writer = new BufferedWriter(new FileWriter("b.txt"));
            writer.write(temp);
            writer.newLine();

            writer.close();
            System.out.println("Troca feita com sucesso.");

            /* OBS: note que não tornei a utilizar o while loop neste bloco porque o temp não só já contém all the content of a, como também já contém todas as quebras de linha.
            */

        }catch (IOException e) {
            System.out.println("Erro no ficheiro: " + e.getMessage());
        }

    }

}