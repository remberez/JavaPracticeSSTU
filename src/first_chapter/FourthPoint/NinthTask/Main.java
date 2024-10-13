package first_chapter.FourthPoint.NinthTask;

public class Main {
    public static void main(String[] args) {
        Broken[] brokens = {
                new Broken(),
                new Broken(new Point(1, 2)),
                new Broken(new Point(1, 2), new Point(3, 4)),
                new Broken(new Point(1, 2), new Point(3, 4), new Point(3, 11)),
        };

        for (var broken: brokens) {
            System.out.println(broken);
        }
    }
}
