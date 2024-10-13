package first_chapter.FifthPoint.EigthTask;

public class Square {
    Point point;
    int length;

    Square(Point point, int length) {
        this.length = length;
        this.point = point;
    }

    Square(double x, double y, int length) {
        this(new Point(x, y), length);
    }

    public Broken getBroken() {
        return new Broken(
                this.point,
                new Point(this.point.x + length, this.point.y),
                new Point(this.point.x + length, this.point.y - length),
                new Point(this.point.x, this.point.y - length)
        );
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + this.point + " со стороной длиной " + this.length;
    }
}
