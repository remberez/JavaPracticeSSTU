package first_chapter.ThirdPoint.ThirdTask;

public class Main {
    public static void main(String[] args) {
        City[] cities = {
                new City("A"),
                new City("B"),
                new City("C"),
                new City("D"),
                new City("E"),
                new City("F"),
        };

        // C
        cities[2].paths.put(cities[3], 4);
        cities[2].paths.put(cities[1], 3);

        // D
        cities[3].paths.put(cities[2], 4);
        cities[3].paths.put(cities[4], 2);
        cities[3].paths.put(cities[0], 6);

        // E
        cities[5].paths.put(cities[3], 2);
        cities[5].paths.put(cities[0], 6);

        // A
        cities[0].paths.put(cities[3], 6);
        cities[0].paths.put(cities[1], 5);
        cities[0].paths.put(cities[5], 1);

        // B
        cities[1].paths.put(cities[0], 5);
        cities[1].paths.put(cities[5], 1);
        cities[1].paths.put(cities[2], 3);

        // F
        cities[5].paths.put(cities[0], 1);
        cities[5].paths.put(cities[1], 1);
        cities[5].paths.put(cities[4], 2);

        for (var city: cities) {
            System.out.println(city.printPaths());
        }
    }
}
