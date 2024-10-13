package first_chapter.SixthPoint.FirstTask;

public class House {
    private final int floor;

    House(int floor) {
        if (floor < 1) {
            throw new IllegalArgumentException("Ожидается значение больше нуля.");
        }
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
