
public class Main {
    public static void main(String[] args) {

        for (int week = 1; week <= 10; week++) {
            System.out.println("Week " + week + " : "
                    + (week % 2 == 0 ? "Even Week" : "Odd Week"));
        }
    }
}