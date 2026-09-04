import java.util.Scanner;

public class FindPeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak = -1;

        for (int i = 0; i < n; i++) {

            // First element
            if (i == 0 && arr[i] > arr[i + 1]) {
                peak = arr[i];
                break;
            }

            // Last element
            else if (i == n - 1 && arr[i] > arr[i - 1]) {
                peak = arr[i];
                break;
            }

            // Middle elements
            else if (i > 0 && i < n - 1 &&
                     arr[i] > arr[i - 1] &&
                     arr[i] > arr[i + 1]) {

                peak = arr[i];
                break;
            }
        }

        if (peak != -1) {
            System.out.println("Peak Element = " + peak);
        } else {
            System.out.println("No peak element found.");
        }

        sc.close();
    }
}