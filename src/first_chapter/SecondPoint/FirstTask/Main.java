package first_chapter.SecondPoint.FirstTask;

public class Main {
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
