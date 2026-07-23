import java.util.Scanner;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            System.out.println("Area = " + area(radius));

        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            System.out.println("Area = " + area(length, width));

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}