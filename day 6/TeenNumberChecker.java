import java.util.Scanner;

public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) ||
               (num2 >= 13 && num2 <= 19) ||
               (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("hasTeen: " + hasTeen(num1, num2, num3));

        System.out.print("Enter one number to check isTeen: ");
        int num = sc.nextInt();

        System.out.println("isTeen: " + isTeen(num));

        sc.close();
    }
}