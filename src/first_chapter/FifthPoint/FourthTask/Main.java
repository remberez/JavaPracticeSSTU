package first_chapter.FifthPoint.FourthTask;

public class Main {
    public static void main(String[] args) {
        var time1 = new Time(34056);
        var time2 = new Time(4532);
        var time3 = new Time(123);

        System.out.println(time1.getHours());
        System.out.println(time2.getMinutes());
        System.out.println(time3.getSeconds());
    }
}
