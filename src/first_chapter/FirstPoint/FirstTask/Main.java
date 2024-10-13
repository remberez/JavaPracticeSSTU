package first_chapter.FirstPoint.FirstTask;

public class Main {
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
