import java.util.Scanner;

public class  FirstLastDigitSum{

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = sumFirstAndLastDigit(number);

        System.out.println("Sum of first and last digit = " + result);

        sc.close();
    }
}