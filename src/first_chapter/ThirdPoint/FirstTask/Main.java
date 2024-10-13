package first_chapter.ThirdPoint.FirstTask;

public class Main {
    public static void main(String[] args) {
        var student1 = new Student("Вася", 3, 4, 5);
        var student2 = new Student("Петя", student1.exams);

        student2.exams[0] = 5;

        System.out.println(student1);
        System.out.println(student2);

        // student1.exams -----> int[3] {3, 4, 5}
        // student2.exams -------↗

        var student3 = new Student("Андрей", student1.exams.clone());
        student3.exams[0] = 6;

        // student1.exams -----> int[3] {3, 4, 5}
        // student2.exams -----> int[3] {3, 4, 5} (новая область в памяти)
    }
}
