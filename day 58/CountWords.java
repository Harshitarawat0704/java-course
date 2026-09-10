import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Remove extra spaces from beginning/end
        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            System.out.println("Number of words = 0");
        } else {

            // Split sentence wherever there are one or more spaces
            String[] words = sentence.split("\\s+");

            System.out.println("Number of words = " + words.length);
        }

        sc.close();
    }
}