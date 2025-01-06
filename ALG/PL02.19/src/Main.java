import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hours = new Scanner(System.in);

        System.out.println("Insert number of hours: ");
        int hours_ammount = hours.nextInt();

        if (hours_ammount > 0) {
            hours_ammount = hours_ammount * 3600;
            System.out.println("Number of seconds is: " + hours_ammount);
        }
    }
}