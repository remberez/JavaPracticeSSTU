package first_chapter.SixthPoint.SixthTask;

public class Main {
    public static void main(String[] args) {
        var p1 = new Point(1, 2);
        var line1 = new Line(p1, p1);
        var line2 = new Line(p1, p1);

        System.out.println(line1.getFirstPoint().hashCode());
        System.out.println(line2.getFirstPoint().hashCode());
    }
}
