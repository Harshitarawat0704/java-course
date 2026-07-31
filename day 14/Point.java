public class Point {

    private int x;
    private int y;

    // No-argument constructor
    public Point() {
        this(0, 0);
    }

    // Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }

    public double distance(int x, int y) {
        int xDistance = this.x - x;
        int yDistance = this.y - y;

        return Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));
    }

    // Main method for VS Code testing only
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}