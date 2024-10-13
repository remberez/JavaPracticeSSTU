package first_chapter.SecondPoint.ThirdTask;

public class Main {
    public static void main(String[] args) {
        var human1 = new Human("Чудов", "Иван", null, 177, null);
        var human2 = new Human("Чудов", "Петр", null, 177, human1);
        var human3 = new Human(null, "Борис", null, 177, human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
