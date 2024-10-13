package first_chapter.FourthPoint.SixthTask;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(
                "Лев", 170
        );
        Human human2 = new Human(
                new Name("Пушкин", "Сергей", null), 168, human1
        );
        Human human3 = new Human(
                "Александр", 167, human2
        );

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
