package first_chapter.FifthPoint.SeventhTask;

public class Main {
    public static void main(String[] args) {
        var broken = new Broken(
                new Point(1, 2),
                new Point(2, 8),
                new Point(5, 3)
        );

        System.out.println(broken.length());

        broken.add(new Point(5, 15), new Point(8, 10));
        System.out.println(broken.length());
    }
}
