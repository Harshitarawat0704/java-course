import java.util.Scanner;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        // Check range
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        // Extract digits
        int digit1 = number1 / 10;
        int digit2 = number1 % 10;
        int digit3 = number2 / 10;
        int digit4 = number2 % 10;

        // Check if any digit matches
        return (digit1 == digit3) ||
               (digit1 == digit4) ||
               (digit2 == digit3) ||
               (digit2 == digit4);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (10-99): ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number (10-99): ");
        int number2 = sc.nextInt();

        boolean result = hasSharedDigit(number1, number2);

        System.out.println("Result: " + result);

        sc.close();
    }
}
