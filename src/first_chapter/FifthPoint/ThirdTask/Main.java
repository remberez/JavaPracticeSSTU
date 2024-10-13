package first_chapter.FifthPoint.ThirdTask;

public class Main {
    public static void main(String[] args) {
        var point = new Line(new Point(1, 1), new Point(10, 15));
        System.out.println(point.length());
    }
}
