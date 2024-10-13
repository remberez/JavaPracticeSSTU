package first_chapter.FirstPoint.FifthTask;

public class Main {
    public static void main(String[] args) {
        House[] houses = {
                new House(1),
                new House(5),
                new House(23),
        };

        for (var house: houses) {
            System.out.println(house);;
        }
    }
}
