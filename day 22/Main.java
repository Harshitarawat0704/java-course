import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int size = scanner.nextInt();

        int[] numbers = getIntegers(size);

        int[] sortedNumbers = sortIntegers(numbers);

        System.out.println("\nSorted Array (Descending Order):");
        printArray(sortedNumbers);

        scanner.close();
    }

    public static int[] getIntegers(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = array.clone();

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {

                if (sortedArray[i] < sortedArray[i + 1]) {

                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;

                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}