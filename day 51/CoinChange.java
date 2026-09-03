
import java.util.Scanner;

public class CoinChange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.println("Enter coin values:");

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        // dp[i] = minimum coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Fill with a value larger than any possible answer
        for (int i = 0; i <= amount; i++) {
            dp[i] = amount + 1;
        }

        // 0 coins are needed to make amount 0
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int j = 0; j < n; j++) {

                if (coins[j] <= i) {

                    dp[i] = Math.min(
                        dp[i],
                        dp[i - coins[j]] + 1
                    );
                }
            }
        }

        if (dp[amount] > amount) {
            System.out.println("Amount cannot be made.");
        } else {
            System.out.println("Minimum coins = " + dp[amount]);
        }

        sc.close();
    }
}
