import java.util.*;

public class WordBreak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter number of dictionary words: ");
        int n = sc.nextInt();

        Set<String> dict = new HashSet<>();

        System.out.println("Enter dictionary words:");

        for (int i = 0; i < n; i++) {
            dict.add(sc.next());
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        System.out.println("Can be broken: " + dp[s.length()]);

        sc.close();
    }
}