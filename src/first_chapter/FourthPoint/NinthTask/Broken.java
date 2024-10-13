package first_chapter.FourthPoint.NinthTask;
import java.util.Arrays;

public class Broken {
    Point[] points;

    Broken(Point... points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Ломанная{" +
                "точки" + Arrays.toString(points) +
                '}';
    }
}
