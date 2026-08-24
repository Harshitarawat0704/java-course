import java.util.Scanner;

public class ArrayUnion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.print("Union: ");

        // Print elements of first array
        for (int i = 0; i < n1; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(a[i] + " ");
            }
        }

        // Print unique elements of second array
        for (int i = 0; i < n2; i++) {

            boolean alreadyPresent = false;

            for (int j = 0; j < n1; j++) {
                if (b[i] == a[j]) {
                    alreadyPresent = true;
                    break;
                }
            }

            for (int j = 0; j < i; j++) {
                if (b[i] == b[j]) {
                    alreadyPresent = true;
                    break;
                }
            }

            if (!alreadyPresent) {
                System.out.print(b[i] + " ");
            }
        }

        sc.close();
    }
}
