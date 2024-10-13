package first_chapter.FifthPoint.SixthTask;

public class Main {
    public static void main(String[] args) {
        var student1 = new Student("Вася", 3, 4, 5, 4);
        var student2 = new Student("Петя", 5, 5, 5, 5);

        System.out.println(student1.avgScore());
        System.out.println(student2.avgScore());

        System.out.println(student1.amIExcellent());
        System.out.println(student2.amIExcellent());
    }
}
