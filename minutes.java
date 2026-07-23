import java.util.Scanner;

public class minutes {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long totalDays = minutes / (60 * 24);
        long years = totalDays / 365;
        long days = totalDays % 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        long minutes = sc.nextLong();

        printYearsAndDays(minutes);

        sc.close();
    }
}
