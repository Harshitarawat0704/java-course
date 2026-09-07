import java.util.Scanner;

public class MissingRepeating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // visited[i] tells whether number i was found
        boolean[] visited = new boolean[n + 1];

        int repeating = -1;
        int missing = -1;

        // Find repeating number
        for (int i = 0; i < n; i++) {

            if (visited[arr[i]]) {
                repeating = arr[i];
            } else {
                visited[arr[i]] = true;
            }
        }

        // Find missing number
        for (int i = 1; i <= n; i++) {

            if (!visited[i]) {
                missing = i;
                break;
            }
        }

        System.out.println("Repeating Number = " + repeating);
        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}