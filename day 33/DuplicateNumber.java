import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean found = false;

        System.out.print("Duplicate number(s): ");

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.print("No duplicate number");
        }

        scanner.close();
    }
}