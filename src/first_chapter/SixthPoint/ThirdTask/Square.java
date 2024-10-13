package first_chapter.SixthPoint.ThirdTask;

public class Square {
    Point point;
    private int length;

    Square(Point point, int length) {
        setLength(length);
        this.point = point;
    }

    Square(double x, double y, int length) {
        this(new Point(x, y), length);
    }

    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Ожидалось значение больше 0.");
        }
        this.length = length;
    }

    public int getLength() {
        return length;
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
