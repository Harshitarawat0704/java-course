import java.util.Scanner;

public class FindPeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak = arr[0];

        // Check every element
        for (int i = 1; i < n - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peak = arr[i];
                break;
            }
        }

        // Check last element
        if (n > 1 && arr[n - 1] > arr[n - 2]) {
            peak = arr[n - 1];
        }

        System.out.println("Peak Element = " + peak);

        sc.close();
    }
}
