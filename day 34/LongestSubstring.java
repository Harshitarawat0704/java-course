import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            String current = "";

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (current.indexOf(ch) != -1) {
                    break;
                }

                current += ch;

                if (current.length() > maxLength) {
                    maxLength = current.length();
                }
            }
        }

        System.out.println("Longest substring length: " + maxLength);

        scanner.close();
    }
}