import java.util.Scanner;

public class LargestPrime{

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {

                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = getLargestPrime(number);

        if (result == -1) {
            System.out.println("No prime factors found.");
        } else {
            System.out.println("Largest Prime Factor = " + result);
        }

        sc.close();
    }
}