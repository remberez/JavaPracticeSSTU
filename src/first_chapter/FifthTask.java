package first_chapter;

class House {
    private final int floor;
    House(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        for (int i = 0; i < floor; i++) {
            System.out.println("|------------------|");
            System.out.println("|                  |");
            System.out.println("|  ----      ----  |");
            System.out.println("|  |  |      |  |  |");
            System.out.println("|  ****      ****  |");
            System.out.println("|                  |");
        }
        System.out.println("|------------------|");
        return "";
    }
}

public class FifthTask {
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
