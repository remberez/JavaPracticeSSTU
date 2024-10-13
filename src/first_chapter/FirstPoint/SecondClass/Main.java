package first_chapter.FirstPoint.SecondClass;

public class Main {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Клеопатра", 152),
                new Human("Пушкин", 167),
                new Human("Владимир", 189),
        };

        for (var human: humans) {
            System.out.println(human);
        }
    }
}
