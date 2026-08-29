import java.util.Arrays;
import java.util.Scanner;

public class GroupAnagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        boolean[] used = new boolean[n];

        System.out.println("Grouped Anagrams:");

        for (int i = 0; i < n; i++) {

            if (used[i]) {
                continue;
            }

            System.out.print("[" + words[i]);

            used[i] = true;

            for (int j = i + 1; j < n; j++) {

                if (isAnagram(words[i], words[j])) {
                    System.out.print(", " + words[j]);
                    used[j] = true;
                }
            }

            System.out.println("]");
        }

        sc.close();
    }

    static boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}