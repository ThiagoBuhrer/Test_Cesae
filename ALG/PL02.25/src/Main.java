import java.util.Scanner;

public class Main {
    public static boolean is_leap_year(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println(year + (is_leap_year(year) ? " é um ano bissexto." : " não é um ano bissexto."));
    }
}