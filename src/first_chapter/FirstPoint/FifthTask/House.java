package first_chapter.FirstPoint.FifthTask;

public class House {
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
