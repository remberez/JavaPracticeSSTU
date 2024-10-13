package first_chapter.FourthPoint.FifthTask;

public class Main {
    public static void main(String[] args) {
        Name[] names = {
                new Name("Клеопатра"),
                new Name("Пушкин", "Александр", "Сергеевич"),
                new Name("Маяковский", "Владимир"),
                new Name("Бонифатьевич", "Христофор"),
        };

        for (var name: names) {
            System.out.println(name);
        }
    }
}
