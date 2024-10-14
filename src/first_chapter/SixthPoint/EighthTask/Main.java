package first_chapter.SixthPoint.EighthTask;

public class Main {
    public static void main(String[] args) {
        var human = new Human(
                new Name("Агасян", "Артём", null),
                170,
                new Human("Армен", 180)
        );

        System.out.println(human.getName());
    }
}
