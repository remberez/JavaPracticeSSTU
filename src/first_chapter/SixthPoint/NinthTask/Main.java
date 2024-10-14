package first_chapter.SixthPoint.NinthTask;

public class Main {
    public static void main(String[] args) {
        try {
            var s = new Student("Артём", 6, 6, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
