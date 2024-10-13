package first_chapter.FourthPoint.SeventhTask;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Вася", 3, 4, 5),
                new Student("Андрей"),
        };

        for (var student: students) {
            System.out.println(student);
        }
    }
}
