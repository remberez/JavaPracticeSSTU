package first_chapter.FourthPoint.EighthTask;

import java.util.HashMap;

public class City {
    String name;
    HashMap<String, Integer> paths;

    City(String name) {
        this.name = name;
        paths = new HashMap<>();
    }

    City(String name, HashMap<String, Integer> paths) {
        this.name = name;
        this.paths = paths;
    }

    @Override
    public String toString() {
        return this.name + ": " + paths.toString();
    }
}