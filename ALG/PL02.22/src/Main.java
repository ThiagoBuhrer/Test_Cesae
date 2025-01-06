import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner megabytes_number = new Scanner(System.in);

        int bytes;
        int megabytes;

        //Converter bytes em bits. 1 byte é igual 8 bits.
        System.out.println("Insert number of bytes: ");
        megabytes = megabytes_number.nextInt();

        if (megabytes >= 0) {
            bytes = megabytes * 1048576;
            System.out.println("Number of bytes is: "+ bytes);
        }
    }
}