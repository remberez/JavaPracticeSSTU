package first_chapter.SixthPoint.ThirdTask;

import java.util.ArrayList;
import java.util.Collections;

public class Broken {
    final ArrayList<Point> points = new ArrayList<>();

    public Broken(Point... points) {
        add(points);
    }

    public void add(Point... points) {
        Collections.addAll(this.points, points);
    }

    public double length() {
        double length = 0;
        for (int i = 0; i < this.points.size() - 1; i++) {
            length += Math.sqrt(
                    Math.pow(
                            this.points.get(i).x - this.points.get(i + 1).x, 2
                    ) +
                    Math.pow(
                            this.points.get(i).y - this.points.get(i + 1).y, 2
                    )
            );
        }
        return length;
    }

    @Override
    public String toString() {
        return "Ломанная{" +
                "точки" + points.toString() +
                '}';
    }
}
