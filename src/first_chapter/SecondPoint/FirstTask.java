package first_chapter.SecondPoint;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + ";" + y;
    }
}

class Line {
    private Point firstPoint;
    private Point secondPoint;

    Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
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

public class FirstTask {
    public static void main(String[] args) {
        Line firstLine = new Line(new Point(1, 3), new Point(23, 8));
        Line secondLine = new Line(new Point(5, 10), new Point(25, 10));
        Line thirdLine = new Line(firstLine.getFirstPoint(), secondLine.getSecondPoint());

        /// С изменениями
        firstLine.setFirstCord(334, 767);
        secondLine.setSecondCord(666, 888);
        System.out.println(thirdLine);

        /// Без изменений
        firstLine.setFirstPoint(new Point(333, 777));
        System.out.println(thirdLine);
    }
}
