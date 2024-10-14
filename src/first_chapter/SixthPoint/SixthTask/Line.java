package first_chapter.SixthPoint.SixthTask;

public class Line {

    private Point firstPoint;
    private Point secondPoint;

    Line(Point firstPoint, Point secondPoint) {
        setFirstPoint(firstPoint);
        setSecondPoint(secondPoint);
    }

    Line(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public String toString() {
        return "Линия от " + firstPoint + " до " + secondPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = new Point(firstPoint.x, firstPoint.y);
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = new Point(secondPoint.x, secondPoint.y);
    }

    Point getSecondPoint() {
        return secondPoint;
    }

    Point getFirstPoint() {
        return firstPoint;
    }

    public double length() {
        return Math.sqrt(Math.pow(firstPoint.x - secondPoint.x, 2) + Math.pow((firstPoint.y + secondPoint.y), 2));
    }
}
