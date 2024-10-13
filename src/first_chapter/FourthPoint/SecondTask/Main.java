package first_chapter.FourthPoint.SecondTask;

public class Main {
    public static void main(String[] args) {
        var line1 = new Line(1, 3, 23, 8);
        var line2 = new Line(5, 10, 25, 10);
        var line3 = new Line(line1.getFirstPoint().x, 3, line1.getSecondPoint().x, 8);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}
