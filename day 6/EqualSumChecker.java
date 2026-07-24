import  java.util.Scanner;

public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return (num1 + num2) == num3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        boolean result = hasEqualSum(num1, num2, num3);

        System.out.println("Result: " + result);

        sc.close();
    }
}
    
