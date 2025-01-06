import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int result;
        result = 0;

        System.out.println("Insert number 1: ");
        int num1 = num.nextInt();
        System.out.println("Insert number 2: ");
        int num2 = num.nextInt();

        for (int i = 0; i < Math.abs(num2); i++) {
            result += Math.abs(num1);
        }
        if ((num1 < 0 && num2 < 0) || (num1 > 0 && num2 > 0)) {
            System.out.println("Result is: "+ result);
        }
        else {
            System.out.println("Result is: -" + result);
        }
    }
}