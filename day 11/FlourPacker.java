public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if ((bigCount * 5) + smallCount < goal) {
            return false;
        }

        int bigBagsToUse = Math.min(bigCount, goal / 5);

        int remaining = goal - (bigBagsToUse * 5);

        return smallCount >= remaining;
    }

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));    // false
        System.out.println(canPack(1, 0, 5));    // true
        System.out.println(canPack(0, 5, 4));    // true
        System.out.println(canPack(2, 2, 11));   // true
        System.out.println(canPack(-3, 2, 12));  // false
    }
}