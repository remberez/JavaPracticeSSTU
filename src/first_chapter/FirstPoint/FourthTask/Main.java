package first_chapter.FirstPoint.FourthTask;

public class Main {
    public static void main(String[] args) {
        Time[] times = {
                new Time(10),
                new Time(10000),
                new Time(100000),
        };

        for (var time: times) {
            System.out.println(time);
        }
    }
}
