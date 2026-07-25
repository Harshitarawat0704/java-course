import java.util.Scanner;

public class PalindromeNumber{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number, originalNumber, reverse = 0, digit;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        originalNumber = number;

        while (number > 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome Number.");
        }

        scanner.close();
    }
}