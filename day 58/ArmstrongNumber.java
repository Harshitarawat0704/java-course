import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int sum = 0;

        // Count number of digits
        int temp = num;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        temp = num;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + (int) Math.pow(digit, digits);

            temp = temp / 10;
        }

        // Check result
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}