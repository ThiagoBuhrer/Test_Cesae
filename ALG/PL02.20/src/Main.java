import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);

        int total_years;
        int total_months;
        int total_days;

        System.out.println("Insira o número de dias: ");
        int days_ammount = days.nextInt();

        if (days_ammount > 0) {
            total_years = days_ammount / 365;
            total_months = days_ammount / 30;
            total_days = days_ammount;
            System.out.println("Number of years is: " + total_years + ". Number of months is: " + total_months + ". Number of days is: " + total_days);
        }
    }
}
