package first_chapter.ThirdPoint.ThirdTask;

import java.util.HashMap;

public class City {
    String name;
    HashMap<City, Integer> paths;

    City(String name) {
        this.name = name;
        paths = new HashMap<>();
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String printPaths() {
        return this.name + ": " + paths.toString();
    }
}
