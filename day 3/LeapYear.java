import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) ||
               (year % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean result = isLeapYear(year);

        System.out.println("Is Leap Year: " + result);

        scanner.close();
    }
}