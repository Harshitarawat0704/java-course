import java.util.*;

public class RearrangePositiveNegative {

    public static void main(String[] args) {

        int[] arr = {1, 2, -3, -4, 5, -6};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separate positive and negative
        for (int x : arr) {
            if (x >= 0)
                positive.add(x);
            else
                negative.add(x);
        }

        int p = 0, n = 0;

        // Arrange alternately
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0 && p < positive.size()) {
                arr[i] = positive.get(p++);
            }
            else if (n < negative.size()) {
                arr[i] = negative.get(n++);
            }
            else if (p < positive.size()) {
                arr[i] = positive.get(p++);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
