import java.util.Scanner;

public class BarkingDog {

    // This method checks whether we should wake up
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // Check if the hour is valid
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // Wake up only if the dog is barking
        // AND the time is before 8 or after 22
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        // In all other cases
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Is the dog barking? (true/false): ");
        boolean barking = sc.nextBoolean();

        System.out.print("Enter the hour of the day (0-23): ");
        int hourOfDay = sc.nextInt();

        // Call the method
        boolean answer = shouldWakeUp(barking, hourOfDay);

        // Print the result
        if (answer) {
            System.out.println("Wake up!");
        } else {
            System.out.println("Don't wake up.");
        }

        sc.close();
    }
}