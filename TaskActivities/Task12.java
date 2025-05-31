package TaskActivities;

public class Task12 {
    public static void main(String[] args) {
        Point pI = new Point(32, 32);

        for (int i = 0; i< 5; i++) {
            pI.scaleDown();
            pI.display();
        }
    }
}

class Point {
    private double X;
    private double Y;

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public void display() {
        System.out.println("(" + X + ", " + Y + ")");
    }

    public void scaleDown() {
        X /= 2;
        Y /= 2;
    }
}
