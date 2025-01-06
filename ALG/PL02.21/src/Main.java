import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bytes_number = new Scanner(System.in);

        int bits;
        int bytes;

        //Converter bytes em bits. 1 byte é igual 8 bits.
        System.out.println("Insert number of bytes: ");
        bytes = bytes_number.nextInt();

        if (bytes >= 0) {
            bits = bytes * 8;
            System.out.println("Number of bits is: "+ bits);
        }
    }
}