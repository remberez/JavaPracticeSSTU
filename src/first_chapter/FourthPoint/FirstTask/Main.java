package first_chapter.FourthPoint.FirstTask;

public class Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(3, 5),
                new Point(25, 6),
                new Point(7, 8),
        };

        for (var point: points) {
            System.out.println(point);
        }
    }
}
