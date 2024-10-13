package first_chapter.SecondPoint.SecondTask;

public class Main {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Клеопатра", null, null, 152),
                new Human("Пушкин", "Александр", "Сергеевич", 167),
                new Human("Маяковский", "Владимир", null, 189),
        };

        for (var human: humans) {
            System.out.println(human);
        }
    }
}
