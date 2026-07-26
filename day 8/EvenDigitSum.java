import java.util.Scanner;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit % 2 == 0) {
                sum = sum + digit;
            }

            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = getEvenDigitSum(number);

        System.out.println("Sum of even digits = " + result);

        sc.close();
    }
}