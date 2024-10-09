package first_chapter;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class FirstTask {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        for (int i = 0; i < 3; i++) {
            points[i] = new Point(
                    (i + 3) * 1.5,
                    (i + 3) * 1.7
            );
        }

        for (var point: points) {
            System.out.println(point);
        }
    }
}
