package first_chapter.SecondPoint.FirstTask;

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