public class NumberToWords {

    public static int reverse(int number) {

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= number; i *= 10) {
            count++;
        }

        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversed = reverse(number);
        int leadingZeros = getDigitCount(number) - getDigitCount(reversed);

        while (reversed != 0) {

            int digit = reversed % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversed /= 10;
        }

        for (int i = 0; i < leadingZeros; i++) {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {

        System.out.println("numberToWords(123):");
        numberToWords(123);

        System.out.println();

        System.out.println("numberToWords(1010):");
        numberToWords(1010);

        System.out.println();

        System.out.println("numberToWords(1000):");
        numberToWords(1000);

        System.out.println();

        System.out.println("numberToWords(0):");
        numberToWords(0);

        System.out.println();

        System.out.println("numberToWords(-12):");
        numberToWords(-12);
    }
}