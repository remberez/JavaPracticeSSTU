package first_chapter.FirstPoint.SecondClass;

public class Human {
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
