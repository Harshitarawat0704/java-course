import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Next Greater Elements:");

        for (int i = 0; i < n; i++) {

            int greater = -1;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    greater = arr[j];
                    break;
                }
            }

            System.out.println(arr[i] + " -> " + greater);
        }

        sc.close();
    }
}
