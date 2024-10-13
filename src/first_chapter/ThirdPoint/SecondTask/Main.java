package first_chapter.ThirdPoint.SecondTask;

public class Main {
    public static void main(String[] args) {
        var broken1 = new Broken(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3)
        );

        var broken2 = new Broken(
                broken1.points[0],
                new Point(2, -5),
                new Point(4, -8),
                broken1.points[broken1.points.length - 1]
        );

        broken1.points[0].y++;
        broken1.points[broken1.points.length - 1].y++;

        System.out.println(broken1);
        System.out.println(broken2);
    }
}
