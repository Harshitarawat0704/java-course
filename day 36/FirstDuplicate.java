import java.util.HashSet;

public class FirstDuplicate {

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println("First duplicate: " + num);
                return;
            }

            set.add(num);
        }

        System.out.println("No duplicate found");
    }
}