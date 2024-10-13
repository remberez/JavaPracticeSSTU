package first_chapter.FourthPoint.SecondTask;

public class Line {

    private Point firstPoint;
    private Point secondPoint;

    Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    Line(double x1, double y1, double x2, double y2) {
        this.firstPoint = new Point(x1, y1);
        this.secondPoint = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return "Линия от " + firstPoint + " до " + secondPoint;
    }

    Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    Point getSecondPoint() {
        return secondPoint;
    }

    public void setFirstCord(int x, int y) {
        firstPoint.x = x;
        firstPoint.y = y;
    }

    public void setSecondCord(int x, int y) {
        secondPoint.x = x;
        secondPoint.y = y;
    }
}