package first_chapter.ThirdPoint.SecondTask;

import java.util.Arrays;

public class Broken {
    Point[] points;

    Broken(Point ... points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Ломанная{" +
                "точки" + Arrays.toString(points) +
                '}';
    }
}
