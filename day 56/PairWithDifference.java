import java.util.Scanner;

public class PairWithDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter difference K: ");
        int k = sc.nextInt();

        boolean found = false;

        // Check every pair
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (Math.abs(arr[i] - arr[j]) == k) {

                    System.out.println("Pair found: "
                            + arr[i] + " and " + arr[j]);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
