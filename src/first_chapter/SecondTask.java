package first_chapter;

class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Возраст - " + this.age + "\nИмя - " + this.name;
    }
}

public class SecondTask {
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
