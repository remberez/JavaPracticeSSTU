package first_chapter.FifthPoint.EigthTask;

public class Main {
    public static void main(String[] args) {
        var square = new Square(5, 3, 23);
        var broken = square.getBroken();
        System.out.println(broken.length());
        broken.points.set(broken.points.size() - 1, new Point(15, 25));
        System.out.println(broken.length());
    }
}
