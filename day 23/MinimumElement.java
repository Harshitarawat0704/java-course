import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    // Main method for VS Code
    public static void main(String[] args) {
        int count = readInteger();
        int[] numbers = readElements(count);

        int minimum = findMin(numbers);
        System.out.println("Minimum value = " + minimum);
    }
}
